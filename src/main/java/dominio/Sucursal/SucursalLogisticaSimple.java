package dominio.Sucursal;

import dominio.envio.Envio;
import dominio.transporte.Transporte;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SucursalLogisticaSimple implements SucursalLogistica{

    private List<Envio> enviosEnSucursal = new ArrayList<>();
    private List<Transporte> transportes = new ArrayList<>();

    @Override
    public List<Integer> generarRecorrido()
    {
        // Les envia el mensaje para que salgan
        List<Integer> tiempos = this.transportesQuePuedenSalir().stream().map(unTransporte -> unTransporte.hacerRecorrido()).collect(Collectors.toList());
        // Actualiza la lista de transporte disponibles
        this.actualizarFlotaDisponible();
        return tiempos;
    }

    public void actualizarFlotaDisponible()
    {
        this.transportes.removeAll(this.transportesQuePuedenSalir());
    }

    public List<Transporte> transportesQuePuedenSalir()
    {
        //Chequear transportes que pueden salir
        return this.transportes.stream().filter(unTransporte -> unTransporte.puedeSalir()).collect(Collectors.toList());
    }

    public void agregarEnvio(Envio unEnvio){
        this.enviosEnSucursal.add(unEnvio);
    }

    public void agregarTransporte(Transporte unTransporte){ this.transportes.add(unTransporte);}
}
