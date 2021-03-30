
package p11_projetoindustria_ee_noite;

public class Funcionario {
    // atributos:
    String nome;
    int matricula;
    double salario;
    
    // métodos:
    void baterPonto(String tipo) {
        System.out.println("Batendo ponto de " + tipo);
    }
    void trabalhar() {
        System.out.println("Trabalhando...");
    }
    double receberSalario() {
        return salario;
    }
    
} // fim da classe
