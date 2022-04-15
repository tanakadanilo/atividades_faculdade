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
public abstract class LojaVirtual {

    protected Produtos codigo;
    protected float precoDeVenda;

    public LojaVirtual(Produtos codigo, float precoDeVenda) {
        this.codigo = codigo;
        this.precoDeVenda = precoDeVenda;
    }

    abstract protected String obterDescricaoProduto();

    abstract protected float obterPrecoDeVenda();

    abstract protected String obterTipoDoProduto();
    
    

}
