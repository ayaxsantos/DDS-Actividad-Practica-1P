package dominio.envio;


import dominio.destinatario.Destinatario;

import javax.persistence.*;

@Entity
@Table(name = "destino")
public class Destino {

    @Id
    @GeneratedValue
    private int idDestino;
    @ManyToOne
    @JoinColumn(name = "idDestinatario")
    private Destinatario destinatario;
    @Column
    public String calle;
    @Column
    public int numero;
    @Column
    public String departamento;
    @Column
    public String localidad;

    public Destino(String calle, int numero, String localidad, Destinatario destinatario)
    {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.destinatario = destinatario;
    }

    public void departamento(String departamento) {
        this.departamento = departamento;
    }
}
