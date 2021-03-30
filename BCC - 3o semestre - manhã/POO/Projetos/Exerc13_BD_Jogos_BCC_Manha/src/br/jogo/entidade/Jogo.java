
package br.jogo.entidade;

import br.jogo.bd.BancoDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jogo {
    private int cod;
    private String titulo;
    private String tipo;
    private int ano;
    private String fabricante;
    
    private static BancoDados bd = new BancoDados();
    private static PreparedStatement sentenca = null;

    public Jogo() {
    }

    public Jogo(int cod, String titulo, String tipo, 
            int ano, String fabricante) {
        this.cod = cod;
        this.titulo = titulo;
        this.tipo = tipo;
        this.ano = ano;
        this.fabricante = fabricante;
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
        try {
            sentenca = bd.conectar().prepareStatement("INSERT INTO "
                    + "tab_jogo (titulo, tipo, ano_lancamento, fabricante) "
                    + "values (?, ?, ?, ?)");
            sentenca.setString(1, this.titulo);
            sentenca.setString(2, this.tipo);
            sentenca.setInt(3, this.ano);
            sentenca.setString(4, this.fabricante);
            sentenca.executeUpdate();
        } catch(SQLException e) {
            System.out.println("Erro 10! " + e.getMessage());
        } finally {
            try {
                if(sentenca != null) sentenca.close();
                bd.desconectar();
            } catch(SQLException e) {
                System.out.println("Erro 12! " + e.getMessage());
            }
        }
    }
    
    public static void listar() {
        Statement listar = null;
        ResultSet rs = null;
        try {
            listar = bd.conectar().createStatement();
            rs = listar.executeQuery("SELECT * FROM tab_jogo");
            int num = 0;
            System.out.println("Jogos cadastrados:");
            while( rs.next() ) {
                System.out.printf("%d %s", rs.getInt("cod"), "|");
                System.out.printf("%-20s %s", rs.getString("titulo"), "|");
                System.out.printf("%-10s %s", rs.getString("tipo"), "|");
                System.out.printf("%-3s %s", rs.getInt("ano_lancamento"), "|");
                System.out.printf("%-10s %s", rs.getString("fabricante"), "|\n");
                num++;
            }
            System.out.println(num+" jogos encontrados.");
        } catch(SQLException e) {
            System.out.println("Erro 13! " + e.getMessage());
        } finally {
            try {
                if(listar != null) listar.close();
                if(rs != null) rs.close();
                bd.desconectar();
            } catch(SQLException e) {
                System.out.println("Erro 14! " + e.getMessage());
            }
        }
    }
    
    public static void atualizar(Jogo j) {
        try {
            sentenca = bd.conectar().prepareStatement("UPDATE tab_jogo "
                    + "SET titulo = ?, tipo = ?, ano_lancamento = ?, "
                    + "fabricante = ? WHERE cod = ?");
            sentenca.setString(1, j.getTitulo());
            sentenca.setString(2, j.getTipo());
            sentenca.setInt(3, j.getAno());
            sentenca.setString(4, j.getFabricante());
            sentenca.setInt(5, j.getCod());
            sentenca.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro 14! " + e.getMessage());
        } finally {
            try {
                if(sentenca != null) sentenca.close();
                bd.desconectar();
            } catch (SQLException e) {
                System.out.println("Erro 15! " + e.getMessage());
            }
        }
    }
    
    public static void remover(int codRemover) {
        try {
            sentenca = bd.conectar().prepareStatement("DELETE FROM tab_jogo "
                    + "WHERE cod = ?");
            sentenca.setInt(1, codRemover);
            sentenca.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro 16! " + e.getMessage());
        } finally {
            try {
                if(sentenca != null) sentenca.close();
                bd.desconectar();
            } catch (SQLException e) {
                System.out.println("Erro 17! " + e.getMessage());
            }
        }
    }
    
    
}
