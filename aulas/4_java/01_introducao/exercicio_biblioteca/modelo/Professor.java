package exercicio_biblioteca.modelo;

import exercicio_biblioteca.contrato.Config;

public class Professor extends Usuario {
    public Professor(String matricula, String nome, String email) {
        super(matricula, nome, email);
    }

    @Override
    public String getCategoria() {
        return "Professor";
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
