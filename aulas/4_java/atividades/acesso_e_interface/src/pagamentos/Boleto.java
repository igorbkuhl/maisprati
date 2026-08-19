package pagamentos;

public class Boleto implements FormaPagamento {
    private final double taxa = 2.5;

    public void processar(double valor) {
        System.out.println("Iniciando pagamento via boleto...");
        System.out.println("Valor da transferência: R$" + valor);
        System.out.println("Número serial do boleto: 74293791639270276920728930");
        System.out.println("Realizando transferência...");
        System.out.println("Pagamento realizado com sucesso.");
    }

    public double calcularTaxa(double valor) {
        return valor + this.taxa;
    }
}
