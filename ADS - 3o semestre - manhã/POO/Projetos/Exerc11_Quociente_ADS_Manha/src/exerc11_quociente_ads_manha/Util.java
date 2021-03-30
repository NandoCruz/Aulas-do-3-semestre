
package exerc11_quociente_ads_manha;

import javax.swing.JOptionPane;

public final class Util {
    public static String entrada(String msg) {
        return JOptionPane.showInputDialog(msg);
    }
    
    public static void saida(String msg, String titulo, int codIcone) {
        JOptionPane.showMessageDialog(null, msg, titulo, codIcone);
    }
}
