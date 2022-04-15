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
public class Notebook extends LojaVirtual {

    private String marca;
    private String modelo;
    private String processador;
    private String sistemaOperacional;
    private float tamanhoDaTela;
    private int quantidadeMemoriaRam;
    private int capacidadeArmazenamento;

    public Notebook(Produtos codigo, float precoDeVenda) {
        super(codigo, precoDeVenda);
    }

    public Notebook(String marca, String modelo, String processador, String sistemaOperacional, float tamanhoDaTela,
            int quantidadeMemoriaRam, int capacidadeArmazenamento, float precoDeVenda) {

        super(Produtos.NOTEBOOK, precoDeVenda);

        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoDaTela = tamanhoDaTela;
        this.quantidadeMemoriaRam = quantidadeMemoriaRam;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
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

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
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

    public int getQuantidadeMemoriaRam() {
        return quantidadeMemoriaRam;
    }

    public void setQuantidadeMemoriaRam(int quantidadeMemoriaRam) {
        this.quantidadeMemoriaRam = quantidadeMemoriaRam;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    protected String obterDescricaoProduto() {
        String saida = "Dados do Notebook:\n";

        saida += "Marca: " + marca + "\n";
        saida += "Modelo: " + modelo + "\n";
        saida += "Quantidade de memória Ram: " + quantidadeMemoriaRam + "\n";
        saida += "Capacidade de armazenamento do HD/SSD: " + capacidadeArmazenamento + "\n";
        saida += "Processador: " + processador + "\n";
        saida += "Tamanho da tela: " + tamanhoDaTela + "\n";
        saida += "Sistema operacional: " + sistemaOperacional + "\n";
        saida += "Preço de venda: R$ " + super.precoDeVenda + "\n";

        return saida;
    }

    @Override
    protected float obterPrecoDeVenda() {
        return precoDeVenda;
    }

    @Override
    protected String obterTipoDoProduto() {
        return "Notebook";
    }

}
