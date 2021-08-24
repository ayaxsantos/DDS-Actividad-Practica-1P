package dominio.destinatario;

import javax.persistence.*;

public class Destinatario
{
    private int id;
    public String nombre;
    public String apellido;
    public String email;

    public Destinatario(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
}
