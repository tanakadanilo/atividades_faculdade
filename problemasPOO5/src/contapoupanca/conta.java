package contapoupanca;

public class conta {

    private String nomeCliente = "";
    private int numeroConta = 0;
    private int numeroAgencia = 0;
    private int saldo = 0;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getSaldo() {
        return saldo;
    }

    public float sacar(int valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("valor não pode ser <= 0");
        }
        if (valor >= saldo) {
            throw new Exception("sem fundo");
        }
        saldo -= valor;
        return valor;
    }

    public void depositar(int valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("o valor nao pode ser <=0");
        }
        saldo += valor;
    }
}
