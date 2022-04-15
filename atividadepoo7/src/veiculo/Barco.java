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
public class Barco extends VeiculoComMotor implements IVeiculo {

    private String identificacaoDoBarco;
    private double direcao;

    public Barco() {
    }

    public Barco(String identificacaoDoBarco, float CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL, String marca, String modelo, String cor) {
        super(CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL, marca, modelo, cor);
        this.identificacaoDoBarco = identificacaoDoBarco;
    }

    public String getIdentificacaoDoBarco() {
        return identificacaoDoBarco;
    }

    public void setIdentificacaoDoBarco(String identificacaoDoBarco) {
        this.identificacaoDoBarco = identificacaoDoBarco;
    }

    @Override
    public void virar(double angulo) throws Exception {
        if (angulo == 0) {
            throw new Exception("O valor do angulo de curva não pode ser igual a zero");
        }
        direcao += angulo;

        if (direcao > 360) {
            direcao = direcao % 360;
        }
        if (direcao < (-360)) {
            direcao = direcao - (direcao % 360);
        }
    }

    @Override
    public void acelerar(double quantidadeAumentoVelocidade) throws Exception {
        if (quantidadeAumentoVelocidade <= 0) {
            throw new Exception("O valor da aceleração não pode ser 0 nem negativo.");
        }
        velocidade += quantidadeAumentoVelocidade;
    }

    @Override
    public void freiar(double quantidadeReducaoVelocidade) throws Exception {
        if (quantidadeReducaoVelocidade <= 0) {
            throw new Exception("O valor da redução de velocidade não pode ser 0 nem negativo.");
        }
        if (quantidadeReducaoVelocidade > velocidade) {
            throw new Exception("O valor de redução de velocidade deve ser menor que a velocidade atual, que é de: " + velocidade);
        }

        velocidade -= quantidadeReducaoVelocidade;
    }

}
