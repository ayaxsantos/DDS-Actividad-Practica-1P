package infraestructura;

import dominio.Exception.EmailNoEnviadoException;
import dominio.Notificador;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;



public class NotificadorMail implements Notificador {

    private final String emailOrigen = "OkaEntregas@gmail.com";
    private final String contrasenia = "OkaSiempreEntregaATiempo";

    @Override
    public void enviar(String destinatario, String asunto, String cuerpo) {
        Properties propiedades = this.propiedades();
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
            transport.connect(emailOrigen, contrasenia);
            transport.sendMessage(msg, msg.getRecipients(Message.RecipientType.TO));
            transport.close();
        } catch (MessagingException ex) {
            throw new EmailNoEnviadoException();
        }

    }

    private Properties propiedades(){
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
        propiedades.put("mail.smtp.user", emailOrigen); //capaz
        propiedades.put("mail.smtp.clave", contrasenia);    //La clave de la cuenta capaz
        propiedades.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
        propiedades.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
        propiedades.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google
        return propiedades;
    }
}