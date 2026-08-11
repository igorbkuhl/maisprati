package aula03_encapsulamento.model;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) return;
        this.saldo = saldo;
    }
}
