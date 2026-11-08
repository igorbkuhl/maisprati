package exercicio_biblioteca.modelo;

public abstract class ItemAcervo {
    private final String codigo;
    private final String titulo;
    private final Integer ano;
    private boolean disponivel;
    private static int totalItensCriados = 0;

    protected ItemAcervo(String codigo, String titulo, Integer ano) throws IllegalArgumentException {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código inválido.");
        } else if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Título inválido.");
        } else if (ano == null || ano < 0) {
            throw new IllegalArgumentException("Ano inválido.");
        }

        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.disponivel = true;
        totalItensCriados++;
    }

    public abstract String getCategoria();

    public abstract String getDescricao();

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    private void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    protected void marcarComoEmpestado() {
        this.disponivel = false;
    }

    protected void marcarComoDisponivel() {
        this.disponivel = true;
    }

    protected static int getTotalItensCriados() {
        return totalItensCriados;
    }

    public static void setTotalItensCriados(int totalItensCriados) {
        ItemAcervo.totalItensCriados = totalItensCriados;
    }
}
