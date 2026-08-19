package cofrinho_digital;

public class MainCofrinho {
    public static void main(String[] args) {
        CofrinhoDigital cofre = new CofrinhoDigital(0);

        cofre.depositar(15);
        System.out.printf("Saldo: %.2f\n", cofre.getSaldo());

        double total = cofre.quebrar();
        System.out.printf("Total: %.2f\n", total);
        System.out.printf("Saldo atual: %.2f\n", cofre.getSaldo());
    }
}
