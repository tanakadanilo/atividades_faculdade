/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaspoo4.paciente;

/**
 *
 * @author tanak
 */
public class Paciente {

    private String nome = "";
    private float peso = 0.0f;
    private float altura = 0.0f;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws Exception {
        if (peso <= 0) {
            throw new Exception("O peso não pode ser igual nem menor do que 0");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("A altura não pode ser igual nem menor do que 0");
        }
        this.altura = altura;
    }

    public float calcularIMC() throws Exception {
        if (peso <= 0) {
            throw new Exception("Falha ao calcular o IMC");
        }
        return (peso / (altura * altura));
    }

    public String calcularFaixaDePeso() throws Exception{
        try {
            float imc = calcularIMC();
            if (imc < 20) {
                return "Abaixo do peso ideal";
            } else if (imc >= 20 && imc < 25) {
                return "peso normal";
            } else if (imc >= 25 && imc < 30) {
                return "excesso de peso";
            } else if (imc >= 30 && imc < 35) {
                return "Obesidade";
            } else {
                return "obesidade mórbida";
            }
        }catch(Exception erro){
            throw new Exception(erro.getMessage());
        }
    }

}
