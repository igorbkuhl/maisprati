package exercicio_biblioteca.servicos;

import exercicio_biblioteca.contrato.*;
import exercicio_biblioteca.modelo.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final String nome;
    private final List<ItemAcervo> acervo;
    private final List<Usuario> usuarios;
    private static final int capacidadeItens = Config.CAPACIDADE_ACERVO;
    private static final int capacidadeUsuarios = Config.CAPACIDADE_USUARIOS;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.acervo = new ArrayList<ItemAcervo>(capacidadeItens);
        this.usuarios = new ArrayList<Usuario>(capacidadeUsuarios);
    }

    public void cadastrarItem(ItemAcervo item) {
        this.acervo.add(item);
    }

    public void cadastrarUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("O usuário deve ser informado para o cadastro.");
        } else if (usuarios.size() >= capacidadeUsuarios) {
            throw new IllegalArgumentException("Limite de usuários atingido. Registro cancelado.");
        }
        this.usuarios.add(usuario);
    }

    public boolean emprestar(String codigo, Usuario usuario) {
        if (usuario.contarItensAlugados() >= usuario.getLimiteDeEmprestimos()) {
            System.out.printf(
                    " >> Limite de empréstimos de '%d' atingido pelo usuário '%s', de matrícula '%s'.\n",
                    usuario.contarItensAlugados(), usuario.getNome(), usuario.getMatricula());
            return false;
        }

        ItemAcervo item = this.buscarItemPorCodigo(codigo);

        if (item == null) {
            System.out.printf("Item '%s' não encontrado.", codigo);
            return false;
        }

        if (item instanceof Emprestavel emprestavel) {
            System.out.printf(
                    " >. Item emprestado de código '%s' para usuário '%s', de matrícula '%s'.\n",
                    item.getCodigo(), usuario.getNome(), usuario.getMatricula());
            return emprestavel.emprestar(usuario);
        }

        System.out.printf("Item '%s' não pode ser emprestado.", codigo);
        return false;
    }

    public double devolver(String codigo, Usuario usuario, int diasAtraso) {
        ItemAcervo item = this.buscarItemPorCodigo(codigo);
        if (item == null || !(item instanceof Emprestavel emprestavel)) {
            return 0.0;
        }
        if (!emprestavel.devolver()) {
            return 0.0;
        }

        double multaTotal = emprestavel.calcularMulta(diasAtraso);
        double multaFinal = usuario.aplicarDesconto(multaTotal);
        if (multaFinal > 0) {
            usuario.acumularMulta(multaFinal);
        }

        usuario.devolver();
        return multaFinal;
    }

    public void listarAcervo() {
        System.out.println("Acervo:\n======");
        for (ItemAcervo item : this.acervo) {
            System.out.printf(
                    "Código: %s\nTítulo: %s\nAno: %d\nCategoria: %s\nDisponível: %b\n======\n",
                    item.getCodigo(), item.getTitulo(), item.getAno(), item.getCategoria(), item.getDisponivel());
        }
        System.out.println();
    }

    private ItemAcervo buscarItemPorCodigo(String codigo) {
        for (int i = 0; i < acervo.size(); i++) {
            if (!acervo.get(i).getCodigo().equals(codigo)) continue;
            return acervo.get(i);
        }
        return null;
    }
}
