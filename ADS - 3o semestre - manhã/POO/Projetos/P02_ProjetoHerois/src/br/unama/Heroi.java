package br.unama;

public class Heroi {
    // 03 atributos:
    private String nome;
    private double peso;
    private double forcaDeAtaque;
    // 01 método:
    double atacar() {
        if(this.peso > 100) {
            return 50.50;
        } else {
            return 25.25;
        }
    } // fim do método atacar

    // construtor não parametrizado:
    Heroi() {
        System.out.println("> Criando um objeto através do " +
                "construtor não parametrizado.");
    }
    // construtor parametrizado:
    Heroi(String nome, double peso, double forca) {
        this.setNome(nome);
        this.setPeso(peso);
        this.setForcaDeAtaque(forca);
    }

    void imprimirAtributos() {
        System.out.println("####################");
        System.out.println("Nome: " +this.nome);
        System.out.println("Peso: " + this.peso);
        System.out.println("Força de ataque: " +
                this.forcaDeAtaque);
    } // fim do imprimir

    public void setNome(String nome) {
        if(nome.length() >= 1 && nome.length() <= 100) {
            this.nome = nome;
        } else {
            System.err.println("Erro! Nome inválido, precisa " +
                "conter no mínimo um caracter e no máximo 100.");
            System.exit(0); // encerra o programa!
        }
    } // fim do setNome

    public String getNome() {
        return this.nome;
    }

    public void setPeso(double peso) {
        if ( peso > 0 ) {
            this.peso = peso;
        } else {
            System.err.println("Erro! O peso precisa ser " +
                    "maior que zero");
            System.exit(0);
        }
    } // fim setPeso
    public double getPeso() {
        return this.peso;
    }

    public void setForcaDeAtaque(double forcaDeAtaque) {
        if(forcaDeAtaque > 0) {
            this.forcaDeAtaque = forcaDeAtaque;
        } else {
            System.err.println("Erro! Força precisa ser " +
                    "maior que zero");
            System.exit(0);
        }
    } // fim setForcaDeAtaque

    public double getForcaDeAtaque() {
        return this.forcaDeAtaque;
    }
} // fim da classe
