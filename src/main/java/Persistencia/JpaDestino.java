package Persistencia;

import javax.persistence.*;

@Entity
@Table(name = "destino")
public class JpaDestino
{
    //Recordar refactorizar clase Destino en package destinatario
    @Id
    @GeneratedValue
    public int idDestino;
    @Column
    public String calle;
    @Column
    public int numero;
    @Column
    public String departamento;
    @Column
    public String localidad;
    @OneToOne
    @Column
    public int idDestinatario;
}
