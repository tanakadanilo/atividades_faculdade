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
public class Livro extends LojaVirtual {

    private String titulo;
    private String autor;
    private String tradutor;
    private String editora;
    private int anoPublicacao;

    public Livro(float precoDeVenda) {
        super(Produtos.LIVRO, precoDeVenda);
    }

    public Livro(String titulo, String autor, String editora, String tradutor, int anoPublicacao, float precoDeVenda) {
        super(Produtos.LIVRO, precoDeVenda);
        this.titulo = titulo;
        this.autor = autor;
        this.tradutor = tradutor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    protected String obterDescricaoProduto() {
        String saida = "Dados do livro:\n";
        saida += "Titulo: " + titulo + "\n";
        saida += "Autor: " + autor + "\n";
        saida += "Tradutor: " + tradutor + "\n";
        saida += "Editora: " + editora + "\n";
        saida += "Ano de publicação: " + anoPublicacao + "\n";
        saida += "Preço de venda: R$ " + super.precoDeVenda + "\n";

        return saida;

    }

    @Override
    protected float obterPrecoDeVenda() {
        return super.precoDeVenda;
    }

    @Override
    protected String obterTipoDoProduto() {
        return "livro";
    }

}
