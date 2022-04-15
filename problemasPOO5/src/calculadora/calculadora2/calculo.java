/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.calculadora2;

import java.util.Arrays;

/**
 *
 * @author tanak
 */
public class calculo {

    private String conta = "";
    private String[] tiposDeCalculosSuportados;
    private String sinal = "";

    public calculo() {
        this.tiposDeCalculosSuportados = new String[]{"+", "-", "/", "*", "^", "raiz"};
    }

    public String calcular(String conta) throws Exception {

        try {
            this.conta = conta;
            float numero1 = Float.parseFloat(pegarPrimeioNumero());
            float numero2 = Float.parseFloat(pegarSegundoNumero());
            return String.valueOf(fazerCalculo(numero1, numero2));
        } catch (Exception erro) {
            throw new Exception(erro.getMessage());
        }
    }

    private String pegarPrimeioNumero() throws Exception {
        int indexFimPrimeiroNumero = 0;
        for (int i = 0; i < tiposDeCalculosSuportados.length; i++) {
            indexFimPrimeiroNumero = conta.indexOf(tiposDeCalculosSuportados[i]) + 1;
            if (indexFimPrimeiroNumero > 0) {
                if (i <= 4) {
                    sinal = String.valueOf(conta.charAt((indexFimPrimeiroNumero - 1)));
                } else {
                    sinal = conta.substring((indexFimPrimeiroNumero - 1), indexFimPrimeiroNumero + 3);
                }
                break;
            }
        }
        if (indexFimPrimeiroNumero <= 0) {
            throw new Exception("Calculo inválido");
        }
//        throw  new Exception (sinal);
        return (conta.substring(0, (indexFimPrimeiroNumero - 1)));
    }

    private String pegarSegundoNumero() throws Exception {
        int indexComecoSegundoNumero;
        if (sinal.equals("raiz")) {
            indexComecoSegundoNumero = conta.indexOf(sinal) + 4;
        } else {
            indexComecoSegundoNumero = conta.indexOf(sinal) + 1;
        }
        if (indexComecoSegundoNumero <= 0) {
            throw new Exception("Calculo inválido");
        }

        return (conta.substring((indexComecoSegundoNumero)));
    }

    private float fazerCalculo(float numero1, float numero2) throws Exception {
        float resultado = 0;
        switch (sinal) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2 == 0) {
                    throw new Exception("não é possível dividir por 0");
                }
                resultado = numero1 / numero2;
                break;
            case "^":
                resultado = numero1;
                if (numero2 == 0) {
                    throw new Exception("O valor do expoente não pode ser igual a 0");
                }
                for (int i = 1; i < numero2; i++) {
                    resultado = resultado * numero1;
                }
                break;
            case "raiz":
                resultado = numero1;
                if(numero2 < 2){
                    throw  new Exception("O valor da raiz não pode ser menor do que 2");
                }
                for (int i = 1; i < numero2; i++) {
                    resultado = (float) Math.sqrt(resultado);
                }
                break;
        }
        return resultado;
    }

}
