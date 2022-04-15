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
public class PessoaFisica extends Pessoa {

    private String cpf;
    private String sexo;

    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, String sexo, String nome, String endereco, String telefone, String email, float rendaBruta) throws Exception {
        super(nome, endereco, telefone, email, rendaBruta);
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    protected float calcularImpostoDeRenda() throws Exception {
        float porcentagemImpostoDeRenda;
        if (rendaBruta == 0) {
            throw new Exception("Primeiro informe o valor da renda bruta");
        }

        if (rendaBruta < 1400) {
            porcentagemImpostoDeRenda = 0;
        } else if (rendaBruta < 2100) {
            porcentagemImpostoDeRenda = 10.0f / 100.0f;
        } else if (rendaBruta < 2800) {
            porcentagemImpostoDeRenda = 15.0f / 100.0f;
        } else if (rendaBruta < 3600) {
            porcentagemImpostoDeRenda = 25.0f / 100.0f;
        } else {
            porcentagemImpostoDeRenda = 30.0f / 100.0f;
        }

        return porcentagemImpostoDeRenda * rendaBruta;
    }

}
