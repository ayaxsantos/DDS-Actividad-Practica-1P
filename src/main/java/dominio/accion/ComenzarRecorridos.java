package dominio.accion;

import dominio.Sucursal.SucursalLogistica;
import dominio.envio.Envio;

import java.util.List;

public class ComenzarRecorridos
{
    private List<SucursalLogistica> unasSucursales;

    public ComenzarRecorridos(List<SucursalLogistica> unasSucursales)
    {
        this.unasSucursales = unasSucursales;
    }

    public void ejecutar(int idSucursal)
    {
        //SucursalLogistica unaSucursal = this.unasSucursales.stream()
        //        .filter(envio -> envio.codigoSucursal().equals(idSucursal)).findFirst().get();
        //unaSucursal.generarRecorrido();
        //Tengo que revisar esto todavia, o lo charlamos por los requerimientos!
    }
}
