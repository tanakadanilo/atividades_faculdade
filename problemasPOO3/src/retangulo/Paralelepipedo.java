/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

/**
 *
 * @author tanak
 */
public class Paralelepipedo {

    private float altura = 0;
    private float largura = 0;
    private float comprimento = 0;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float calculaVolume() {

        return (altura * comprimento * largura);
    }

    public float calculaArea() {
        return (2.0f * ((altura * largura) + (altura * comprimento) + (largura * comprimento)));
    }
}
