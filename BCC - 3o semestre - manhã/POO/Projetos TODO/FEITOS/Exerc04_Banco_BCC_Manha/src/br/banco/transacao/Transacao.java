
package br.banco.transacao;

public class Transacao {
    //////////// FAZER DENTRO DA CLASSE Transferencia:
    // DONE 04 - crie os atributos descricao, valor, data, contaOrigem, contaDestino
    //////////// os atributos acima são String, exceto o 'valor' e devem ser declarados como privados
    private String descricao;
    private double valor;
    private String data;
    private String contaOrigem;
    private String contaDestino;
    
    private String linhaDigitavel;
    private String dataVencimento;
    private String cedente;
    
    // DONE 05 - crie os métodos de configuração set e get dos atributos
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.length() > 3) {
            this.descricao = descricao;
        } else {
            System.out.println("Erro! Descrição inválida.");
            System.exit(0);
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor >= 0) {
            this.valor = valor;
        } else {
            System.out.println("Erro! Valor inválido.");
            System.exit(0);
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }

    public String getLinhaDigitavel() {
        return linhaDigitavel;
    }

    public void setLinhaDigitavel(String linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getCedente() {
        return cedente;
    }

    public void setCedente(String cedente) {
        this.cedente = cedente;
    }
    
    // DONE 06 - programe um método público de nome emitirComprovante
    //////////// este método não retorna nada e não recebe nenhum parâmetro
    public void emitirComprovante() {
        // DONE 07 - dentro do método emitirComprovante, imprima todos os valores dos atributos
        //////////// use os métodos get para pegar os valores
        System.out.println("### COMPROVANTE ###");
        System.out.println("- Descrição: " + getDescricao());
        System.out.println("- Valor: R$ "  + getValor());
        System.out.println("- Data: "      + getData());
        System.out.println("- Conta destino: " + getContaDestino());
        if ( getContaOrigem().length() > 0 ) {
            System.out.println("- Conta origem: " + getContaOrigem());
        } else {
            System.out.println("- Linha digitável: "    + getLinhaDigitavel());
            System.out.println("- Data de vencimento: " + getDataVencimento());
            System.out.println("- Cedente: " + getCedente());
        }
    }
    
    // DONE 08 - a classe Transferencia está representando os dados de boleto bancário também?
    //////////// R: Não, porque não existem atributos de boleto na classe Transferencia
    
    // DONE 09 - adicione os seguintes atributos na classe Transferencia:
    //////////// linhaDigitavel, dataVencimento e cedente (todos String)
    
    // DONE 10 - altere o método emitirComprovante para imprimir os novos atributos
    //////////// faça um if-else para verificar se a conta de origem foi informada ou não
    //////////// se ela for diferente de null, imprima as informações de transferência bancária
    //////////// senão, imprima as informações de boletos bancários
    
    // DONE 11 - modifique o nome da classe para Transacao 
    //////////// (clique com o botão direito em cima da classe: Refatorar -> Renomear...)
    // DONE 12 - o que acha desta classe? ela está adequada ao cenário banco? Justifique.
    //////////// R: Não está adequada, porque ela está com várias funções definidas
    // e isso é prejudicial para a organização do projeto.

    
    
}
