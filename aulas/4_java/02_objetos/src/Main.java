public class Main {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa();
        // p1.nome = "Andreas Pereira";
        // p1.idade = 30;
        //
        // Pessoa p2 = new Pessoa();
        // p2.nome = "Neymar";
        // p2.idade = 32;
        //
        // p1.apresentar("brasileiro");
        // p2.apresentar("brasileiro");
        //
        // Pessoa p3 = p1;
        // p3.nome = "Edward";
        // System.out.println(p1.nome);
        //
        // int numeroTeste = 10;
        // double desconto = p1.calcularDesconto((double) numeroTeste, 10);
        // System.out.println(desconto);
        //
        // int[] a = {10, 20};
        // p1.alterar(a);
        // System.out.println(a[0]);

        Pessoa p5 = new Pessoa("Amauri", 25);
        System.out.println(p5.getPeso());
        System.out.println(Pessoa.getSexo());
    }
}
