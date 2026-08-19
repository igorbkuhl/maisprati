package meio_transporte;

public class Carro implements MeioTransporte {
    public double calcularTempo(double distancia) {
        return distancia * 2;
    }
}
