
package janelas;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JanelaLogin extends JFrame {
    // DONE 05 - programe o relacionamento de herança entre JanelaLogin e 
    ////////// a classe JFrame
    // DONE 06 - crie um objeto privado da classe JPanel chamado painel
    private JPanel painel = new JPanel();
    // DONE 07 - crie um objeto privado da classe BoxLayout chamado layoutPainel
    ////////// passe os seguintes valores para o construtor:
    ////////// painel (objeto criado acima) e BoxLayout.PAGE_AXIS
    private BoxLayout layoutPainel = new BoxLayout(painel, BoxLayout.PAGE_AXIS);
    // DONE 08 - crie um objeto privado da classe JLabel chamado txtLogin
    ////////// passe a String "Informe os seus dados" para o construtor
    private JLabel txtLogin = new JLabel("Informe os seus dados");
    // DONE 09 - crie um objeto privado da classe JLabel chamado txtEmail
    ////////// passe a String "E-mail" para o construtor
    private JLabel txtEmail = new JLabel("E-mail");
    // DONE 10 - crie um objeto privado da classe JLabel chamado txtSenha
    ////////// passe a String "Senha" para o construtor
    private JLabel txtSenha = new JLabel("Senha");
    // DONE 11 - crie um objeto privado da classe JTextField chamado campoEmail
    ////////// passe o valor 20 para o construtor
    private JTextField campoEmail = new JTextField(20);
    // DONE 12 - crie um objeto privado da classe JPasswordField chamado campoSenha
    ////////// passe o valor 20 para o construtor
    private JPasswordField campoSenha = new JPasswordField(20);
    // DONE 13 - crie um objeto privado da classe JButton chamado botaoOK
    ////////// passe a String "Entrar" para o construtor
    private JButton botaoOK = new JButton("Entrar");
    // DONE 14 - programe um construtor público e não parametrizado
    public JanelaLogin() {
        // DONE 15 - FAÇA DENTRO DO CONSTRUTOR:
        // DONE 16 - usando o objeto painel, chame o método setLayout e 
        ////////// passe como argumento o objeto layoutPainel da classe BoxLayout
        painel.setLayout( layoutPainel );
        // DONE 17 - usando o objeto campoEmail, chame o método setMaximumSize e
        ////////// passe o valor da chamada campoEmail.getPreferredSize()
        ////////// como argumento
        campoEmail.setMaximumSize( campoEmail.getPreferredSize() );
        // DONE 18 - faça o mesmo da tarefa 17 para o objeto campoSenha
        campoSenha.setMaximumSize( campoSenha.getPreferredSize() );
        // DONE 19 - através do objeto txtLogin, acesse o método setAlignmentX e
        ////////// passe como argumento o valor da constante CENTER_ALIGNMENT
        txtLogin.setAlignmentX(CENTER_ALIGNMENT);
        // DONE 20 - faça o mesmo da tarefa 19 para os objetos txtEmail, txtSenha,
        ////////// campoEmail, campoSenha e botaoOK
        txtEmail.setAlignmentX(CENTER_ALIGNMENT);
        txtSenha.setAlignmentX(CENTER_ALIGNMENT);
        campoEmail.setAlignmentX(CENTER_ALIGNMENT);
        campoSenha.setAlignmentX(CENTER_ALIGNMENT);
        botaoOK.setAlignmentX(CENTER_ALIGNMENT);
        
        // DONE 21 - através do objeto painel, acesse o método add e passe o 
        ////////// objeto txtLogin como argumento
        painel.add(txtLogin);
        // DONE 22 - faça o mesmo da tarefa 21 para os objetos txtEmail, campoEmail,
        ////////// txtSenha, campoSenha e botaoOK (NESTA ORDEM)
        painel.add(txtEmail);
        painel.add(campoEmail);
        painel.add(txtSenha);
        painel.add(campoSenha);
        painel.add(botaoOK);
        
    }
    
}
