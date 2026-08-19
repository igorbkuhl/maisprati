package exercicio_biblioteca.modelo;

public class Revista extends ItemEmprestavel {
    public Revista(String codigo, String titulo, int ano) {
        super(codigo, titulo, ano);
    }

    @Override
    public int getPrazoEmprestimoDias() {
        return 7;
    }

    @Override
    public double getMultaPorDia() {
        return 1;
    }
}
