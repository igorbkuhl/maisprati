package pagamentos;

public class CartaoCredito implements FormaPagamento {
    private final double taxa = 0.3;

    public void processar(double valor) {
        System.out.println("Iniciando pagamento via cartão de crédito...");
        System.out.println("Valor da transferência: R$" + valor);
        System.out.println("Conta encontrada com número do cartão: 2345-33");
        System.out.println("Conta do destinatário: 1213-22");
        System.out.println("Transferindo valor...");
        System.out.println("Pagamento realizado com sucesso.");
    }

    public double calcularTaxa(double valor) {
        return valor + (valor * this.taxa);
    }
}
