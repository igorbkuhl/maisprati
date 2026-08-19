package exercicio_biblioteca.modelo;

import exercicio_biblioteca.contrato.Emprestavel;

public abstract class ItemEmprestavel extends ItemAcervo implements Emprestavel {
    private Usuario usuarioAtual;

    protected ItemEmprestavel(String codigo, String titulo, int ano) {
        super(codigo, titulo, ano);
        this.usuarioAtual = null;
    }

    @Override
    public boolean emprestar(Usuario usuario) throws IllegalArgumentException {
        if (usuario == null) {
            throw new IllegalArgumentException("Usuario não pode ser nulo.");
        } else if (!super.isDisponivel()) {
            System.out.println("Item indisponível.");
            return false;
        }

        super.marcarComoEmpestado();
        return true;
    }

    @Override
    public boolean devolver() {
        super.marcarComoDisponivel();
        return true;
    }

    // public String getCategoria() {}
}
