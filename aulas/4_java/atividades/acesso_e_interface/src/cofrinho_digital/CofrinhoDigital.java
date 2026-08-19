package cofrinho_digital;

public class CofrinhoDigital {
    private double saldo;

    public CofrinhoDigital(double valor) throws IllegalArgumentException {
        conferirValor(valor);
        this.saldo = valor;
    }

    public void depositar(double valor) throws IllegalArgumentException {
        conferirValor(valor);
        this.saldo += valor;
    }

    public double quebrar() {
        double total = this.saldo;
        this.saldo = 0;
        return total;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void conferirValor(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor depositado deve ser positivo.");
        }
    }
}
