/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojavirtual;

/**
 *
 * @author tanak
 */
public class Tv extends LojaVirtual {

    private String marca;
    private String modelo;
    private String sistemaOperacional;
    private float tamanhoDaTela;

    public Tv( float precoDeVenda) {
        super(Produtos.TV, precoDeVenda);
    }

    public Tv(String marca, String modelo, String sistemaOperacional, float tamanhoDaTelaEmPolegadas, float precoDeVenda) {
        super(Produtos.TV, precoDeVenda);
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoDaTela = tamanhoDaTelaEmPolegadas;
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

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public float getTamanhoDaTela() {
        return tamanhoDaTela;
    }

    public void setTamanhoDaTela(float tamanhoDaTela) {
        this.tamanhoDaTela = tamanhoDaTela;
    }

    @Override
    protected String obterDescricaoProduto() {
        String saida = "Dados da TV:\n";
        
        saida += "Modelo: " + modelo + "\n";
        saida += "Marca: " + marca + "\n";
        saida += "Sistema operacional: " + sistemaOperacional + "\n";
        saida += "Tamanho da tela: " + tamanhoDaTela + "\n";
        saida += "Preço de venda: R$ " + super.precoDeVenda + "\n";
        
        return saida;
    }

    @Override
    protected float obterPrecoDeVenda() {
        return super.precoDeVenda;
    }

    @Override
    protected String obterTipoDoProduto() {
        return "TV";
    }

}
