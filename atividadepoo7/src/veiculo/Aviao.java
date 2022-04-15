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
public class Aviao extends VeiculoComMotor implements IVeiculo {

    private double anguloDeCurvaEmRelacaoAoProprioEixo = 0;

    private float altitude = 0;

    private String identificacaoDoAviao;

    public Aviao() {
    }

    public Aviao(String identificacaoDoAviao, float CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL, String marca, String modelo, String cor) {
        super(CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL, marca, modelo, cor);

        this.identificacaoDoAviao = identificacaoDoAviao;
    }

    public void subir(double aumentoDeAltitude) throws Exception {
        if (aumentoDeAltitude <= 0) {
            throw new Exception("O valor de quanto subiu não pode ser negativo nem igual a zero");
        }
        altitude += aumentoDeAltitude;
    }

    public void descer(double diminuicaoDeAltitude) throws Exception {
        if (diminuicaoDeAltitude <= 0) {
            throw new Exception("O valor de quanto subiu não pode ser negativo nem igual a zero");
        }
        if (diminuicaoDeAltitude > altitude) {
            throw new Exception("O valor de descida informado é maior do que a altitude atual do avião");
        }
        altitude -= diminuicaoDeAltitude;
    }

    @Override
    public void virar(double angulo) throws Exception {
        if (angulo == 0) {
            throw new Exception("O angulo não pode ser igual a zero");
        }
        anguloDeCurvaEmRelacaoAoProprioEixo += angulo;
        if (anguloDeCurvaEmRelacaoAoProprioEixo > 360) {
            anguloDeCurvaEmRelacaoAoProprioEixo = anguloDeCurvaEmRelacaoAoProprioEixo % 360;
        }
        if (anguloDeCurvaEmRelacaoAoProprioEixo < (-360)) {
            anguloDeCurvaEmRelacaoAoProprioEixo = anguloDeCurvaEmRelacaoAoProprioEixo - (anguloDeCurvaEmRelacaoAoProprioEixo % (-360));
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
