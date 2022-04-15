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
public class Cd extends LojaVirtual {

    private String nomeAlbum;
    private String Banda;
    private String cantor;
    private String generoMusical;

    public Cd(float precoDeVenda) {
        super(Produtos.CD, precoDeVenda);
    }

    public Cd(String nomeAlbum, String Banda, String cantor, String generoMusical, float precoDeVenda) {
        super(Produtos.CD, precoDeVenda);
        this.nomeAlbum = nomeAlbum;
        this.Banda = Banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getBanda() {
        return Banda;
    }

    public void setBanda(String Banda) {
        this.Banda = Banda;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    protected String obterDescricaoProduto() {

        String saida = "Dados do CD:\n";
        saida += "Nome do album: " + nomeAlbum + "\n";
        saida += "Banda: " + Banda + "\n";
        saida += "Cantor: " + cantor + "\n";
        saida += "Gênero musical: " + generoMusical + "\n";
        saida += "Preço de venda: R$ " + super.precoDeVenda + "\n";

        return saida;
    }

    @Override
    protected float obterPrecoDeVenda() {
        return super.precoDeVenda;
    }

    @Override
    protected String obterTipoDoProduto() {
        return String.valueOf(super.codigo);
    }

}
