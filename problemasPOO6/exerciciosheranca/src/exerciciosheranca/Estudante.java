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
public class Estudante extends Pessoa {

    protected String matricula = "";
    protected String curso = "";
    protected String campus = "";

    public Estudante() {
        super();
    }

    public Estudante(String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
    }

    public Estudante(String matricula, String curso, String campus) {
        this.matricula = matricula;
        this.curso = curso;
        this.campus = campus;
    }

    public Estudante(String matricula, String curso, String campus, String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
        this.matricula = matricula;
        this.curso = curso;
        this.campus = campus;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudante{" + "matricula=" + matricula + ", curso=" + curso + ", campus=" + campus + '}';
    }
    
    
    
    

}
