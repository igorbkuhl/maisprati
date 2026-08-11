package aula04_polimorfismo;

public class NotificadorSms implements Notificador {
    public void enviar(String destinatario, String mensagem) {
        System.out.printf("[SMS] para: %s\n\t\t%s\n", destinatario, mensagem);
    }
}
