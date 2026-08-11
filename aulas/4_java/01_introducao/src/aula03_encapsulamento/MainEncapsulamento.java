package aula03_encapsulamento;

import aula03_encapsulamento.model.Produto;

public class Main {
    public static void main(String[] args) {
        double[] notas = {123, 456, 789};
        Produto ventilador = new Produto("21345", "Ventilador", 80.0, 10, notas);

        notas[0] = -100;

        System.out.println(ventilador.getNfe()[0]);
    }
}
