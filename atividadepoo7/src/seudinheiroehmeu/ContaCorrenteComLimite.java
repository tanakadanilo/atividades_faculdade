/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seudinheiroehmeu;

/**
 *
 * @author tanak
 */
public class ContaCorrenteComLimite extends Conta {

    private final float RENDA_MINIMA_NECESSARIA_PRA_ABRIR_A_CONTA = 1212;// estou seguindo a ideia de só poder criar conta corrente quem recebe mais de um salário minimo
    private double valorDeEmprestimosEmAberto = 0;
    private double limiteDeCredito;
    private double rendaBruta;

    public ContaCorrenteComLimite(double limiteDeCredito, double rendaBruta, int numeroAgencia, int numeroConta, String nomeTitular,
            String enderecoTitular, String telefoneTitular, String emailTitular, String cpf, String sexo, EstadoCivil estadoCivil,
            int idade, String profissao) throws Exception {

        super(numeroAgencia, numeroConta, nomeTitular, enderecoTitular, telefoneTitular, emailTitular,
                cpf, sexo, estadoCivil, idade, profissao, TiposConta.CONTACORRENTECOMLIMITE);

        if (rendaBruta <= RENDA_MINIMA_NECESSARIA_PRA_ABRIR_A_CONTA) {
            throw new Exception("Com a renda informada, não é possivel abrir o tipo de conta desejado");
        }

        if (limiteDeCredito < 0) {
            throw new Exception("O valor do limite de crédito não pode ser negativo");
        }
        if (limiteDeCredito == 0) {
            throw new Exception("Caso não possua limite de crédito, a conta a ser aberta deve ser do tipo conta corrente básica");
        }
        this.rendaBruta = rendaBruta;
        this.limiteDeCredito = limiteDeCredito;
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) throws Exception {

        if (limiteDeCredito < 0) {
            throw new Exception("O valor do limite de crédito não pode ser negativo");
        }
        if (limiteDeCredito == 0) {
            throw new Exception("Caso não possua limite de crédito, a conta a ser aberta deve ser do tipo conta corrente básica");
        }
        this.limiteDeCredito = limiteDeCredito;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) throws Exception {
        if (rendaBruta <= RENDA_MINIMA_NECESSARIA_PRA_ABRIR_A_CONTA) {
            throw new Exception("Com a renda informada, não é possivel abrir o tipo de conta desejado");
        }
        this.rendaBruta = rendaBruta;
    }

    public double getValorDeEmprestimosEmAberto() {
        return valorDeEmprestimosEmAberto;
    }

    public String pedirEmprestimo(double valorEmprestimoDesejado) throws Exception {
        if (liberarEmprestimo(valorEmprestimoDesejado)) {// caso o empestimo seja aceito, mudar valor em conta e salvar emprestimo
            saldoEmConta += valorEmprestimoDesejado;
            valorDeEmprestimosEmAberto += valorEmprestimoDesejado;

            Extratos extratoParaAdicionar = new Extratos("Empréstimo feito", valorEmprestimoDesejado);
            movimentacoesNaConta.add(extratoParaAdicionar);

            return "Empréstimo feito no valor de: " + valorEmprestimoDesejado;

        } else {//caso o emprestimo seja negado,  informar o motivo disso
            if (valorDeEmprestimosEmAberto > 0) {

                return "Já possui outro emprestimo em aberto";
            } else {

                return "Emprestimo negado devido ao valor de renda informado";
            }
        }
    }

    public String pagarEmprestimo(double valorPago) throws Exception {
        if (valorPago > saldoEmConta) {
            throw new Exception("Saldo insuficiente");
        }

        if (valorDeEmprestimosEmAberto == 0) {
            throw new Exception("Não existem emprestimos em aberto, na conta informada");
        }
        if (valorPago >= valorDeEmprestimosEmAberto) {
            throw new Exception("Não existe um emprestimo no valor informado, o total devido em emprestimos é de: " + valorDeEmprestimosEmAberto);
        }

        saldoEmConta -= valorPago;
        valorDeEmprestimosEmAberto -= valorPago;

        Extratos extratoParaAdicionar = new Extratos("Pagamento de empréstimo", valorPago);
        movimentacoesNaConta.add(extratoParaAdicionar);

        if (valorDeEmprestimosEmAberto == 0) {
            return "Pagamento realizado. Não existem mais emprestimos em aberto";
        } else {
            return "Pagamento realizado, no valor de: " + valorPago + ". Ainda existe um empréstimo em aberto no valor de: " + valorDeEmprestimosEmAberto;
        }
    }

    private boolean liberarEmprestimo(double valorEmprestimoDesejado) throws Exception {
        if (valorEmprestimoDesejado <= 0) {
            throw new Exception("O valor do emprestimo não pode ser menor nem igual a zero");
        }
        return (valorEmprestimoDesejado + valorDeEmprestimosEmAberto) <= limiteDeCredito;
    }
}
