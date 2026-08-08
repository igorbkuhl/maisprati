// Crie a classe Calculadora com somar, subtrair, multiplicar e dividir. Em dividir, trate a divisão por zero.
public class Calculadora {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new Error("Não se pode dividir por zero.");
        }
        return a / b;
    }

    private static executar(double a, double b, Object op) {
        return op(a, b);
    }
}
