package dominio.envio;

import dominio.Paquete.Paquete;
import dominio.destinatario.Destinatario;

import javax.persistence.*;
import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "envio")
public class Envio
{
    @Id
    @GeneratedValue
    private int id;

    @Transient
    protected int idEnvio;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "destinatario_id")
    private Destinatario destinatario;

    @Transient
    private Observador registro;

    @Column
    protected LocalDateTime fechaDevolucion;

    @Transient
    public Estado estado;

    @Transient
    private List<Paquete> paquetes = new ArrayList<>();

    @Column
    private int pesoTotal;

    public Envio(int idEnvio, Destinatario destinatario, Observador registro) {
        this.idEnvio = idEnvio;
        this.destinatario = destinatario;
        this.registro = registro;
        this.pesoTotal = 0;
        this.cambiarEstadoActualizando(new Pendiente());

    }

    public Integer idEnvio() {
        return this.idEnvio;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public void reflejarPeso()
    {
        this.pesoTotal = this.obtenerPesoEnvio();
    }

    public int cantidadPaquetes(){
        return paquetes.size();
    }

    public Destinatario destinatario()
    {
        return this.destinatario;
    }

    public void agregarPaquete(Paquete unPaquete){
        this.paquetes.add(unPaquete);
    }

    public void sacarPaquete(Paquete unPaquete)
    {
        this.paquetes.remove(unPaquete);
    }

    public void cambiarEstadoActualizando(Estado unEstado)
    {
        this.estado = unEstado;
        registro.actualizarEnvio(this);
    }

    public String getEstado() {
        return estado.getClass().getSimpleName();
    } //?

    public int obtenerPesoEnvio()
    {
        return this.paquetes.stream().mapToInt(unPaquete -> unPaquete.peso).sum();
    }

    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

}
