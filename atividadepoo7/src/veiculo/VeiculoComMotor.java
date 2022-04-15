/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

/**
 *
 * @author tanak
 */
public class VeiculoComMotor extends Veiculo {

    protected boolean isLigado = false;

    protected final float CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL;
    protected float quantidadeDeCombustivelNoTanque;

    public VeiculoComMotor() {
        this.CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL = 0;
    }

    public VeiculoComMotor(float CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL, String marca, String modelo, String cor) {
        super(marca, modelo, cor);
        this.CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL = CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public float getCAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL() {
        return CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL;
    }

    public float getQuantidadeDeCombustivelNoTanque() {
        return quantidadeDeCombustivelNoTanque;
    }

    public void ligarMotor() throws Exception {
        if (isLigado) {
            throw new Exception("O  veiculo já está ligado");
        }
        isLigado = true;
    }

    public void desligarMotor() throws Exception {
        if (!isLigado) {
            throw new Exception("O veiculo já está desligado");
        }
        isLigado = false;
    }

    public void abastecer(float quantidadeDeCombustivelAdicionado) throws Exception {
        if (quantidadeDeCombustivelAdicionado < 0) {
            throw new Exception("quantidade informada de combustivel abastecido é inválida");
        }
        if ((quantidadeDeCombustivelAdicionado + quantidadeDeCombustivelNoTanque) > CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL) {
            throw new Exception("Capacidade do tanque insuficiente");
        }
        quantidadeDeCombustivelNoTanque += quantidadeDeCombustivelAdicionado;
    }

    public void gastarCombustivel(float quantidadeDeCombustivelGasto) throws Exception {
        if (quantidadeDeCombustivelGasto < 0) {
            throw new Exception("O valor não pode ser negativo");
        }
        if (quantidadeDeCombustivelGasto > quantidadeDeCombustivelNoTanque) {
            throw new Exception("O valor informado é superior a quantidade de combustivel no tanque,"
                    + " que é de: " + quantidadeDeCombustivelNoTanque);
        }

        quantidadeDeCombustivelNoTanque -= quantidadeDeCombustivelGasto;
    }
}
