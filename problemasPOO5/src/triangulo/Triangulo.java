/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;

/**
 *
 * @author ALUNO
 */
public class Triangulo {

    private float ladoA = 0.0f;
    private float ladoB = 0.0f;
    private float ladoC = 0.0f;

    public void setLados(float ladoA, float ladoB, float ladoC) throws Exception {
        if (ladoA + ladoB >= ladoC && ladoA + ladoC >= ladoB && ladoB + ladoC >= ladoA) {
            if (ladoB > ladoA) {
                ladoB = ladoB + ladoA;
                ladoA = ladoB - ladoA;
                ladoB = ladoB - ladoA;
            }
            if (ladoC > ladoA) {
                ladoC = ladoA + ladoC;
                ladoA = ladoC - ladoA;
                ladoC = ladoC - ladoA;
            }
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
        } else {
            throw new Exception("Tais valores não formam um triângulo");
        }
    }

    public String calculaTipoTriangulo() {
        String tipoDeTriangulo = "isósceles";
        if (ladoA == ladoB && ladoA == ladoC) {
            tipoDeTriangulo = "Equilátero";
        } else if (ladoA != ladoB && ladoA != ladoC) {
            tipoDeTriangulo = "escaleno";
        }
        return tipoDeTriangulo;
    }

    public String calcularTipoDeTrianguloComBaseNosAngulos() {
        String tipoDeTriangulo = "acutrângulo";

        if ((ladoA * ladoA) > ((ladoB * ladoB) + (ladoC * ladoC))) {
            tipoDeTriangulo = "obtusângulo";
        } else if ((ladoA * ladoA) == ((ladoB * ladoB) + (ladoC * ladoC))) {
            tipoDeTriangulo = "retângulo";
        }
        return tipoDeTriangulo;
    }

    public String cacularArea() {
        double t = (ladoA + ladoB + ladoC) / 2.0;
        return String.valueOf(Math.sqrt((t * (t - ladoA) * (t - ladoB) * (t - ladoC))));
    }
}
