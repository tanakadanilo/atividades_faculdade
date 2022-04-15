/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleitor;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author tanak
 */
public class GetData {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String dataCompleta = dateFormat.format(date);
        int dia = Integer.parseInt(dataCompleta.substring(0, dataCompleta.indexOf("/")));
        
        
        int mes = Integer.parseInt(dataCompleta.substring((dataCompleta.indexOf("/") + 1), dataCompleta.lastIndexOf("/")));

        int ano = Integer.parseInt(dataCompleta.substring((dataCompleta.lastIndexOf("/") + 1), dataCompleta.indexOf(" ")));


        System.out.println("dia: " + dia);
        System.out.println("mes: " + mes);
        System.out.println("ano: " + ano);
    }

    private String getDataDoSistema() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private void setData() {
        String dataCompleta = getDataDoSistema();
        int dia = Integer.parseInt(dataCompleta.substring(0, dataCompleta.indexOf("/")));

        int mes = Integer.parseInt(dataCompleta.substring(dataCompleta.indexOf("/"), dataCompleta.indexOf("/", dataCompleta.indexOf("/"))));

        int ano = Integer.parseInt(dataCompleta.substring(dataCompleta.indexOf("/", dataCompleta.indexOf("/")), dataCompleta.indexOf(" ")));

        System.out.println("dia: " + dia);
        System.out.println("mes: " + mes);
        System.out.println("ano: " + ano);
    }

}
