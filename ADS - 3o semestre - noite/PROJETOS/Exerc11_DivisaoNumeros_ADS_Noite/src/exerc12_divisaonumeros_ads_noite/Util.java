
package exerc12_divisaonumeros_ads_noite;

import javax.swing.JOptionPane;

public final class Util {
    public static String entrada(String msg) {
        return JOptionPane.showInputDialog( msg );
    }
    
    public static void saida(String msg, String titulo, int icone) {
        JOptionPane.showMessageDialog(null, msg, titulo, icone);
    }
    
}
