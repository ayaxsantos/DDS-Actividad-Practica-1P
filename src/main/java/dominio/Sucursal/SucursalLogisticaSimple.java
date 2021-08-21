package dominio.Sucursal;

import dominio.envio.Envio;
import dominio.transporte.Transporte;

import java.util.ArrayList;
import java.util.List;

public class SucursalLogisticaSimple implements SucursalLogistica{

    private List<Envio> enviosEnSucursal = new ArrayList<>();
    private List<Transporte> transportes = new ArrayList<>();


    public void generarRecorrido(){}

    public void agregarEnvio(Envio unEnvio){
        this.enviosEnSucursal.add(unEnvio);
    }

    public void cambiarEstadoEnvio(Envio unEnvio){} //Para mi no va, es algo propio de envio
                                                    //Para mi tampoco (?
}
