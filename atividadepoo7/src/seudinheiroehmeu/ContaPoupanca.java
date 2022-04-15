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
public class ContaPoupanca extends Conta {

    private float porcentagemRendimento;
    private int diaVencimentoDoRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(float porcentagemRendimento, int diaVencimentoDoRendimento, int numeroAgencia,
            int numeroConta, String nomeTitular, String enderecoTitular, String telefoneTitular, String emailTitular,
            String cpf, int idade) throws Exception {

        super(numeroAgencia, numeroConta, nomeTitular, enderecoTitular,
                telefoneTitular, emailTitular, cpf, idade, TiposConta.CONTAPOUPANCA);

        if (porcentagemRendimento < 0) {
            throw new Exception("O valor do rendimento não pode ser menor do que zero");
        }
        if (diaVencimentoDoRendimento < 0 || diaVencimentoDoRendimento > 31) {
            throw new Exception("Foi informado um dia de vencimento do rendimento da conta inválido");
        }
        this.porcentagemRendimento = porcentagemRendimento;
        this.diaVencimentoDoRendimento = diaVencimentoDoRendimento;
    }

    public ContaPoupanca(float porcentagemRendimento, int diaVencimentoDoRendimento, int numeroAgencia,
            int numeroConta, String nomeTitular, String enderecoTitular, String telefoneTitular, String emailTitular, String cpf,
            String sexo, EstadoCivil estadoCivil, int idade, String profissao, TiposConta tipoDeConta) throws Exception {

        super(numeroAgencia, numeroConta, nomeTitular, enderecoTitular, telefoneTitular, emailTitular, cpf, sexo, estadoCivil, idade, profissao, tipoDeConta);

        if (porcentagemRendimento < 0) {
            throw new Exception("O valor do rendimento não pode ser menor do que zero");
        }
        if (diaVencimentoDoRendimento < 0 || diaVencimentoDoRendimento > 31) {
            throw new Exception("Foi informado um dia de vencimento do rendimento da conta inválido");
        }
        this.porcentagemRendimento = porcentagemRendimento;
        this.diaVencimentoDoRendimento = diaVencimentoDoRendimento;
    }

    public float getPorcentagemRendimento() {
        return porcentagemRendimento;
    }

    public void setPorcentagemRendimento(float porcentagemRendimento) throws Exception {

        if (porcentagemRendimento < 0) {
            throw new Exception("O valor do rendimento não pode ser menor do que zero");
        }

        this.porcentagemRendimento = porcentagemRendimento;
    }

    public int getDiaVencimentoDoRendimento() {
        return diaVencimentoDoRendimento;
    }

    public void setDiaVencimentoDoRendimento(int diaVencimentoDoRendimento) throws Exception {

        if (diaVencimentoDoRendimento < 0 || diaVencimentoDoRendimento > 31) {
            throw new Exception("Foi informado um dia de vencimento do rendimento da conta inválido");
        }
        this.diaVencimentoDoRendimento = diaVencimentoDoRendimento;
    }

    private void calcularRendimentos() {//a ideia é usar esse método para calcular o rendimento da conta poupança, mas não  sei como fazer
//        saldoEmConta *= porcentagemRendimento;

        throw new UnsupportedOperationException("Operation not supported yet");
    }
}
