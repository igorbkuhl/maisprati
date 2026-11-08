package exercicio_biblioteca.modelo;

public class Tese extends ItemEmprestavel {
    public Tese(String codigo, String titulo, int ano) {
        super(codigo, titulo, ano);
    }

    @Override
    public int getPrazoEmprestimoDias() {
        return 7;
    }

    @Override
    public double getMultaPorDia() {
        return 1.5;
    }
}
