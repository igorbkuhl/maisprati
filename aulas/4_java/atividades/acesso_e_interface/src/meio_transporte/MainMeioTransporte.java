package meio_transporte;

public class MainMeioTransporte {
    public static void main(String[] args) {
        MeioTransporte carro = new Carro();
        MeioTransporte bicicleta = new Bicicleta();
        MeioTransporte caminhada = new APe();

        double distancia = 10;
        double tempoCarro = carro.calcularTempo(distancia);
        double tempoBicicleta = bicicleta.calcularTempo(distancia);
        double tempoCaminhada = caminhada.calcularTempo(distancia);

        System.out.printf("Tempo do carro: %.2f minutos.\n", tempoCarro);
        System.out.printf("Tempo da bicicleta: %.2f minutos.\n", tempoBicicleta);
        System.out.printf("Tempo de caminhada: %.2f minutos.\n", tempoCaminhada);
    }
}
