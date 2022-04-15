/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepoo8;

/**
 *
 * @author tanak
 */
public class NumeroNatural {

    private int numero1;
    private int numero2;
    private int divisoresNumero1[];
    private int divisoresNumero2[];
    private int divisoresComuns[];

    public NumeroNatural(int numero1, int numero2) throws Exception {
        if (numero1 <= 0 || numero2 <= 0) {
            throw new Exception("Esse não é um numero Natural não nulo");
        }
        this.numero1 = numero1;
        this.numero2 = numero2;

        divisoresNumero1 = new int[(numero1 / 2) + 1];
        divisoresNumero2 = new int[(numero2 / 2) + 1];
        divisoresComuns = new int[(numero1 + numero2) / 2];

        calcularDivisoresNumero1();
        calcularDivisoresNumero2();
        divisoresComuns = calcularDivisoresComuns();

    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) throws Exception {
        if (numero1 <= 0) {
            throw new Exception("Esse não é um numero Natural não nulo");
        }
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) throws Exception {
        if (numero2 <= 0) {
            throw new Exception();
        }
        this.numero2 = numero2;
    }

    public String calcular() {
        String saida = "Dados do número: " + numero1 + "\n";
        saida += "Fatorial = " + calcularFatorialDoNumero(numero1) + "\n";
        saida += "É numero perfeito? " + ehNumeroPerfeito(numero1) + "\n";
        saida += "É capicua? " + ehCapicua(numero1) + "\n";
        saida += "É quadrado perfeito? " + ehQuadradoPerfeito(numero1) + "\n";
        saida += "É primo? " + ehPrimo(numero1) + "\n";

        saida += "\n\n";

        saida += "Dados do número: " + numero2 + "\n";
        saida += "Fatorial = " + calcularFatorialDoNumero(numero2) + "\n";
        saida += "É numero perfeito? " + ehNumeroPerfeito(numero2) + "\n";
        saida += "É capicua? " + ehCapicua(numero2) + "\n";
        saida += "É quadrado perfeito? " + ehQuadradoPerfeito(numero2) + "\n";
        saida += "É primo? " + ehPrimo(numero2) + "\n";

        saida += "\n\n";

        saida += "Máximo divisor comum de: " + numero1 + " e " + numero2 + " = " + calcularMDC() + "\n";
        saida += "Minimo multiplo comum de: " + numero1 + " e " + numero2 + " = " + calcularMMC() + "\n";

//        saida += "Divisores comuns: ";
//        for (int i = 0; i < divisoresMMC.length; i++) {
//            saida += divisoresMMC[i] + "\t";
//
//        }
        return saida;
    }

    private void calcularDivisoresNumero1() {
        int index = 0;
        int divisorAtual = 1;
        int auxNumero1 = numero1;
        while (auxNumero1 > 1) {
            if (auxNumero1 % divisorAtual == 0) {
                divisoresNumero1[index] = divisorAtual;
                index++;
                auxNumero1 /= divisorAtual;
                divisorAtual = 2;
            } else {
                divisorAtual++;
            }
        }
    }

    private void calcularDivisoresNumero2() {
        int index = 0;
        int divisorAtual = 1;
        int auxNumero2 = numero2;
        while (auxNumero2 > 1) {
            if (auxNumero2 % divisorAtual == 0) {
                divisoresNumero2[index] = divisorAtual;
                index++;
                auxNumero2 /= divisorAtual;
                divisorAtual = 2;
            } else {
                divisorAtual++;
            }
        }
    }

    private long calcularFatorialDoNumero(int numero) {
        long resultado = numero;
        long fatorialAtual = numero - 1;
        for (int i = 0; i < (numero - 1); i++) {
            resultado *= fatorialAtual;
            fatorialAtual--;
        }

        return resultado;
    }

    private boolean ehNumeroPerfeito(int numero) {
        int somaDivisores = 0;
        if (numero == numero1) {
            for (int i = 0; i < divisoresNumero1.length; i++) {

                somaDivisores += divisoresNumero1[i];
            }
        } else {
            for (int i = 0; i < divisoresNumero2.length; i++) {

                somaDivisores += divisoresNumero2[i];
            }

        }
        return (somaDivisores == numero1);
    }

    private boolean ehCapicua(int numero) {

        int peso = 1;//esssa variável diz quall numero quero, em relação ao ultimo digito

        int auxNumero = numero;// essa variável é pra não mecher no valor da variável numero
        int numeroAtual = numero / 10;
        int quantidadeDeDigitos = 0;
        for (int i = 0; auxNumero != numeroAtual; i++) { //pegar a quantidade de digitos do numero
            auxNumero = numeroAtual;
            numeroAtual /= 10;

            quantidadeDeDigitos++;
        }
        auxNumero = numero;

        for (int i = 0; i < quantidadeDeDigitos / 2; i++) {//só vai conferir até a metade da quantidade de digitos, pq depois disso já vai repetir

            int numeroDireita = auxNumero;
            int numeroEsquerda = auxNumero;

            numeroDireita %= (Math.pow(10, peso));//pegando o numero da direita, mas com talvez mais de uma casa decimal
            if (peso > 1) {
                numeroDireita /= (Math.pow(10, (peso - 1)));//apagando as casas extras, para ficar so com um digito
            }
            numeroEsquerda = auxNumero;
            for (int j = 0; j < (quantidadeDeDigitos - peso); j++) {
                numeroEsquerda /= 10;
            }
            numeroEsquerda %= 10;
            if (numeroDireita != numeroEsquerda) {//se encontrou algum número diferente, não é capicua
                return false;
            }
            peso++;//aumentando o peso, pois agora quero o próximo digito
        }

        return true;// se chegou até aqui, é pq o numero é capicua
    }

