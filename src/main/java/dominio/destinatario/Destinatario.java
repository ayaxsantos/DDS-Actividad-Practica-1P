package dominio.destinatario;

import javax.persistence.*;

public class Destinatario
{

    private String nombre;
    private String apellido;
    private String email;
    private Destino destino;

    public Destinatario(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.destino = destino;
    }
}
