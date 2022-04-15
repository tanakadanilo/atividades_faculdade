/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cone;

/**
 *
 * @author tanak
 */
public class Cone {

    private float altura = 0.0f;
    private float raio = 0.0f;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("O valor de altura não pode ser negativo  nem igual a 0");
        }
        this.altura = altura;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        if (raio <= 0) {
            throw new Exception("O valor do raio não pode ser negativo  nem igual a 0");
        }
        this.raio = raio;
    }

    public float calcularGeratrizes() {
        return (float) Math.sqrt((altura * altura) + (raio * raio));
    }

    public float calcularAreaLateral() {
        return (float) (Math.PI * raio * calcularGeratrizes());
    }

    public float calcularAreaTotal() {
        return (float) (Math.PI * raio * (calcularGeratrizes() + raio));
    }

    public float calcularVolume() {
        return (float) ((1.0 / 3.0) * Math.PI * (raio * raio) * altura);
    }
}
