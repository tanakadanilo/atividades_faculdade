/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equacaosegundograu;

/**
 *
 * @author ALUNO
 */
public class EquacaoSegundoGrau {

    private int coeficienteA = 0;
    private int coeficienteB = 0;
    private int coeficienteC = 0;

    public int getCoeficienteA() {
        return coeficienteA;
    }

    public void setCoeficienteA(int coeficienteA) throws Exception {
        if (coeficienteA == 0) {
            throw new Exception("caso o valor do coeficente A seja 0, a equação não é de"
                    + " segundo grau, mas sim uma equação de primeiro grau");
        }
        this.coeficienteA = coeficienteA;
    }

    public int getCoeficienteB() {
        return coeficienteB;
    }

    public void setCoeficienteB(int coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public int getCoeficienteC() {
        return coeficienteC;
    }

    public void setCoeficienteC(int coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

    public double calcularDelta() {
        double delta = ((coeficienteB * coeficienteB) + (-4 * coeficienteA * coeficienteC));
        return delta;
    }

    public String calcularQuantidadeDeRaizesPossiveis() {
        double delta = calcularDelta();

        String saida = "";
        if (delta < 0) {
            saida += "nenhuma raíz real\n";
        } else if (delta == 0) {
            saida += "uma raiz real\n";
        } else {
            saida += "duas raizes reais\n";
        }
        return saida;
    }

    public String calcularEquacaoDeSegundoGrau() {
        String saida = "Resultado da equação: " + coeficienteA + "X² + " + coeficienteB + "X + " + coeficienteC + "\n";

        double delta = calcularDelta();
        saida += "Valor de delta: " + delta + "\n";

        saida += "Quantidade de raizes reais possíveis: ";
        String quantidadeDeRaizes = calcularQuantidadeDeRaizesPossiveis();
        if (quantidadeDeRaizes.equals("duas raizes reais\n")) {

            double x1 = (((-coeficienteB) + Math.sqrt(delta)) / (2 * coeficienteA));
            double x2 = (((-coeficienteB) +(- Math.sqrt(delta))) / (2 * coeficienteA));

            saida += quantidadeDeRaizes + "\n";
            saida += "X1 = " + x1 + "\n";
            saida += "X2 = " + x2 + "\n";
        } else if (quantidadeDeRaizes.equals("uma raiz real\n")) {
            double x = (-coeficienteB / (2 * coeficienteA));
            saida += quantidadeDeRaizes + "\n";

            saida += "X = " + x;
        } else {
            saida += "nenhuma raiz real";
        }
        return saida;

    }

}
