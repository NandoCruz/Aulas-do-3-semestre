
package exerc13_bd_jogos_bcc_manha;

import br.jogo.bd.BancoDados;
import br.jogo.entidade.Jogo;

public class Exerc13_BD_Jogos_BCC_Manha {

    public static void main(String[] args) {
        Jogo j1 = new Jogo(1, "Dota 2", "MOBA", 2010, "Valve");
        Jogo j2 = new Jogo(5, "LOLzera", "MOBA", 2009, "Riot");
        Jogo j3 = new Jogo(3, "Valorant", "FPS", 2020, "Riot");
        Jogo j4 = new Jogo(4, "8 Ball Pool", "Sinuca", 2011, "Miniclip");
//        j1.inserir();
//        j2.inserir();
//        j3.inserir();
//        j4.inserir();
//        j2.inserir();
        
        Jogo.listar();
        Jogo.remover( 5 );
        Jogo.listar();
        
    }
    
}
