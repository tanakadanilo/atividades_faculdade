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
public class ContaCorrenteBasica extends Conta {

    private double rendaBruta;

    public ContaCorrenteBasica(double rendaBruta, int numeroAgencia, int numeroConta, String nomeTitular,
            String enderecoTitular, String telefoneTitular, String emailTitular, String cpf, String sexo, EstadoCivil estadoCivil,
            int idade, String profissao) throws Exception {

        super(numeroAgencia, numeroConta, nomeTitular, enderecoTitular, telefoneTitular, emailTitular, cpf, sexo,
                estadoCivil, idade, profissao, TiposConta.CONTACORRENTEBASICA);

        if (rendaBruta < 0) {
            throw new Exception("O valor da renda não pode ser um número negativo");
        }
        this.rendaBruta = rendaBruta;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) throws Exception {
        if (rendaBruta < 0) {
            throw new Exception("O valor da renda não pode ser um número negativo");
        }
        this.rendaBruta = rendaBruta;
    }

    public void fazerTransferencia(double valorASerTransferido, int numeroAgencia, int numeroConta) throws Exception {
        if (valorASerTransferido <= 0) {
            throw new Exception("Informe um valor de transferencia que seja maior do que 0");
        }

        if (valorASerTransferido > saldoEmConta) {
            throw new Exception("Saldo insuficiente");
        }
        throw new UnsupportedOperationException("Operation not supported yet");

    }

}
