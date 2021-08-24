package dominio.destinatario;


import dominio.envio.Envio;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "destinatario")
public class Destinatario
{

    @Id
    @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "destinatario", orphanRemoval = true)
    private List<Envio> unosEnvios;

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
