package aula03_encapsulamento.model;

import java.util.Arrays;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private int estoque;
    private double[] nfe;

    public Produto(String codigo, String nome, double preco, int estoque, double[] nfe)
            throws IllegalArgumentException {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("O código é obrigatório.");
        } else if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser positivo.");
        }

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.nfe = Arrays.copyOf(nfe, nfe.length);
    }

    public int getEstoque() {
        return estoque;
    }

    public double[] getNfe() {
        return Arrays.copyOf(nfe, nfe.length);
    }

    public void vender(int quantidade) throws IllegalArgumentException {
        if (quantidade > this.estoque) {
            throw new IllegalArgumentException("Quantidade de venda não pode exceder o estoque.");
        } else if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que 0.");
        }

        this.estoque -= quantidade;
    }
}
