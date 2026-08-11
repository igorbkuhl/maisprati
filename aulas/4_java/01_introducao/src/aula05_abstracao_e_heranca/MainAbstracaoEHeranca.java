package aula05_abstracao_e_heranca;

public class Main {
    public static void main(String[] args) {
        Funcionario[] equipe = {
            new Vendedor("Charla", 17000, "171", 100), new Vendedor("Tão", 15000, "172", 150),
            // new Funcionario("João", 10000, "173")
        };

        double folha = 0;

        for (Funcionario funcionario : equipe) {
            System.out.println(funcionario);
            folha += funcionario.calcularSalario();
        }

        System.out.printf("Folha de pagamento: %.2f\n", folha);
    }
}
