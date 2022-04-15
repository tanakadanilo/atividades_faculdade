/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seudinheiroehmeu;

import java.util.ArrayList;

/**
 *
 * @author tanak
 */
public class Conta {

    /* * O atributo saldo em conta só pode ser modificado pelos seus respectivos métodos, não podendo ter setter.
        * Os atributos numeroConta e numeroAgencia devem ser finais, pois depois de se criar a conta, o numero da conta nao pode mudar, nem o da agencia
        * O atributo tipoConta não pode ter setter, pois o tipo de conta não pode ser mudado depois de se criar a conta
     */
    protected final int numeroAgencia;
    protected final int numeroConta;

    protected String nomeTitular;
    protected String enderecoTitular;
    protected String telefoneTitular;
    protected String emailTitular;
    protected String cpf;
    protected String sexo;
    protected String profissao;
    protected int idade;
    protected EstadoCivil estadoCivil;

    protected final TiposConta tipoDeConta;

    protected float saldoEmConta;

    protected ArrayList<Extratos> movimentacoesNaConta;

    public Conta() {
        numeroAgencia = 0;
        numeroConta = 0;
        tipoDeConta = TiposConta.CONTAPOUPANCA;
    }

    public Conta(int numeroAgencia, int numeroConta, String nomeTitular,
            String enderecoTitular, String telefoneTitular, String emailTitular,
            String cpf, int idade, TiposConta tipoDeConta) throws Exception {

        if (idade < 18) {
            throw new Exception("Para criar uma conta, é necessário ter mais de 18 anos");
        }

        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.enderecoTitular = enderecoTitular;
        this.telefoneTitular = telefoneTitular;
        this.emailTitular = emailTitular;
        this.cpf = cpf;
        this.idade = idade;
        this.tipoDeConta = tipoDeConta;
        movimentacoesNaConta = new ArrayList();
    }

    public Conta(int numeroAgencia, int numeroConta, String nomeTitular, String enderecoTitular,
            String telefoneTitular, String emailTitular, String cpf, String sexo, EstadoCivil estadoCivil,
            int idade, String profissao, TiposConta tipoDeConta) throws Exception {

        if (idade < 18) {
            throw new Exception("Para criar uma conta, é necessário ter mais de 18 anos");
        }
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.enderecoTitular = enderecoTitular;
        this.telefoneTitular = telefoneTitular;
        this.emailTitular = emailTitular;
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.idade = idade;
        this.profissao = profissao;
        this.tipoDeConta = tipoDeConta;
        movimentacoesNaConta = new ArrayList();
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getEnderecoTitular() {
        return enderecoTitular;
    }

    public void setEnderecoTitular(String enderecoTitular) {
        this.enderecoTitular = enderecoTitular;
    }

    public String getTelefoneTitular() {
        return telefoneTitular;
    }

    public void setTelefoneTitular(String telefoneTitular) {
        this.telefoneTitular = telefoneTitular;
    }

    public String getEmailTitular() {
        return emailTitular;
    }

    public void setEmailTitular(String emailTitular) {
        this.emailTitular = emailTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {

        if (idade < 18) {
            throw new Exception("Para criar uma conta, é necessário ter mais de 18 anos");
        }

        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public TiposConta getTipoDeConta() {
        return tipoDeConta;
    }

    public float getSaldoEmConta() {
        return saldoEmConta;
    }

    protected void sacar(double valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("O valor a ser sacado deve ser maior do que zero");
        }
        if (valor > saldoEmConta) {
            throw new Exception("Saldo insuficiente");
        }
        saldoEmConta -= valor;
        Extratos extratoParaAdicionar = new Extratos("Sacar", valor);
        movimentacoesNaConta.add(extratoParaAdicionar);
    }

    protected void depositar(double valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("O valor a ser sacado deve ser maior do que zero");
        }
        saldoEmConta += valor;
        Extratos extratoParaAdicionar = new Extratos("Depositar", valor);
        movimentacoesNaConta.add(extratoParaAdicionar);
    }

    protected ArrayList<Extratos> tirarExtrato() {

        return movimentacoesNaConta;
    }

}
