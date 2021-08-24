package dominio.Paquete;


import javax.persistence.*;
import dominio.envio.Envio;

@Entity
@Table(name = "paquete")
public class Paquete {

    @Id
    @GeneratedValue
    private int idpaquete;
    @ManyToOne
    @JoinColumn(name = "idEnvio")
    private Envio envio;

    @Column(nullable = false)
    public int peso;
    @Column
    public Tamanio tamanio;

    public Paquete(int peso) {
        this.peso = peso;
    }

    public void definirTamanio(){
        if(peso < 5)
            this.tamanio = Tamanio.CHICO;
        else if(peso > 5 && peso < 30)
            this.tamanio = Tamanio.MEDIANO;
        else
            this.tamanio = Tamanio.GRANDE;
    }
}
