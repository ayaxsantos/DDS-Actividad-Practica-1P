package dominio.envio;

import dominio.Exception.NoHayPaquetesException;

public class Pendiente extends Estado{
    @Override
    public void confirmar(Envio unEnvio){
        if(unEnvio.cantidadPaquetes() == 0)
            throw new NoHayPaquetesException();
        else
            unEnvio.obtenerPesoEnvio();
    }
}
