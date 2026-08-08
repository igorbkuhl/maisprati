import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // evenOrOdd();
        // dayOfTheWeek();
        // multiples();
        // factorial();
        // evenNumbers();
        // totalAndAverage();
        // minAndMax();
        // formattedMatrix();
        matrixSum();
        // matrizes();
    }

    private static void matrizes() {
        int[][] tabela = {
            {9, 13, 7, 15},
            {2, 4, 6, 8},
            {5, 7, 3, 9},
            {11, 17, 20, 14},
        };

        int indiceLinha = 0;
        for (int[] linha : tabela) {
            int somaLinha = 0;
            for (int celula : linha) {
                somaLinha += celula;
            }
            System.out.println("Linha: " + indiceLinha + ", " + somaLinha);
            indiceLinha++;
        }

        System.out.println("//////////////");

        for (int j = 0; j < tabela.length; j++) {
            int somaColuna = 0;
            for (int[] linha : tabela) {
                somaColuna += linha[j];
            }
            System.out.println("Coluna: " + j + ", " + somaColuna);
        }
    }

    // 1. Leia um número fixo no código e diga se é par ou ímpar usando if.
    private static void evenOrOdd() {
        int num = 5;

        if (num % 2 == 0) {
            System.out.printf("O número %d é par.\n", num);
        } else {
            System.out.printf("O número %d é ímpar.\n", num);
        }
    }

    // 2. Usando switch como expressão, converta um número de 1 a 7 no nome da semana.
    private static void dayOfTheWeek() {
        int day = 4;
        String dayName =
                switch (day) {
                    case 0 -> "Domingo";
                    case 1 -> "Segunda";
                    case 2 -> "Terça";
                    case 3 -> "Quarta";
                    case 4 -> "Quinta";
                    case 5 -> "Sexta";
                    case 6 -> "Sábado";
                    default -> "Dia inválido";
                };

        System.out.printf("O dia da semana é: %s\n", dayName);
    }

    // 3. Imprima os números de 1 a 100 que sejam múltiplos de 3 e de 5, usando for.
    private static void multiples() {
        final int MAX = 100;
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= MAX; i++) {
            if (i % 3 != 0 || i % 5 != 0) continue;
            nums.add(i);
        }

        System.out.printf("Os números múltiplos de 3 e 5 são: %s\n", nums);
    }

    // 4. Calcule o fatorial de 10 usando while.
    private static void factorial() {
        int num = 10;
        int result = num;

        while (num > 1) {
            result *= --num;
        }

        System.out.printf("O fatorial de 10 é: %d\n", result);
    }

    // 5. Crie um array com 10 inteiros e imprima apenas os que estão em posições pares.
    private static void evenNumbers() {
        int[] nums = {1, 14, 3, 18, 2, 8, 7, 32, 5, 12};
        int[] evens = Arrays.stream(nums).filter(n -> n % 2 == 0).toArray();

        System.out.printf(
                "Dentro dos números %s...\nOs números pares são: %s\n", Arrays.toString(nums), Arrays.toString(evens));
    }

    // 6. Some todos os elementos de um array de int e imprima o total e a média.
    private static void totalAndAverage() {
        int[] nums = {4, 7, 5, 8, 8, 9};
        int total = Arrays.stream(nums).reduce(0, (ttl, cur) -> ttl + cur);
        float average = total / nums.length;

        System.out.printf("Dentro dos números %s ...\nTotal: %d\nMédia: %.1f\n", Arrays.toString(nums), total, average);
    }

    // 7. Encontre o maior e o menor valor de um array e informe também em qual indice cada um está.
    private static void minAndMax() {
        int[] nums = {8, 6, 2, 9, 5, 7};
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        System.out.printf("Dentro dos números %s ...\nMaior: %d\nMenor: %d\n", Arrays.toString(nums), max, min);
    }

    // 8. Crie uma matriz 3x3, preencha-a e imprima formatada em linhas e colunas.
    private static void formattedMatrix() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        String output = String.format(
                "[%s\n]",
                Arrays.stream(matrix)
                        .map(l -> String.format("\n    %s,", Arrays.toString(l)))
                        .collect(Collectors.joining()));
        System.out.println(output);

        // String output = "[";
        // for (int[] row : matriz) {
        //     output += String.format("\n    %s", Arrays.toString(row));
        // }
        // output += "\n]";
    }

    // 9. Calcule a soma de cada linha e de cada coluna de uma matriz 4x4.
    private static void matrixSum() {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        AtomicInteger lineIndex = new AtomicInteger();
        Arrays.stream(matrix).forEach(row -> {
            int lineSum = Arrays.stream(row).sum();
            System.out.printf("Soma da linha %d: %d\n", lineIndex.getAndIncrement(), lineSum);
        });

        AtomicInteger colIndex = new AtomicInteger();
        IntStream.range(0, matrix[0].length).forEach(col -> {
            int colSum = Arrays.stream(matrix).map(row -> row[col]).reduce(0, Integer::sum);
            System.out.printf("Soma da coluna %d: %d\n", colIndex.getAndIncrement(), colSum);
        });

        // for (int[] row : matrix) {
        //     int rowSum = 0;
        //     for (int cell : row) {
        //         rowSum += cell;
        //     }
        //     System.out.printf("Soma da linha %d: %d\n", row, rowSum);
        // }
        //
        // for (int col = 0; col < matrix.length; col++) {
        //     int colSum = 0;
        //     for (int[] row : matrix) {
        //         colSum += row[col];
        //     }
        //     System.out.printf("Soma da coluna %d: %d\n", col, colSum);
        // }
    }
}
