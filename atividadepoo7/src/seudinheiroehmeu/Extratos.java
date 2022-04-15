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
public class Extratos {

    protected String operacaoRealizada;
    protected double valorMovimentado;
    protected float saldoEmConta;

    public Extratos(String operacaoRealizada, double valorMovimentado, float saldoEmConta) {
        this.operacaoRealizada = operacaoRealizada;
        this.valorMovimentado = valorMovimentado;
        this.saldoEmConta = saldoEmConta;
    }

    public String getOperacaoRealizada() {
        return operacaoRealizada;
    }

    public double getValorMovimentado() {
        return valorMovimentado;
    }

}
