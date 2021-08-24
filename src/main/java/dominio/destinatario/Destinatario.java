package dominio.destinatario;


import javax.persistence.*;

@Entity
@Table(name = "destinatario")
public class Destinatario {
    @Id
    @GeneratedValue
    private int idDestinatario;

    @Column(length = 15,nullable = false)
    public String nombre;

    @Column(length = 20, nullable = false)
    public String apellido;

    @Column(length = 50, nullable = false)
    public String email;


    public Destinatario(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
}
