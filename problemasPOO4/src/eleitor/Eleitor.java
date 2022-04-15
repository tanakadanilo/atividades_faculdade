/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleitor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tanak
 */
public class Eleitor {

    private String nome = "";

    private int diaDeNascimento = 0;
    private int mesDeNascimento = 0;
    private int anoDeNascimento = 0;

    private int diaAtual = 0;
    private int mesAtual = 0;
    private int anoAtual = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void setDiaDeNascimento(int diaDeNascimento) {
        this.diaDeNascimento = diaDeNascimento;
    }

    private void setMesDeNascimento(int mesDeNascimento) {
        this.mesDeNascimento = mesDeNascimento;
    }

    private void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public void setDataDeNacimento(String dataCompleta) throws Exception {

        String retornoValidaData = validaData(dataCompleta);
        if (retornoValidaData.equals("data válida")) {

            int indexAno = dataCompleta.lastIndexOf("/");
            setAnoDeNascimento(Integer.parseInt(dataCompleta.substring(indexAno + 1, dataCompleta.length())));

            int indexMes = dataCompleta.indexOf("/");
            setMesDeNascimento(Integer.parseInt(dataCompleta.substring(indexMes + 1, indexAno)));

            setDiaDeNascimento(Integer.parseInt(dataCompleta.substring(0, indexMes)));

        } else {
            throw new Exception(retornoValidaData);
        }
    }

    public String getDataDeNascimento() {
        return diaDeNascimento + "/" + mesDeNascimento + "/" + anoDeNascimento;
    }

    private String validaData(String dataCompleta) {
        setDataAtual();
        
        int ultimoDiaDoMes = 0;

        int indexAno = dataCompleta.lastIndexOf("/");
        int anoParaTeste = (Integer.parseInt(dataCompleta.substring(indexAno + 1, dataCompleta.length())));

        int indexMes = dataCompleta.indexOf("/");
        int mesParaTeste = (Integer.parseInt(dataCompleta.substring(indexMes + 1, indexAno)));

        int diaParaTeste = (Integer.parseInt(dataCompleta.substring(0, indexMes)));

        if (mesParaTeste != 2) {
            if (mesParaTeste <= 7) {
                ultimoDiaDoMes = 30 + (mesParaTeste % 2);
            } else {
                ultimoDiaDoMes = 30 + ((mesParaTeste - 1) % 2);
            }
        } else {
            if (anoParaTeste % 400 == 0 || (anoParaTeste % 4 == 0 && anoParaTeste % 100 != 0)) {
                ultimoDiaDoMes = 29;
            } else {
                ultimoDiaDoMes = 28;
            }
        }

        if (anoParaTeste <= 1900 || anoParaTeste > anoAtual) {
            return "ano de nascimento inválido";
        } else if (mesParaTeste <= 0 || mesParaTeste > 12) {
            return "mês inválido";
        } else if (diaParaTeste > ultimoDiaDoMes) {
            return "dia inválido";
        } else {
            return "data válida";
        }
    }

    public String escolherTipoDeEleitor() {

        int idadeAtual = calcularIdade();
        String tipoDeEleitor = "";
        if (idadeAtual < 16) {
            tipoDeEleitor = "Não eleitor";
        } else if (idadeAtual < 18) {
            tipoDeEleitor = "Eleitor facultativo";
        } else if (idadeAtual <= 65) {
            tipoDeEleitor = "Eleitor obrigatório";
        } else {
            tipoDeEleitor = "Eleitor facultativo";
        }
        return tipoDeEleitor;
    }

    private int calcularIdade() {
        boolean jaFezAniversario = false;
        if (mesDeNascimento > mesAtual) {
            jaFezAniversario = true;
        } else if (mesDeNascimento == mesAtual) {
            if (diaDeNascimento >= diaAtual) {
                jaFezAniversario = true;
            }
        }
        int idadeAtual = anoAtual - anoDeNascimento;
        if (jaFezAniversario) {
            idadeAtual++;
        }
        return idadeAtual;
    }

    private String getDataDoSistema() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private void setDataAtual() {
        String dataCompleta = getDataDoSistema();

        diaAtual = Integer.parseInt(dataCompleta.substring(0, dataCompleta.indexOf("/")));

        mesAtual = Integer.parseInt(dataCompleta.substring((dataCompleta.indexOf("/") + 1), dataCompleta.lastIndexOf("/")));

        anoAtual = Integer.parseInt(dataCompleta.substring((dataCompleta.lastIndexOf("/") + 1), dataCompleta.indexOf(" ")));

    }

}
