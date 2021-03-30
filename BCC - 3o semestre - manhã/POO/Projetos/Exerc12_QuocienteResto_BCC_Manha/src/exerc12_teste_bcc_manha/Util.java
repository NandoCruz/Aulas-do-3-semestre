
package exerc12_teste_bcc_manha;

import javax.swing.JOptionPane;

public class Util {
    public static String entrada(String msg) {
        return JOptionPane.showInputDialog( msg );
    }
    public static void saida(String msg, 
            String titulo, int icone) {
        JOptionPane.showMessageDialog(null, msg, titulo, icone);
    }
}
