
package br.jogo.entidade;

import br.jogo.bd.BancoDados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jogo {
    private int cod;
    private String titulo;
    private String tipo;
    private int ano;
    private String fabricante;

    public Jogo(int cod, String titulo, String tipo, 
            int ano, String fabricante) {
        this.cod = cod;
        this.titulo = titulo;
        this.tipo = tipo;
        this.ano = ano;
        this.fabricante = fabricante;
    }

    public Jogo() {
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public void inserir() {
        BancoDados bd = new BancoDados();
        Connection con = bd.conectar();
        PreparedStatement inserir = null;
        try {
            inserir = con.prepareStatement("INSERT INTO tab_jogo "
                    + "(titulo, tipo, ano_lancamento, fabricante) "
                    + "VALUES (?, ?, ?, ?)");
            inserir.setString(1, this.titulo);
            inserir.setString(2, this.tipo);
            inserir.setInt(3, this.ano);
            inserir.setString(4, this.fabricante);
            inserir.executeUpdate();
        } catch(SQLException e) {
            System.out.println("Erro 10! " + e.getMessage());
        } finally {
            try {
                inserir.close();
            } catch (SQLException e) {
                System.out.println("Erro 11! " + e.getMessage());
            }
            bd.desconectar();
        }
    }
    
    public static void listar() {
        BancoDados bd = new BancoDados();
        Connection con = bd.conectar();
        Statement consulta = null;
        ResultSet rs = null;
        try {
            consulta = con.createStatement();
            rs = consulta.executeQuery("SELECT * FROM tab_jogo");
            int num = 0;
            System.out.println("Jogos cadastrados:");
            while( rs.next() ) {
                System.out.printf("%d %s", rs.getInt("cod"), "|");
                System.out.printf("%-20s %s", rs.getString("titulo"), "|");
                System.out.printf("%-10s %s", rs.getString("tipo"), "|");
                System.out.printf("%-3s %s",  rs.getInt("ano_lancamento"), "|");
                System.out.printf("%-10s %s", rs.getString("fabricante"), "|\n");
                num++;
            }
            System.out.println(num+" jogos encontrados.");
        } catch(SQLException e) {
            System.out.println("Erro 12! " + e.getMessage());
        } finally {
            try {
                if(consulta != null) consulta.close();
                if(rs != null) rs.close();
            } catch (SQLException e) {
                System.out.println("Erro 13! " + e.getMessage());
            }
            bd.desconectar();
        }
    }
    
    public static void atualizar(Jogo j) {
        BancoDados bd = new BancoDados();
        Connection con = bd.conectar();
        PreparedStatement atualizar = null;
        try {
            atualizar = con.prepareStatement("UPDATE tab_jogo SET "
                    + "titulo = ?, tipo = ?, ano_lancamento = ?, "
                    + "fabricante = ? WHERE cod = ?");
            atualizar.setString(1, j.getTitulo());
            atualizar.setString(2, j.getTipo());
            atualizar.setInt(3, j.getAno());
            atualizar.setString(4, j.getFabricante());
            atualizar.setInt(5, j.getCod());
            atualizar.executeUpdate();
        } catch(SQLException e) {
            System.out.println("Erro 14! " + e.getMessage());
        } finally {
            try {
                atualizar.close();
            } catch (SQLException e) {
                System.out.println("Erro 15! " + e.getMessage());
            }
            bd.desconectar();
        }
    }
    
    public static void remover(Jogo j) {
        BancoDados bd = new BancoDados();
        Connection con = bd.conectar();
        PreparedStatement remover = null;
        try {
            remover = con.prepareStatement("DELETE FROM tab_jogo "
                    + "WHERE cod = ?");
            remover.setInt(1, j.getCod());
            remover.executeUpdate();
        } catch(SQLException e) {
            System.out.println("Erro 15! " + e.getMessage());
        } finally {
            try {
                remover.close();
            } catch (SQLException e) {
                System.out.println("Erro 16! " + e.getMessage());
            }
            bd.desconectar();
        }
    }
    
}
