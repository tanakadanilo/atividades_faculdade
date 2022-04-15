/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cilindro;

/**
 *
 * @author tanak
 */
public class Cilindro {

    private float altura = 0.0f;
    private float raio = 0.0f;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("O valor da altura não pode ser negativo");
        }
        this.altura = altura;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        if (raio <= 0) {
            throw new Exception("O valor do raio não pode ser negativo");
        }
        this.raio = raio;
    }

    public float calculaAreaLateral() {
        return (float) (2 * Math.PI * raio * altura);
    }

    public float calculaAreaTotal() {
        return (float) (2 * Math.PI * (raio * (altura + raio)));
    }
    public float calculaVolume(){
        return(float)(Math.PI*raio*raio*altura);
    }

}
