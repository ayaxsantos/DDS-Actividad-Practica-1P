package dominio.Sucursal;

import java.util.ArrayList;
import java.util.List;

public class SucursalGeneral implements SucursalLogistica {

    private List<SucursalLogistica> sucursalesSimples = new ArrayList<>();

    @Override
    public void generarRecorrido()
    {
        this.sucursalesSimples.forEach(unaSucursal -> unaSucursal.generarRecorrido());
    }

    public void agregarSucursal(SucursalLogistica unaSucursal){
        this.sucursalesSimples.add(unaSucursal);
    }

}
