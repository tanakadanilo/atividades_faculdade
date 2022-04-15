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
public class Automovel extends VeiculoComMotor implements IVeiculo {

    private double direcaoDasRodas = 0;

    private String placa;
    private String numeroChassis;

    /* * OBS: não criar setters de velocidade nem direção, nem isLigado, nem quantidadeDeCombustivelNoTanque
        * nem inicializar seus valores nos construtores, 
        * pois estas variáveis só podem ser modificados usando os metodos para isso.
     */
    public Automovel() {
    }

    public Automovel(String placa, String numeroChassis, float CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL,
            String marca, String modelo, String cor) throws Exception {
        super(CAPACIDADE_TOTAL_TANQUE_COMBUSTIVEL, marca, modelo, cor);
        this.placa = placa;
        this.numeroChassis = numeroChassis;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumeroChassis() {
        return numeroChassis;
    }

    public void setNumeroChassis(String numeroChassis) {
        this.numeroChassis = numeroChassis;
    }

    public double getDirecaoDasRodas() {
        return direcaoDasRodas;
    }

    @Override
    public void virar(double angulo) throws Exception {

        //angulo negativo vira pra esquerda, angulo positivo vira pra direita
        if (angulo == 0) {
            throw new Exception("O angulo de mudança de direção não pode ser igual  a zero");
        }
        if (direcaoDasRodas + angulo > 45 || direcaoDasRodas + angulo < (-45)) {// as rodas do Veiculo giram só até 45 graus.
            throw new Exception("As não podem virar no angulo informado,"
                    + " por ficarem em um angulo maior do que são capazes de virar"
                    + "\nAngulo atual das rodas: " + getDirecaoDasRodas());
        }
        direcaoDasRodas += angulo;
    }

    @Override
    public void acelerar(double quantidadeAumentoVelocidade) throws Exception {
        if (quantidadeAumentoVelocidade <= 0) {
            throw new Exception("A quantidade de aumento na velocidade não pode ser menor nem igual  a zero");
        }
        super.velocidade += quantidadeAumentoVelocidade;
    }

    @Override
    public void freiar(double quantidadeReducaoVelocidade) throws Exception {
        if (quantidadeReducaoVelocidade <= 0) {
            throw new Exception("A quantidade de redução na velocidade não pode ser menor nem igual  a zero");
        }
        if (quantidadeReducaoVelocidade > velocidade) {
            throw new Exception("A redução de velocidade é maior do que a velocidade do veiculo, que atualmente é de: " + velocidade);
        }
        super.velocidade -= quantidadeReducaoVelocidade;
    }

}
