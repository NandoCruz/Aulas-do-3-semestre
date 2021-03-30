
package dimensao.bidimensional;

///////////// FAÇA DENTRO DA CLASSE TrianguloEquilatero:
///////////// Agora, você vai decidir quais modificadores de acesso devem ser usados

public class TrianguloEquilatero {
    // DONE 2 declare o atributo lado
    private double lado;
    // DONE 3 declare o atributo altura
    private double altura;
    
    // DONE 4 crie um método para calcular e retornar a área do triângulo equilátero
    public double calcArea() {
        return lado * altura / 2.0;
    }
    // DONE 5 crie um método para calcular e retornar o perímetro do triângulo equilátero
    public double calcPerimetro() {
        return 3 * lado;
    }
    
    // DONE 6 crie o construtor padrão (sem argumentos)
    public TrianguloEquilatero() {
    }
    // DONE 7 crie o construtor parametrizado (com todos os argumentos)
    public TrianguloEquilatero(double lado, double altura) {
        setLado(lado);
        setAltura(altura);
    }
    
    // DONE 8 programe os métodos de configuração set e get para todos os atributos
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if( lado > 0 ) {
            this.lado = lado;
        } else {
            System.out.println("Erro! Lado inválido.");
            System.exit(0);
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro! Altura inválida.");
            System.exit(0);
        }
    }
    
    // DONE 9 dentro de cada método set, implemente a seguinte regra de validação:
    ///////// o atributo só será modificado se o valor passado para o set for maior que zero
    ///////// caso contrário, imprimir a mensagem "Valor inválido" e encerrar o programa
    
    



    

    
    
}
