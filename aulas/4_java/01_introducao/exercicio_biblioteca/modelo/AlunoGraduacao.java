package exercicio_biblioteca.modelo;

public class AlunoGraduacao extends Usuario {
    private final String curso;
    private final int limiteItens;

    public AlunoGraduacao(String matricula, String nome, String email, String curso, int limiteItens) {
        super(matricula, nome, email);
        this.curso = curso;
        this.limiteItens = limiteItens;
    }

    @Override
    public String getCategoria() {
        return "Graduação";
    }

    @Override
    public double getPercentualDesconto() {
        return 0d;
    }

    @Override
    public int getLimiteDeEmprestimos() {
        return limiteItens;
    }
}
