package dominio.accion;

import dominio.envio.Envio;

import java.util.List;

public class RealizarConfirmacionEnvios
{
    private final List<Envio> unosEnvios;

    public RealizarConfirmacionEnvios(List<Envio> unosEnvios)
    {
        this.unosEnvios = unosEnvios;
    }

    public void ejecutar(int idEnvio)
    {
        Envio unEnvio = this.unosEnvios.stream()
                .filter(envio -> envio.codigoEnvio().equals(idEnvio)).findFirst().get();

        unEnvio.estado.confirmar(unEnvio);
    }

}
