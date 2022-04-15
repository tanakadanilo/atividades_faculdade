/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author tanak
 */
public class Calcular {

    public String calcular(float n1, char conta, float n2) throws Exception {

        float resultado = 0;
        switch (conta) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                if (n2 == 0) {
                    throw new Exception("não é possível dividir por 0");
                }
                resultado = n1 / n2;
                break;
            case '^':
                float numeroAtual = n1;
                for (int i = 1; i < n2; i++) {
                    numeroAtual = numeroAtual * n1;
                }
                resultado = numeroAtual;
                break;
            case '√':
                resultado = (float) Math.sqrt(n1);
                break;
        }
        return String.valueOf(resultado);
    }
}
