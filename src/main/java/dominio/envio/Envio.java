package dominio.envio;

import dominio.Paquete.Paquete;
import dominio.destinatario.Destinatario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Envio
{
    protected String codigoEnvio;
    private Destinatario destinatario;
    private Observador registro;
    private LocalDate fecha;
    private Estado estado;
    private List<Paquete> paquetes = new ArrayList<>();
    private Destino destino;

    public Envio(String codigoEnvio, Destinatario destinatario, Observador registro, Destino destino) {
        this.codigoEnvio = codigoEnvio;
        this.destinatario = destinatario;
        this.registro = registro;
        this.cambiarEstadoActualizando(new Pendiente()); //?
        this.destino = destino;
    }

    public void confirmar(){
        this.estado.confirmar(this);
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
}
