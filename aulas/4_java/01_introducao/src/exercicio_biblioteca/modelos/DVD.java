package exercicio_biblioteca.modelo;

public class DVD extends ItemEmprestavel {
    public DVD(String codigo, String titulo, int ano) {
        super(codigo, titulo, ano);
    }

    @Override
    public int getPrazoEmprestimoDias() {
        return 3;
    }

    @Override
    public double getMultaPorDia() {
        return 2;
    }
}
