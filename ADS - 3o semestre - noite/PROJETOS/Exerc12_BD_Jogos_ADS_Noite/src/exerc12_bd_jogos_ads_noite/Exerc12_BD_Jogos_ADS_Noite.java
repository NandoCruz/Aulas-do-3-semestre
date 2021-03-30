
package exerc12_bd_jogos_ads_noite;

import br.jogo.bd.BancoDados;
import br.jogo.entidade.Jogo;

public class Exerc12_BD_Jogos_ADS_Noite {

    public static void main(String[] args) {
//        Jogo j1 = new Jogo(1000, "Dota 2", "MOBA", 2013, "Valve");
//        j1.inserir();
        Jogo j2 = new Jogo(1001, "League of Legends", "MOBA", 2009, "Riot");
//        j2.inserir();
        Jogo j3 = new Jogo(1002, "Valorant", "FPS", 2020, "Valve");
//        j3.inserir();
//        Jogo.listar();
//        Jogo.atualizar(j3);
        Jogo.listar();
        Jogo.remover(j2);
        Jogo.listar();
    }
    
}
