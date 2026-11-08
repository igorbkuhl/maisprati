package exercicio_biblioteca;

import exercicio_biblioteca.contrato.*;
import exercicio_biblioteca.modelo.*;
import exercicio_biblioteca.servicos.*;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Livraria Lagoinha");

        Livro livroC = new Livro("L088", "The C Programming Language", 1988, "Brian W. Kernighan", "978-0131103627");
        Livro livroAlgoritmos = new Livro(
                "L047",
                "Grokking Algorithms, Second Edition: An illustrated guide for programmers and other curious people",
                2024,
                "Aditya Y. Bhargava",
                "978-1633438538");
        Livro livroJojo = new Livro(
                "L122",
                "Jojo's Bizarre Adventure: Part 7 -- Steel Ball Run, Vol. 1'",
                2004,
                "Hirohiko Araki",
                "978-1974752546");
        DVD dvdFilme = new DVD("L138", "A Silent Voice - The Movie", 2019, "Miyu Irino", "B07MWQ9CCM");

        ItemEmprestavel[] itens = {livroC, livroAlgoritmos, livroJojo, dvdFilme};
        for (ItemEmprestavel item : itens) {
            biblioteca.cadastrarItem(item);
        }

        AlunoGraduacao tais = new AlunoGraduacao("A089889", "Taís Araújo", "taís@mail.com", "Ciência da Computação", 2);
        Professor silvio = new Professor("P082", "Sílvio Barros", "silvio@mail.com");

        Usuario[] usuarios = {tais, silvio};
        for (Usuario usuario : usuarios) {
            biblioteca.cadastrarUsuario(usuario);
        }

        // Acervo
        biblioteca.listarAcervo();

        // Empréstimos
        biblioteca.emprestar("L088", tais);
        biblioteca.emprestar("L047", tais);
        biblioteca.emprestar("L138", tais);
    }
}
