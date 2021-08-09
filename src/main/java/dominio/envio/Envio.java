package dominio.envio;

import dominio.destinatario.Destinatario;

import java.time.LocalDate;

public class Envio
{
    public String codigoEnvio;
    public Destinatario destinatario;
    public Observador registro;
    public LocalDate fecha;
    public Estado estado;

    public Envio(String codigoEnvio, Destinatario destinatario, Observador registro) {
        this.codigoEnvio = codigoEnvio;
        this.destinatario = destinatario;
        this.registro = registro;
        this.fecha = LocalDate.now();
        this.cambiarEstadoActualizando(new Pendiente());
    }

    public void cambiarEstadoActualizando(Estado unEstado)
    {
        this.estado = unEstado;
        registro.actualizarEnvio(this);
    }

    public String getEstado() {
        return estado.getClass().getSimpleName();
    }
}
