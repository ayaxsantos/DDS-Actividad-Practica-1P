package dominio.accion;

import dominio.Paquete.Paquete;

import dominio.envio.Envio;

import java.util.List;

public class Empaquetar
{
    private List<Envio> unosEnvios;

    public Empaquetar(List<Envio> unosEnvios)
    {
        this.unosEnvios = unosEnvios;
    }

    public void ejecutar(int unPeso, String idEnvio)
    {
        Paquete unPaquete = new Paquete(unPeso);
        Envio unEnvio = this.unosEnvios.stream()
                .filter(envio -> envio.idEnvio().equals(idEnvio)).findFirst().get();

        unPaquete.definirTamanio();
        unEnvio.agregarPaquete(unPaquete);
    }

}
