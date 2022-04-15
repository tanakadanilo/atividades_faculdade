/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author tanak
 */
abstract public class Pessoa {

    protected String nome = "";
    protected String endereco = "";
    protected String telefone = "";
    protected String email = "";
    protected float rendaBruta = 0;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone, String email, float rendaBruta) throws Exception {
        if (rendaBruta <= 0) {
            throw new Exception("O valor da renda bruta não pode ser menor nem igual a zero");
        }
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(float rendaBruta) throws Exception {
        if (rendaBruta <= 0) {
            throw new Exception("O valor da renda bruta não pode ser menor nem igual a zero");
        }
        this.rendaBruta = rendaBruta;
    }

    abstract protected float calcularImpostoDeRenda() throws Exception;
}
