package dominio.destinatario;


import javax.persistence.*;

@Entity
@Table(name = "destinatario")
public class Destinatario {
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

    public Destinatario(String nombre, String apellido, String email, String numeroTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroTelefono = numeroTelefono;

    }
}
