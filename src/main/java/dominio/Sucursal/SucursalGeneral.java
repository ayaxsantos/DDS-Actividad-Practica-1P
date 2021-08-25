package dominio.Sucursal;

import dominio.transporte.Transporte;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SucursalGeneral implements SucursalLogistica {

    private List<SucursalLogistica> sucursalesSimples = new ArrayList<>();

    @Override
    public List<Integer> generarRecorrido()
    {
        List<List<Integer>> listaTotal = this.sucursalesSimples.stream().map(unaSucursal -> unaSucursal.generarRecorrido()).collect(Collectors.toList());
        return listaTotal.stream().flatMap(List::stream).collect(Collectors.toList());
    }

    public void agregarSucursal(SucursalLogistica unaSucursal){
        this.sucursalesSimples.add(unaSucursal);
    }


}
