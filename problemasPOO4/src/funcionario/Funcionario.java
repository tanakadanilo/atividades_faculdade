/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author tanak
 */
public class Funcionario {

    private String nome = "";
    private float salarioMensalAntesDoAumento = 0.0f;
    private float salarioMensalDepoisDoAumento = 0.0f;
    private int quantidadeFilhos = 0;
    private float aumento = 0.0f;

    public float getAumento() {
        return aumento;
    }

    public void setAumento(float aumento) throws Exception {
        if (aumento < 0) {
            throw new Exception("O valor do aumento salarial não pode ser negativo");
        }
        this.aumento = aumento;
        calcularAumentoDeSalario();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salarioMensalAntesDoAumento;
    }

    public void setSalario(float salario) throws Exception {
        if (salario <= 0) {
            throw new Exception("O valor do salário não pode ser negativo nem igual  a 0");
        }
        this.salarioMensalAntesDoAumento = salario;
    }

    public float getSalarioMensalDepoisDoAumento() {
        return salarioMensalDepoisDoAumento;
    }

    public int getFilhos() {
        return quantidadeFilhos;
    }

    public void setFilhos(int filhos) throws Exception {
        if (filhos < 0) {
            throw new Exception("Uma pessoa não pode ter uma numero negativo de filhos...");
        }
        this.quantidadeFilhos = filhos;
    }
    //metodos

    private float calcularAumentoDeSalario() {
        salarioMensalDepoisDoAumento = salarioMensalAntesDoAumento + (float) (salarioMensalAntesDoAumento * (aumento / 100.0));

        return salarioMensalDepoisDoAumento - salarioMensalAntesDoAumento;
    }

    public float calcularValorInss() {
        if (salarioMensalDepoisDoAumento <= 3545) {
            return (float) (salarioMensalDepoisDoAumento * (6.0 / 100));
        } else {
            return (float) (salarioMensalDepoisDoAumento * (10.0 / 100));
        }
    }

    public String calcularParcelaImpostoDeRenda() {
        if (salarioMensalDepoisDoAumento <= 2903.98) {
            return "Isento de impostos";

        } else if (salarioMensalDepoisDoAumento <= 3826.66) {
            return String.valueOf(salarioMensalDepoisDoAumento * (7.5 / 100));

        } else if (salarioMensalDepoisDoAumento <= 4751.05) {
            return String.valueOf(salarioMensalDepoisDoAumento * (15.0 / 100));

        } else if (salarioMensalDepoisDoAumento <= 5664.68) {
            return String.valueOf(salarioMensalDepoisDoAumento * (22.5 / 100));

        } else {
            return String.valueOf(salarioMensalDepoisDoAumento * (27.5 / 100));

        }
    }

    public double calcularValorMensalIrpf() {
        if ("Isento de impostos".equals(calcularParcelaImpostoDeRenda())) {
            return 0;
        } else {
            double valorIrpf = (Double.parseDouble(calcularParcelaImpostoDeRenda()) - (Double.parseDouble(calcularParcelaImpostoDeRenda()) - (145 * quantidadeFilhos)));
            if (valorIrpf <= 0) {
                return 0;
            } else {
                return valorIrpf;
            }
        }
    }
}
