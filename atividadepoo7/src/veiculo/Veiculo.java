/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

/**
 *
 * @author tanak
 */
public class Veiculo {

    protected double velocidade = 0;
    /* * 
        * A variavel  velocidade não pode ter getters nem setters, nem ser inicializada no construtor,
        * pois este valor só pode ser modificado usando os metodos correspondentes.
        *
     */

    protected String marca;
    protected String modelo;
    protected String cor;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidade() {
        return velocidade;
    }

}
