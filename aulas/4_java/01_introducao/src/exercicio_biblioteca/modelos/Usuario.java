package exercicio_biblioteca.modelo;

public abstract class Usuario {
    private final String matricula;
    private final String nome;
    private final String email;
    private final ItemAcervo[] itensEmprestados;
    private int quantidadeEmprestada;
    private double multaAcumulada;
    private static int totalUsuariosCriados;

    protected Usuario(String matricula, String nome, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.itensEmprestados = new ItemAcervo[Config.MAXIMO_EMPRESTIMOS];
        this.quantidadeEmprestada = 0;
        this.multaAcumulada = 0;
        totalUsuariosCriados++;
    }

    public abstract int getLimiteDeEmprestimos();

    public abstract double getPercentualDesconto();

    public abstract String getCategoria();

    public double aplicarDesconto(double multaAcumulada) throws IllegalArgumentException {
        if (multaAcumulada < 0) throw new IllegalArgumentException("Multa não pode ser menor do que zero.");
        return multaAcumulada * this.getPercentualDesconto();
    }

    void registrarEmprestimo(ItemAcervo item) {
        this.itensEmprestados[this.quantidadeEmprestada] = item;
        this.quantidadeEmprestada++;
    }

    boolean registrarDevolucao(ItemAcervo item) {
        for (int i = 0; i < this.quantidadeEmprestada; i++) {
            if (!this.itensEmprestados[i].equals(item)) continue;
            for (int j = i; j < this.quantidadeEmprestada - 1; j++) {
                this.itensEmprestados[j] = this.itensEmprestados[j + 1];
            }
            this.itensEmprestados[this.quantidadeEmprestada - 1] = null;
            this.quantidadeEmprestada--;
            return true;
        }

        return false;
    }
}
