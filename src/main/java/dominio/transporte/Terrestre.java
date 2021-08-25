package dominio.transporte;

import dominio.destinatario.Destino;

import java.util.ArrayList;
import java.util.List;

public class Terrestre implements EstrategiaEnvio
{
    public List<Destino> recorrido = new ArrayList<>();

    @Override
    public int hacerRecorrido(Transporte unTransporte)
    {
        return unTransporte.cantidadEnvios() * 2;
    }
}
