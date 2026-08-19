package meio_transporte;

public class APe implements MeioTransporte {
    public double calcularTempo(double distancia) {
        return distancia * 10;
    }
}
