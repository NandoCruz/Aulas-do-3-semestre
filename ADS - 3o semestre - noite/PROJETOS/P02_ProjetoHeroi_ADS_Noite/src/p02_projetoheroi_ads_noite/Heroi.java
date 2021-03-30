package p02_projetoheroi_ads_noite;

public class Heroi {

    // 1. atributos:
    private String genero;
    private double forcaAtaque;
    private double altura;
    
    // 10. criar métodos set e get para os atributos:
    public void setGenero(String genero) {
        if(genero.length() >= 1 && genero.length() <= 100) {
            this.genero = genero; // válido!
        } else {
            System.out.println("Erro! Gênero inválido.");
            System.exit(0); // encerra o programa
        }
    } // fim do setGenero
    
    public String getGenero() {
        return this.genero;
    }
    
    public void setForcaAtaque(double forca) {
        if(forca > 0) {
            this.forcaAtaque = forca;
        } else {
            System.out.println("Erro! Força de ataque "
                    + "inválida.");
            System.exit(0);
        }
    } // fim do forcaAtaque
    
    public double getForcaAtaque(){
        return this.forcaAtaque;
    }
    
    public void setAltura(double altura) {
        if(altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro! Altura inválida.");
            System.exit(0);
        }
    }
    
    public double getAltura(){
        return this.altura;
    }

    // 2. método:
    double atacar() {
        return this.forcaAtaque * 0.90;
    } // fim do atacar

    // 3. construtor não parametrizado:
    public Heroi() {

    }

    // 4. construtor parametrizado:
    public Heroi(String genero, double forcaAtaque,
            double altura) {
        this.setGenero( genero );
        this.setForcaAtaque( forcaAtaque );
        this.setAltura( altura );
    } //fim do const. param.
    
    // 5. método para imprimir atributos:
    void imprimirAtributos() {
        System.out.println("##################");
        System.out.println("Gênero: " + this.genero);
        System.out.println("Força ataque: " + this.forcaAtaque);
        System.out.println("Altura: " + this.altura);
    }

} // fim da classe
