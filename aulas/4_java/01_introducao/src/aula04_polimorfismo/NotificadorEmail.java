package aula04_polimorfismo;

public class NotificadorEmail implements Notificador {
    public void enviar(String destinatario, String mensagem) {
        System.out.printf("[E-mail] para: %s\n\t\t%s\n", destinatario, mensagem);
    }
}
