
package dimensao.bidimensional;

public class TrianguloRetangulo {
    // DONE 1 altere os modificadores de acesso de todos os atributos para private
    private double cateto1;
    private double cateto2;
    private double hipotenusa;
    private double alturaHipotenusa;
    
    // DONE 15 altere o modificador de acesso deste método para public
    public double calcArea(){
        double area = this.hipotenusa * alturaHipotenusa / 2.0;
        return area;
    }
    
    // DONE 21 altere o modificador de acesso deste método para public
    public double calcPerimetro(){
        double perimetro = cateto1 + cateto2 + hipotenusa;
        return perimetro;
    }

    public TrianguloRetangulo(double cateto1, double cateto2, double hipotenusa, double alturaHipotenusa) {
        // TODO 25 chame o método set para realizar atribuição dos valores nos atributos
        setCateto1(cateto1);
        setCateto2(cateto2);
        setHipotenusa(hipotenusa);
        setAlturaHipotenusa(alturaHipotenusa);
    }
    
    public TrianguloRetangulo() {
    }
    
    // DONE 2 crie aqui os métodos de configuração set e get de todos os atributos (dica: Alt+Insert)
    
    // DONE 3 dentro de cada método set, implemente a seguinte regra de validação:
    ///////// o atributo só será modificado se o valor passado para o set for maior que zero
    ///////// caso contrário, imprimir a mensagem "Valor inválido" e encerrar o programa

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        if(cateto1 > 0) {
            this.cateto1 = cateto1;
        } else {
            System.out.println("Erro! Valor inválido.");
            System.exit(0);
        }
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        if(cateto2 > 0) {
            this.cateto2 = cateto2;
        } else {
            System.out.println("Erro! Valor inválido.");
            System.exit(0);
        }
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        if(hipotenusa > 0) {
            this.hipotenusa = hipotenusa;
        } else {
            System.out.println("Erro! Valor inválido.");
            System.exit(0);
        }
    }

    public double getAlturaHipotenusa() {
        return alturaHipotenusa;
    }

    public void setAlturaHipotenusa(double alturaHipotenusa) {
        if(alturaHipotenusa > 0) {
            this.alturaHipotenusa = alturaHipotenusa;
        } else {
            System.out.println("Erro! Valor inválido.");
            System.exit(0);
        }
    }

}
