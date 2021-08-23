package Persistencia;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "envio")
public class JpaEnvio {
    @Id
    @GeneratedValue
    private int idEnvio;
    @Column(nullable = false)
    protected String codigoEnvio;
    @Column
    protected LocalDateTime fechaDevolucion;
    @Column
    private int pesoTotal;
    @ManyToOne
    @Column
    private int ideTransporte;
}
