
package p11_projetoindustria_ee_noite;

public class P11_ProjetoIndustria_EE_Noite {

    public static void main(String[] args) {
        // criar dois objetos:
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        // colocar valores nos atributos através do objeto f1:
        f1.nome = "Maria Silva";
        f1.matricula = 26010909;
        f1.salario = 5432.90;
        
        // imprimir os valores dos atributos do objeto f1:
        System.out.println("Nome: " + f1.nome);
        System.out.println("Matrícula: " + f1.matricula);
        System.out.println("Salário: " + f1.salario);
        
        // imprimir os valores dos atributos do objeto f2:
        System.out.println("#######################");
        
        System.out.println("Nome: " + f2.nome);
        System.out.println("Matrícula: " + f2.matricula);
        System.out.println("Salário: " + f2.salario);
        
        System.out.println("=======================");
        
        Equipamento e1 = new Equipamento();
        Equipamento e2 = new Equipamento();
        
        e1.marca = "GM";
        e1.peso  = 3.40;
        e1.anoFabricacao = 1999;
        
        int tempoVida = e1.calcTempoVida(2020);
        System.out.println("Tempo de vida: " + tempoVida + " anos");
        
        e1.imprimirAtributos();
        
        System.out.println("#######################");
        
        e2.imprimirAtributos();
        
        System.out.println("#######################");
        
    } // fim do main
    
} // fim da classe
