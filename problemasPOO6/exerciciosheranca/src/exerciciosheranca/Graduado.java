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
public class Graduado extends Estudante {

    private int anoDaConclusao;
    private int anoDaColacaoDeGrau;
    private int numeroDoDiplomma;

    public Graduado(int anoDaConclusao, int anoDaColacaoDeGrau, int numeroDoDiplomma) {
        this.anoDaConclusao = anoDaConclusao;
        this.anoDaColacaoDeGrau = anoDaColacaoDeGrau;
        this.numeroDoDiplomma = numeroDoDiplomma;
    }

    public Graduado(int anoDaConclusao, int anoDaColacaoDeGrau, int numeroDoDiplomma, String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
        this.anoDaConclusao = anoDaConclusao;
        this.anoDaColacaoDeGrau = anoDaColacaoDeGrau;
        this.numeroDoDiplomma = numeroDoDiplomma;
    }

    public Graduado(int anoDaConclusao, int anoDaColacaoDeGrau, int numeroDoDiplomma, String matricula, String curso, String campus) {
        super(matricula, curso, campus);
        this.anoDaConclusao = anoDaConclusao;
        this.anoDaColacaoDeGrau = anoDaColacaoDeGrau;
        this.numeroDoDiplomma = numeroDoDiplomma;
    }

    public Graduado(int anoDaConclusao, int anoDaColacaoDeGrau, int numeroDoDiplomma, String matricula, String curso, String campus, String nome, String endereco, String telefone, String email) {
        super(matricula, curso, campus, nome, endereco, telefone, email);
        this.anoDaConclusao = anoDaConclusao;
        this.anoDaColacaoDeGrau = anoDaColacaoDeGrau;
        this.numeroDoDiplomma = numeroDoDiplomma;
    }

    public Graduado() {
    }

    public Graduado(String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
    }

    public Graduado(String matricula, String curso, String campus) {
        super(matricula, curso, campus);
    }

    public Graduado(String matricula, String curso, String campus, String nome, String endereco, String telefone, String email) {
        super(matricula, curso, campus, nome, endereco, telefone, email);
    }

    public int getAnoDaConclusao() {
        return anoDaConclusao;
    }

    public void setAnoDaConclusao(int anoDaConclusao) {
        this.anoDaConclusao = anoDaConclusao;
    }

    public int getAnoDaColacaoDeGrau() {
        return anoDaColacaoDeGrau;
    }

    public void setAnoDaColacaoDeGrau(int anoDaColacaoDeGrau) {
        this.anoDaColacaoDeGrau = anoDaColacaoDeGrau;
    }

    public int getNumeroDoDiplomma() {
        return numeroDoDiplomma;
    }

    public void setNumeroDoDiplomma(int numeroDoDiplomma) {
        this.numeroDoDiplomma = numeroDoDiplomma;
    }

    @Override
    public String toString() {
        return super.toString() + "Graduado{" + "anoDaConclusao=" + anoDaConclusao + ", anoDaColacaoDeGrau=" + anoDaColacaoDeGrau + ", numeroDoDiplomma=" + numeroDoDiplomma + '}';
    }

}
