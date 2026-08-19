package exercicio_biblioteca.modelo;

public class ObraReferencia extends ItemAcervo {
    private final String tipoObra;
    private final String localizacaoEstante;

    public ObraReferencia(
            String titulo,
            String autor,
            String editora,
            String anoPublicacao,
            String tipoObra,
            String localizacaoEstante) {
        super(titulo, autor, editora, anoPublicacao);
        this.tipoObra = tipoObra;
        this.localizacaoEstante = localizacaoEstante;
    }

    public void consultarNoLocal(Usuario usuario) {
        System.out.printf("Obra de referência consultada pelo usuário: %s\n", usuario.getNome());
        System.out.printf("Localização da obra de referência: %s\n", this.localizacaoEstante);
    }

    @Override
    public String getCategoria() {
        return "Referência";
    }

    @Override
    public String getDescricaoDetalhada() {
        return String.format("Tipo de obra: %s\nLocalização na estante: %s", this.tipoObra, this.localizacaoEstante);
    }

    public String getLocalizacaoEstante() {
        return this.localizacaoEstante;
    }

    @Override
    public int getPrazoEmprestimoDias() {
        return 0;
    }

    @Override
    public double getMultaPorDia() {
        return 0;
    }
}
