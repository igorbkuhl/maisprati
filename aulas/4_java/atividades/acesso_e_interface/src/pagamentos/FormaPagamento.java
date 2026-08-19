package pagamentos;

public interface FormaPagamento {
    void processar(double valor);

    void calcularTaxa(double valor);
}
