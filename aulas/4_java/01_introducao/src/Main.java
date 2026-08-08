import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }

    private static void variaveis() {
        /*
         * Tipos Primitivos -> byte, short, int, float, double, decimal, long
         * Tipos Por Referência -> String, Array...
         *
         * byte    - 8 bits - -128 a 127
         * short   - 16 bits
         * int     - 32 bits
         * long    - 64 bits
         * float   - 32 bits ~7 casas de precisão
         * double  - 64 bits ~ 15 casas de precisão
         * char    - 16 bits
         * boolean - true ou false
         */

        // byte idade = 21;
        // short ano = 2026;
        // int populacao = 213000;
        // float altura = 1.82f;
        // double pi = 3.141592653589793;
        // char inicial = 'I';
        // boolean certo = true;
        //
        // System.out.printf("Idade: %d | Altura: %.2fm\n", idade, altura);
        //
        // String nome = "Igor Borges Kühl";
        // System.out.println(nome.length());
        // System.out.println(nome.toUpperCase());
        // System.out.println(nome.charAt(0));
    }

    private static void strings() {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }

    private static void aritmetica() {
        int soma = 7 + 3;
        int div = 7 / 2;
        double d = 7 / 2.0;
        int resto = 7 % 2;

        soma++;
        ++soma;
        soma--;
        --soma;
        soma += 1;
    }

    private static void condicoes() {
        int nota = 75;

        if (nota >= 90) {
            System.out.println("Excelente");
            ;
        } else if (nota >= 70) {
            System.out.println("Bom");
            ;
        } else {
            System.out.println("Reprovado");
        }

        int idade = 21;
        String status = idade >= 18 ? "Maior de idade" : "Menor de idade";

        int diaSemana = 1;

        switch (diaSemana) {
            case 0:
                System.out.println("Domindo");
                break;
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }

        int mes = 7;
        String estacao =
                switch (mes) {
                    case 12, 1, 2 -> "Verão";
                    case 3, 4, 5 -> "Outono";
                    case 6, 7, 8 -> "Inverno";
                    case 9, 10, 11 -> "Primevera";
                    default -> "Mês inválido";
                };
    }

    private static void loops() {
        int contador = 1;

        while (contador >= 5) {
            System.out.printf("Contagem: %d", contador);
            contador++;
        }

        int tentativa = 0;

        do {
            tentativa++;
            System.out.printf("Tentativa de número: %d", tentativa);
        } while (tentativa < 3);

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    private static void arrays() {
        // int[] numeros;
        // numeros = new int[5];
        int[] numeros = new int[] {10, 20, 30};
        String[] cores = {"Azul", "Branco", "Preto"};

        double[] notas = {7.5, 8, 10, 9.3};

        for (double nota : notas) {
            System.out.println(nota);
        }

        System.out.println(Arrays.toString(numeros));

        int[][] matriz = new int[3][4];
        int[][] tabela = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(tabela[0][0]);
    }
}
