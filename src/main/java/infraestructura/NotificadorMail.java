package infraestructura;

import dominio.Notificador;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.AddressException;


public class NotificadorMail implements Notificador {

    private final String emailOrigen = "OkaEntregas@gmail.com";
    private final String contrasenia = "OkaSiempreEntregaATiempo";

    @Override
    public void enviar(String origen, String destinatario, String asunto, String cuerpo){
        Properties propiedades = new Properties();
        Session session = Session.getDefaultInstance(propiedades);

        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(emailOrigen, "OKA")); //Setteas el que manda el mail
            msg.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(destinatario, "Cliente")); //Setteas quien lo recibe
            msg.setSubject(asunto);
            msg.setText(cuerpo);
            //Vamos a usar stmp para gmail
            Transport transport = session.getTransport("smtp");
            transport.connect(emailOrigen, remitente, clave);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
    }

}
