package aula06_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> compras = new ArrayList<>();

        compras.add("Arroz");
        compras.add("Feijão");
        compras.add("Macarrão");

        System.out.println(compras.size());
        System.out.println(compras.get(0));
        System.out.println(compras.contains("Feijão"));

        // ------

        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        numeros.remove(1);

        // ------

        for (String compra : compras) {
            System.out.println(compra);
        }

        // ------------------------

        Set<String> visitantes = new HashSet<>();

        visitantes.add("João");
        visitantes.add("Maria");
        visitantes.add("José");

        // -------

        Map<String, Integer> idades = new HashMap<>();

        idades.put("João", 25);
        idades.put("Maria", 30);
        idades.put("José", 40);

        System.out.println(idades.get("João"));

        for (Map.Entry<String, Integer> par : idades.entrySet()) {
            System.out.printf("%s: %d\n", par.getKey(), par.getValue());
        }

        // -------------------

        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        int soma = nums.stream().filter(n -> (n % 2 == 0)).mapToInt(n -> n * 2).sum();
        System.out.printf("Soma: %d\n", soma);

        // stream (fonte) -> filter (seleção) -> map (transforma) -> collect (encerra)
        // lambda - função curta, escrita no seu lugar de uso

        List<String> palavras = List.of("Java", "Python", "C++", "JavaScript");

        palavras.stream().filter(p -> p.length() > 4).forEach(System.out::println);

        palavras.stream().map(String::toUpperCase).forEach(System.out::println);

        // usando streams, a partir de palavras, crie um outro array
        // que armazena o tamanho de cada palavra
        // List<Integer> tamanhos = palavras.stream().map(String::length).toList();
        // System.out.println(tamanhos);

        // dada List<Integer> de 1 a 20, imprima só os múltiplos de 3.
        List<Integer> tamanhos = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            tamanhos.add(i);
        }

        IntStream.rangeClosed(1, 20).boxed().filter(n -> n % 3 == 0).forEach(System.out::println);
    }
}
