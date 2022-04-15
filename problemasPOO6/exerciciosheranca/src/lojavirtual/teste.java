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
public class teste {

    public static void main(String[] args) {

        Livro objetoAtual = new Livro("perdidos em narnia", "Aliens do além","Et do filme",  "terror/comédia", 2002,  2300.45f);
        System.out.println(objetoAtual.obterPrecoDeVenda());
        System.out.println(objetoAtual.obterTipoDoProduto());
        System.out.println(objetoAtual.toString());
        System.out.println(objetoAtual.obterDescricaoProduto());

    }
}
