
package exerc12_bd_jogos_ads_manha;

import br.jogo.bd.BancoDados;
import br.jogo.entidade.Jogo;

public class Exerc12_BD_Jogos_ADS_Manha {

    public static void main(String[] args) {
        Jogo j1 = new Jogo(1, "Dota 2", "MOBAz", 2014, "Valvez");
        Jogo j2 = new Jogo(2, "League of Legends", "MOBA", 2009, "Riot");
        Jogo j3 = new Jogo(3, "Valorant", "FPS", 2020, "Riot");
        Jogo j4 = new Jogo(4, "8 Ball Pool", "Bilhar", 2011, "Miniclip");
//        j1.inserir();
//        j2.inserir();
//        j3.inserir();
//        j4.inserir();
        
        Jogo.listar();
//        Jogo.atualizar(j1);
        Jogo.remover(3);
        Jogo.listar();
    }
    
}
