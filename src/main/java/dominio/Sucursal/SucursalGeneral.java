package dominio.Sucursal;

import java.util.ArrayList;
import java.util.List;

public class SucursalGeneral implements SucursalLogistica{

    private List<SucursalLogistica> sucursalesSimples = new ArrayList<>();

    public void generarRecorrido(){

    }

    public void agregarSucursalSimple(SucursalLogisticaSimple unaSucursal){
        this.sucursalesSimples.add(unaSucursal);
    }


}
