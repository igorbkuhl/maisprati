package exercicio_biblioteca.servicos;

import exercicio_biblioteca.contrato.Config;
import exercicio_biblioteca.modelo.ItemAcervo;
import exercicio_biblioteca.modelo.Usuario;

public class Biblioteca {
    private final String nome;
    private final ItemAcervo[] acervo;
    private final Usuario[] usuarios;
    private int totalItens;
    private int totalUsuarios;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.acervo = new ItemAcervo[Config.CAPACIDADE_ACERVO];
        this.usuarios = new Usuario[Config.CAPACIDADE_USUARIOS];
        this.totalItens = 0;
        this.totalUsuarios = 0;
    }

    public void cadastrarItem(ItemAcervo item) {
        this.acervo[this.totalItens++] = item;
    }
}
