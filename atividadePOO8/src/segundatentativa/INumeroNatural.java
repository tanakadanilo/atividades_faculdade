/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundatentativa;

/**
 *
 * @author tanak
 */
public interface INumeroNatural {

    public boolean ehQuadradoPerfeito();

    public boolean ehCapicua();

    public boolean ehNumeroPerfeito();

    public boolean ehNumeroPrimo();

    public boolean saoPrimosEntreSi(long numeroParaComparar);

    public long calcularMMC(long numeroParaComparar);

    public long calcularMDC(long numeroParaComparar);

    public long calcularFatorial();

    public long converterParaBase2();

    public long converterParaBase8();

    public String converterParaBase16();

}
