package exercicio_biblioteca.modelo;

public class Livro extends ItemEmprestavel implements Reservavel {
    private final String autor;
    private final String isbn;
    private int renovacoesUtilizadas;
    private String nomeReservante;

    private static final int MAXIMO_RENOVACOES = 2;

    public Livro(String codigo, String titulo, int ano, String autor, String isbn) throws IllegalArgumentException {
        super(codigo, titulo, ano);

        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("Autor inválido.");
        }

        this.autor = autor;
        this.isbn = isbn;
        this.renovacoesUtilizadas = null;
    }

    @Override
    public int getPrazoEmprestimoDias() {
        return 14;
    }

    @Override
    public double getMultaPorDia() {
        return 0.5;
    }

    @Override
    public boolean permiteRenovacao() {
        return this.renovacoesUtilizadas < Livro.MAXIMO_RENOVACOES;
    }

    @Override
    public void reservar(Usuario usuario) throws IllegalArgumentException {
        if (usuario == null || usuario.getNome().isBlank()) {
            throw new IllegalArgumentException("Usuario inválido.");
        }

        if (super.isDisponivel()) {
            this.nomeReservante = usuario.getNome();
        }
    }

    @Override
    public boolean temReserva() {
        return this.reservante != null;
    }

    @Override
    public String getNomeReservante() {
        return this.nomeReservante == null ? "-" : this.nomeReservante;
    }

    @Override
    public String getCategoria() {
        return "Livro";
    }

    @Override
    public String getDescricao() {
        return String.format("Autor: %s | ISBN: %s", this.autor, this.isbn);
    }

    public boolean renovar() {
        if (!this.permiteRenovacao) {
            return false;
        }

        this.renovacoesUtilizadas++;
        return true;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getRenovacoesUtilizadas() {
        return this.renovacoesUtilizadas;
    }
}
