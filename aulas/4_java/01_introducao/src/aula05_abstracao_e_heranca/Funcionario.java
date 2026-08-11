package aula05_abstracao_e_heranca;

public abstract class Funcionario {
    protected String nome;
    protected double salario;
    protected final String cpf;

    public Funcionario(String nome, double salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return String.format("Nome: %s\nSalário: %.2f\n", this.nome, this.salario);
    }
}
