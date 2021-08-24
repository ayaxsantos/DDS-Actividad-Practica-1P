package dominio.destinatario;

import dominio.envio.Destino;

import javax.persistence.*;

@Entity
@Table(name = "destinatario")
public class Destinatario
{
    @Id
    @GeneratedValue
    private int idDestinatario;
    @Column
    public String nombre;
    @Column
    public String apellido;
    @Column
    public String email;
    @Column
    public String numeroTelefono;
    @Transient
    private Destino destino;

    public Destinatario(String nombre, String apellido, String email, String numeroTelefono, Destino destino) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
        this.destino = destino;
    }
}
