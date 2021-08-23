package Persistencia;


import javax.persistence.*;

@Entity
@Table(name = "paquete")
public class JpaPaquete {
    @Id
    @GeneratedValue
    private int idPaquete;
    @ManyToOne
    @Column
    private int idEnvio;
    @Column
    private int peso;
    @Column
    private int tamanio;
}
