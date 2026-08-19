package meio_transporte;

public class Bicicleta implements MeioTransporte {
    public double calcularTempo(double distancia) {
        return distancia * 7;
    }
}
