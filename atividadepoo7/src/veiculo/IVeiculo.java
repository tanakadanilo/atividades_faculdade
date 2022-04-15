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
public interface IVeiculo {
    
    abstract public void virar(double  angulo)throws Exception;
    abstract public void acelerar(double quantidadeAumentoVelocidade)throws Exception;
    abstract public void freiar(double quantidadeReducaoVelocidade)throws Exception;
}
