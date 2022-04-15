/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosheranca;

/**
 *
 * @author tanak
 */
public class Trabalhador extends Pessoa {

    private String funcao;
    private String departamento;
    private float salario;

    public Trabalhador() {
    }

    public Trabalhador(String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
    }

    public Trabalhador(String funcao, String departamento, float salario) {
        this.funcao = funcao;
        this.departamento = departamento;
        this.salario = salario;
    }

    public Trabalhador(String funcao, String departamento, float salario, String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
        this.funcao = funcao;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "Trabalhador{" + "funcao=" + funcao + ", departamento=" + departamento + ", salario=" + salario + '}';
    }

}
