
package br.jogo.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDados {
    private Connection conexao = null;
    
    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/bd_jogos_bcc";
            String usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch(ClassNotFoundException e) {
            System.out.println("Erro 1! " + e.getMessage());
        } catch(SQLException e) {
            System.out.println("Erro 2! " + e.getMessage());
        }
        return conexao;
    }
    
    public boolean isOnline() {
        try {
            if(conexao != null && !conexao.isClosed()) return true;
        } catch (SQLException e) {
            System.out.println("Erro 3! " + e.getMessage());
        }
        return false;
    }
    
    public void desconectar() {
        try{
            if( isOnline() ) conexao.close();
        } catch(SQLException e) {
            System.out.println("Erro 4! " + e.getMessage());
        }
    }
    
}
