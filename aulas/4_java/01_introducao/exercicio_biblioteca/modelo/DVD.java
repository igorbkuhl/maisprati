package exercicio_biblioteca.modelo;

public class DVD extends ItemEmprestavel {
    private String codigo;
    private String titulo;
    private Integer ano;
    private String diretor;
    private String asin;

    public DVD(String codigo, String titulo, int ano, String diretor, String asin) {
        super(codigo, titulo, ano, diretor, asin);
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.diretor = diretor;
        this.asin = asin;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAsin() {
        return this.asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    @Override
    public String getCategoria() {
        return "DVD";
    }

    @Override
    public String getDescricao() {
        return String.format("Diretor: %s | ASIN: %s", this.diretor, this.asin);
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
