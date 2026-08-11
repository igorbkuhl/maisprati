package aula05_abstracao_e_heranca;

public class Vendedor extends Funcionario {
    private double totalVendas;
    private static final double COMISSAO = 0.15;

    public Vendedor(String nome, double salario, String cpf, double totalVendas) {
        super(nome, salario, cpf);
        this.totalVendas = totalVendas;
    }

    public double calcularSalario() {
        return super.salario + (this.totalVendas * COMISSAO);
    }
}
