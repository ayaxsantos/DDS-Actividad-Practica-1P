package dominio;

public interface Notificador {
    void enviar(String destinatario, String asunto, String cuerpo);
}
