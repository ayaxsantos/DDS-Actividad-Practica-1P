package infraestructura;

import dominio.Notificador;

public class NotificadorMail implements Notificador {

    private final String emailOrigen = "OkaEntregas@gmail.com";
    private final String contrasenia = "OkaSiempreEntregaATiempo";

    @Override
    public void enviar(String origen, String destinatario, String asunto, String cuerpo){

    }

}
