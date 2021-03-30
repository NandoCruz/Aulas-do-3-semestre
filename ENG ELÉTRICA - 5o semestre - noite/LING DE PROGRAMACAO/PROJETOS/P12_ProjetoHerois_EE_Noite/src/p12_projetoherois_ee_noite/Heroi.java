
package p12_projetoherois_ee_noite;

public class Heroi {
    // atributos:
    private String uniforme;
    private double altura;
    private double peso;
    
    // método para imprimir os atributos:
    public void imprimir() {
        System.out.println("Uniforme: " + this.uniforme);
        System.out.println("Altura: "   + this.altura);
        System.out.println("Peso: "     + this.peso);
    }
    
    // construtor não parametrizado:
    public Heroi() { }
    
    // construtor parametrizado:
    public Heroi(String uniforme, double altura, double peso) {
        this.setUniforme(uniforme);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public void setUniforme(String uniforme) {
        if(uniforme.length() > 1 && uniforme.length() <= 100) {
            this.uniforme = uniforme;
        } else {
            System.out.println("Erro! Uniforme inválido.");
            System.exit(0); // parar o projeto
        }
    }
    
    public String getUniforme() {
        return this.uniforme;
    }
    
    public void setAltura(double altura) {
        if(altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro! Altura inválida.");
            System.exit(0);
        }
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setPeso(double peso) {
        if(peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Erro! Peso inválido.");
            System.exit(0);
        }
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    
    
} // fim da classe Heroi
