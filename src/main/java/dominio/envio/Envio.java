package dominio.envio;

import dominio.Paquete.Paquete;
import dominio.destinatario.Destinatario;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Envio
{
    protected String codigoEnvio;
    private Destinatario destinatario;
    private Observador registro;
    protected LocalDateTime fechaDevolucion;
    private Estado estado;
    private List<Paquete> paquetes = new ArrayList<>();
    private Destino destino;
    private int pesoTotal;

    public Envio(String codigoEnvio, Destinatario destinatario, Observador registro, Destino destino) {
        this.codigoEnvio = codigoEnvio;
        this.destinatario = destinatario;
        this.registro = registro;
        this.pesoTotal = 0;
        this.cambiarEstadoActualizando(new Pendiente()); //?
        this.destino = destino;
    }

    public String codigoEnvio() {
        return this.codigoEnvio;
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
