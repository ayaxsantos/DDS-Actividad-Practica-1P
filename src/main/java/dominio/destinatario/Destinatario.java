package dominio.destinatario;

public class Destinatario
{
    public String nombre;
    public String apellido;
    public String email;
    public String numeroTelefono;

    public Destinatario(String nombre, String apellido, String email, String numeroTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }
}
