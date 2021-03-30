
package p03_mercado_bcc_manha;

public class Produto {
    // atributos:
    private String nome;
    private double preco;
    private double peso;
    
    // método:
    public double aplicarDesconto(double desconto) {
        double valorComDesconto = this.preco * 
                (100 - desconto) / 100.0;
        return valorComDesconto;
    }

    public Produto() {
    }

    public Produto(String nome, double preco, double peso) {
        this.setNome( nome );
        this.setPreco( preco );
        this.setPeso( peso );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() > 0) {
            this.nome = nome;
        } else {
            System.err.println("Erro! Nome de produto "
                    + "inválido");
            System.exit(0);
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco > 0) {
            this.preco = preco;
        } else {
            System.err.println("Erro! Preço inválido.");
            System.exit(0);
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso > 0) {
            this.peso = peso;
        } else {
            System.err.println("Erro! Peso inválido.");
            System.exit(0);
        }
    }

    
    
} // fim da classe
