package dominio.accion;

import dominio.Sucursal.SucursalLogistica;

import java.util.List;

public class ComenzarRecorridos
{

    private List<SucursalLogistica> unasSucursales;

    public ComenzarRecorridos(List<SucursalLogistica> unaSucursales) {
        this.unasSucursales = unaSucursales;
    }

    public void ejecutar()
    {
        this.unasSucursales.forEach(
                unaSucursal -> System.out.println("Tiempo estimado: " + unaSucursal.generarRecorrido())
        );
    }
}
