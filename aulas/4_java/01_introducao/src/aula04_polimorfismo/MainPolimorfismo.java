package aula04_polimorfismo;

public class Main {
    public static void main(String[] args) {
        Notificador[] canais = {new NotificadorEmail(), new NotificadorSms()};

        for (Notificador canal : canais) {
            canal.enviar("Adriano", "Tá me ouvindo?");
        }
    }
}
