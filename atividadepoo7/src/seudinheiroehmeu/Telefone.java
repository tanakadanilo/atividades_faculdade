/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seudinheiroehmeu;

/**
 *
 * @author tanak
 */
public class Telefone {

    private String ddi;
    private String ddd;
    private String numeroTelefone;

    public Telefone(String ddi, String ddd, String numeroTelefone) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;
    }

    public Telefone(String telefone) throws Exception {
        switch (telefone.length()) {
            case 13:
                this.ddi = telefone.substring(0, 2);
                this.ddd = telefone.substring(2, 4);
                this.numeroTelefone = telefone.substring(4);
                break;
            case 11:
                this.ddi = "55";
                this.ddd = telefone.substring(0, 2);
                this.numeroTelefone = telefone.substring(2);
                break;
            default:
                throw new Exception("Telefone inválido! Informe um telefone com 9 digitos mais um DDD e um DDI");
        }
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getTelefone() {
        return '+' + this.ddi + '(' + this.ddd + ')' + ' ' + this.numeroTelefone;
    }

}
