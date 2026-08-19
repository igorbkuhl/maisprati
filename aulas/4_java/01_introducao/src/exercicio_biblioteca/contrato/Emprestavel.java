package exercicio_biblioteca.contrato;

public interface Emprestavel {
    int getPrazoEmprestimoDias();

    double getMultaPorDia();

    boolean emprestar(Usuario usuario);

    boolean devolver();

    default boolean permiteRenovacao() {
        return false;
    }

    default double calcularMulta(int diasAtraso) {
        return diasAtraso <= 0 ? 0 : diasAtraso * this.getMultaPorDia();
    }
}
