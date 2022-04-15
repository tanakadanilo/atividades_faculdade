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
public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String razaoSocial, String nome, String endereco, String telefone, String email, float rendaBruta) throws Exception {
        super(nome, endereco, telefone, email, rendaBruta);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    protected float calcularImpostoDeRenda() throws Exception {
        if (rendaBruta == 0) {
            throw new Exception("Primeiro informe o valor da renda bruta");
        }
        return (20.0f / 100.0f) * rendaBruta;
    }

}
