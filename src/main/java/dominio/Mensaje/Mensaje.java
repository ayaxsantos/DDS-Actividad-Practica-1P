package dominio.Mensaje;
//
public class Mensaje
{
    public String mailOrigen;
    public String destinatario;
    public String asunto;
    public String cuerpo;

    public Mensaje(String mailOrigen, String destinatario, String asunto, String cuerpo)
    {
        this.mailOrigen = mailOrigen;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }

    public String mailOrigen()
    {
        return this.mailOrigen;
    }

    public String destinatario()
    {
        return this.destinatario;
    }

    public String asunto()
    {
        return this.asunto;
    }

    public String cuerpo()
    {
        return this.cuerpo;
    }
}
