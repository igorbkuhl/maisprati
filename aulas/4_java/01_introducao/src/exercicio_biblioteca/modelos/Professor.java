package exercicio_biblioteca.modelo;

public class Professor extends Usuario {
    public Professor(String matricula, String nome, String email) {
        super(matricula, nome, email);
    }

    @Override
    public int getLimiteDeEmprestimos() {
        return Config.MAXIMO_EMPRESTIMOS;
    }

    @Override
    public double getPercentualDesconto() {
        return 0.5;
    }
}
