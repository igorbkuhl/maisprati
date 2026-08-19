package pagamentos;

public class Pix implements FormaPagamento {
    public void processar(double valor) {
        System.out.println("Iniciando processamento do PIX...");
        System.out.println("Valor da transferência: R$" + valor);
        System.out.println("Remetente: Antônio da Silva");
        System.out.println("Destinatário: Clara Dias");
        System.out.println("Transferindo valor...");
        System.out.println("Pagamento realizado com sucesso.");
    }

    public double calcularTaxa(double valor) {
        return valor;
    }
}
