/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepoo8;

import java.util.Scanner;

/**
 *
 * @author tanak
 */
public class Teste {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        while (true) {
            try {
                NumeroNatural numeroAtual = new NumeroNatural(leia.nextInt(), leia.nextInt());
                System.out.println(numeroAtual.calcular());
//            System.out.println(numeroAtual.getDivisores());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