    private boolean ehQuadradoPerfeito(int numero) {
        double raizQuadrada = Math.sqrt(numero);
        return (raizQuadrada == (int) raizQuadrada);
    }

    private boolean ehPrimo(int numero) {
//        if (numero == 1) {
//            return false;
//        }
//        if (numero == 2) {
//            return true;
//        }
//        int divisorAtual = 2;
//        for (int i = 0; i < numero / 2; i++) {
//            if (numero % divisorAtual == 0) {//se tiver divisor natural
//                return false;
//            }
//            divisorAtual++;
//        }
//        return true;//se chegou até aqui, não possui divisor natural

        if (numero == numero1) {
            for (int i = 0; i < divisoresNumero1.length; i++) {
                if (divisoresNumero1[i] == 0) {// se for 0 é uma posição vazia, então acabou
                    break;
                }
                if (divisoresNumero1[i] != 1 && divisoresNumero1[i] != numero) { // se tiver algum divisor diferente de 1 ele não é primo
                    return false;
                }
            }

        } else {
            for (int i = 0; i < divisoresNumero2.length; i++) {
                if (divisoresNumero2[i] == 0) {// se for 0 é uma posição vazia, então acabou
                    break;
                }
                if (divisoresNumero2[i] != 1 && divisoresNumero2[i] != numero) { // se tiver algum divisor diferente de 1 ele não é primo
                    return false;
                }
            }

        }
        return true;
    }

    private int calcularMDC() {

        int mdc = 1;
        for (int i = 0; i < divisoresComuns.length; i++) {
            if (divisoresComuns[i] == 0) {//caso encontre uma posição vazia
                break;
            } else {
                mdc *= divisoresComuns[i];
            }
        }
        return mdc;
    }

    private int[] pegarDivisoresComuns() {

        int divisoresComuns[];
        int auxNumero1 = this.numero1;//essas variáveis são para não modificar as variaveis globais
        int auxNumero2 = this.numero2;

        if (auxNumero1 > auxNumero2) {
            divisoresComuns = new int[auxNumero1];
        } else {
            divisoresComuns = new int[auxNumero2];
        }

        int index = 0;
        int divisorAtual = 1;
        while (auxNumero1 >= 2 && auxNumero2 >= 2) {//parar só quando os dois numeros não tiverem mais divisores
            if ((auxNumero1 % divisorAtual == 0) && (auxNumero2 % divisorAtual == 0)) {
                divisoresComuns[index] = divisorAtual;
                index++;

                auxNumero1 /= divisorAtual;
                auxNumero2 /= divisorAtual;
                divisorAtual = 2;// recomeçar divisor,pois o numero base mudou

            } else {
                divisorAtual++;
            }
        }
        return divisoresComuns;
    }

    private int[] calcularDivisoresMMC() {
        int divisorAtual = 1;
        int maiorNumero = numero2;
        if (numero1 > numero2) {
            maiorNumero = numero1;
        }

        int[] divisoresMMC = new int[maiorNumero];
        int index = 0;

        int auxNumero1 = numero1;
        int auxNumero2 = numero2;

        while (auxNumero1 > 1 || auxNumero2 > 1) {
            if (auxNumero1 % divisorAtual == 0 && auxNumero2 % divisorAtual == 0) {
                divisoresMMC[index] = divisorAtual;
                index++;

                auxNumero1 /= divisorAtual;
                auxNumero2 /= divisorAtual;

                divisorAtual = 2;

            } else if (auxNumero1 % divisorAtual == 0) {

                divisoresMMC[index] = divisorAtual;
                index++;

                auxNumero1 /= divisorAtual;

                divisorAtual = 2;

            } else if (auxNumero2 % divisorAtual == 0) {
                divisoresMMC[index] = divisorAtual;
                index++;

                auxNumero2 /= divisorAtual;

                divisorAtual = 2;

            } else {//caso nenhum dos dois sejam divisiveis pelo divisorAtual
                divisorAtual++;
            }
        }
        return divisoresMMC;
    }

    private int calcularMMC() {
        int[] divisoresMMC = calcularDivisoresMMC();
        int mmc = 1;
        for (int i = 0; i < divisoresMMC.length; i++) {
            if (divisoresMMC[i] == 0) {
                break;
            } else {
                mmc *= divisoresMMC[i];
            }
        }
        return mmc;
    }

    private int[] calcularDivisoresComuns() {
        int menorNumero;
        if (numero1 < numero2) {
            menorNumero = numero1;
        } else {
            menorNumero = numero2;
        }

        int divisor = 1;
        int index = 0;

        int auxNumero1 = numero1;
        int auxNumero2 = numero2;

        while ((auxNumero1 > 1 || auxNumero2 > 1)) {
            if ((auxNumero1 % divisor == 0) && (auxNumero2 % divisor == 0)) {//caso ambos sejam divisíveis
                divisoresComuns[index] = divisor;
                index++;

                auxNumero1 /= divisor;
                auxNumero2 /= divisor;

                divisor = 2;
            } else {
                divisor++;
                if (divisor > menorNumero) {
                    break;
                }
            }

//   fim do for
        }
        return divisoresComuns;
    }

    public String getDivisores() {
        String saida = "Divisores numero 1: \n";
        for (int i = 0; i < divisoresNumero1.length; i++) {
            saida += divisoresNumero1[i] + "\t";
        }
        saida += "Divisores numero 2 \n";
        for (int i = 0; i < divisoresNumero2.length; i++) {
            saida += divisoresNumero2[i] + "\t";

        }
        saida += "Divisores Comuns \n";

        for (int i = 0; i < divisoresComuns.length; i++) {
            saida += divisoresComuns[i] + "\t";

        }
        return saida;
    }
    
   
}
