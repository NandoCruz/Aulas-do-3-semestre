
package p03_mercado_bcc_manha;

public class P03_Mercado_BCC_Manha {

    public static void main(String[] args) {
        Produto biscoito = new Produto();
        biscoito.setNome("Oreo");
        biscoito.setPeso(0.3);
        biscoito.setPreco(3.00);
        
        Produto detergente = 
           new Produto("Omo", 9.90, 3.25);
        
        System.out.println("Nome: " + biscoito.getNome());
        System.out.println("Peso: " + biscoito.getPeso());
        System.out.println("Valor do biscoito: " + 
                biscoito.getPreco());
        System.out.println("Valor do biscoito com desconto: " + 
                biscoito.aplicarDesconto(10));
        
        System.out.println("######################");
        
        System.out.println("Nome: " + detergente.getNome());
        System.out.println("Peso: " + detergente.getPeso());
        System.out.println("Valor do detergente: " + 
                detergente.getPreco());
        System.out.println("Valor do detergente com desconto: " + 
                detergente.aplicarDesconto(5));
    } // fim do main
    
} // fim da classe
