public class Main {
    public static void main(String[] args) {
        double soma = Calculadora.somar(1, 2);
        double sub = Calculadora.subtrair(5, 3);
        double mult = Calculadora.dividir(2, 18);
        double div = Calculadora.dividir(5, 0);

        System.out.printf("%f, %f, %f, %f\n", soma, sub, mult, div);
    }
}
