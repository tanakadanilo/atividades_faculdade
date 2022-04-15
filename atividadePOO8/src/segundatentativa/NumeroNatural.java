//não fiz o MDC
package segundatentativa;

/**
 *
 * @author tanak
 */
public class NumeroNatural implements INumeroNatural {

    private long valor = 0;

    public NumeroNatural(long valor) throws Exception {
        if (valor < 0) {
            throw new Exception("Numeros negativos não são numeros Naturais, informe um número inteiro positivo");
        }
        this.valor = valor;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    @Override
    public boolean ehQuadradoPerfeito() {
        double raizQuadrada = Math.sqrt(valor);

        return (raizQuadrada == (int) (raizQuadrada));
    }

    @Override
    public boolean ehCapicua() {

        long aux = valor;
        long valorInvertido = 0;

        while (aux != 0) {
            valorInvertido = (valorInvertido * 10) + (aux % 10);
            aux /= 10;
        }

        return (valor == valorInvertido);
    }

    @Override
    public boolean ehNumeroPerfeito() {

        long aux = valor;
        long divisor = 1;// deve começar em 1, pq o um deve ser somado no resultado

        long somaDivisores = 0;
        while (divisor <= (aux / 2)) {
            if (aux % divisor == 0) {

                somaDivisores += divisor;

            }
            divisor++;

        }
        return (somaDivisores == valor);

    }

    @Override
    public boolean ehNumeroPrimo() {

        if (valor <= 1) {
            return false;// nem o numero 0 nem o numero 1 são numeros primos
        }

        boolean ehPrimo = true;
        long divisor = 2;

        while (divisor <= (valor / 2)) {
            if (valor % divisor == 0) {
                ehPrimo = false;
                break;
            }
            divisor++;

        }
        return ehPrimo;
    }

    @Override
    public long calcularMMC(long numeroParaComparar) {
        long aux = valor;
        long divisor = 1;
        long mmc = 1;

        while (divisor <= aux || divisor <= numeroParaComparar) {
            if (aux % divisor == 0 || numeroParaComparar % divisor == 0) { // caso ao menos um deles seja divisível

                if (aux % divisor == 0) {// caso aux seja divisível
                    aux /= divisor;
                }
                if (numeroParaComparar % divisor == 0) {// caso o numeroParaComparar seja divisível
                    numeroParaComparar /= divisor;
                }
                mmc *= divisor;
                divisor = 2;

            } else {//caso nenhum deles seja divisível
                divisor++;
            }
        }

        return mmc;
    }

    @Override
    public long calcularMDC(long numeroParaComparar) {

        long aux = valor;
        long divisor = 2;
        long mdc = 1;

        while (divisor < aux && divisor < numeroParaComparar) {

            if (aux % divisor == 0 && numeroParaComparar % divisor == 0) {
                aux /= divisor;
                numeroParaComparar /= divisor;

                mdc *= divisor;
                divisor = 2;
            } else {
                divisor++;
            }
        }

        return mdc;
    }

    @Override
    public long calcularFatorial() {
        long fatorial = 1;
        long aux = valor;

        while (aux > 1) {
            fatorial *= aux;
            aux--;
        }
        return fatorial;
    }

    @Override
    public long converterParaBase2() {
        long binaria = 0;
        long aux = valor;
        int posicao = 0;

        while (aux > 0) {
            binaria = (int) ((aux % 2) * Math.pow(10, posicao) + binaria);
            aux /= 2;

            posicao++;
        }

        return binaria;
    }

    @Override
    public long converterParaBase8() {
        long octal = 0;
        long aux = valor;
        int posicao = 0;

        while (aux != 0) {//pegando o valor de octal, mas invertido
            octal = ((int) Math.pow(10, posicao) * (aux % 8)) + octal;
            aux /= 8;

            posicao++;
        }
        return octal;
    }

    @Override
    public String converterParaBase16() {

        long aux = valor;
        String valores = "0123456789ABCDEF";
        String hexadecimal = "";
        int resto;

        while (aux > 0) {
            resto = (int) aux % 16;
            hexadecimal = valores.charAt(resto) + hexadecimal;

            aux /= 16;
        }
        return hexadecimal;
    }

    public String converterParaBaseN(int base) throws Exception {
        if (base <= 1) {
            throw new Exception("O valor da base deve ser maior ou igual a 2");
        }

        long aux = valor;
        String convertido = "";

        if (base <= 9) {// todas as conversões  de base menor q nove, seguem a mesma lógica
            while (aux > 0) {
                convertido = (aux % base) + convertido;
                aux /= base;
            }
        } else if (base <= 36) {
            String valores = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            while (aux > 0) {
                convertido = valores.charAt((int) aux % base) + convertido;
                aux /= base;
            }
        }

        return convertido;
    }

    @Override
    public boolean saoPrimosEntreSi(long numeroParaComparar
    ) {
        long aux = valor;
        long divisor = 2;

        boolean saoPrimosEntreSi = true;

        while (divisor <= (aux / 2) && divisor <= (numeroParaComparar / 2)) {

            if (aux % divisor == 0 && numeroParaComparar % divisor == 0) {

                saoPrimosEntreSi = false;
                break;

            } else {
                divisor++;
            }
        }
        return saoPrimosEntreSi;
    }

}
