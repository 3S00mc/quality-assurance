package junit;

public class Conta {

    private String numeroDaConta;
    private double saldo;

    public Conta(String numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
