
package p02_projetoheroi_bcc_manha;

public class Heroi {
    // 03 atributos:
    private String  nome;
    private boolean superForca;
    private double  velocDeCorrida;
    
    // 01 método:
    void atacar(double dano) {
        System.out.println("Atacando com " + 
                dano + " de dano");
    }
    
    // construtor não parametrizado:
    Heroi() {
        System.out.println("Criando heroi...");
    }
    // construtor parametrizado:
    Heroi(String nome, boolean superForca, 
            double velocDeCorrida) {
        this.setNome(nome);
        this.setSuperForca(superForca);
        this.setVelocDeCorrida(velocDeCorrida);
    }
    
    void imprimir() {
        System.out.println("### ATRIBUTOS ###");
        System.out.println("Nome: " + this.nome);
        System.out.println("Super força: " + this.superForca);
        System.out.println("Velocidade de corrida: " + 
                this.velocDeCorrida);
    }
    
    // métodos de configuração set e get:
    public void setNome(String nome) {
        if(nome.length() >= 1 && nome.length() <= 100) {
            this.nome = nome;
        } else {
            System.err.println("Erro! Nome inválido.");
            System.exit(0); // abortar a execução do programa
        }
    } // fim do setNome
    
    public String getNome() {
        return this.nome;
    } // fim do getNome
    
    public void setSuperForca(boolean superForca) {
        this.superForca = superForca;
    }
    
    public boolean getSuperForca() {
        return this.superForca;
    }
    
    public void setVelocDeCorrida(double veloc) {
        if(veloc > 0) {
            this.velocDeCorrida = veloc;
        } else {
            System.err.println("Erro! Velocidade de corrida "
                    + "inválida");
            System.exit(0);
        }
    } // fim do setVelocDeCorrida
    
    public double getVelocCorrida() {
        return this.velocDeCorrida;
    }
    
} // fim da classe Heroi
