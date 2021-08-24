package dominio.envio;


import dominio.destinatario.Destinatario;

import javax.persistence.*;

@Entity
@Table(name = "destino")
public class Destino {

    @Id
    @GeneratedValue
    private int id;

    @OneToOne()
    @JoinColumn(name = "destinatario_id")
    private Destinatario destinatario;

    @Column(length = 50,nullable = false)
    public String calle;

    @Column(nullable = false)
    public int numero;

    @Column(length = 100,nullable = false)
    public String localidad;

    public Destino(String calle, int numero, String localidad, Destinatario destinatario) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.destinatario = destinatario;
    }
}
