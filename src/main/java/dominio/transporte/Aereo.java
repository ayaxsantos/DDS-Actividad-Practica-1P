package dominio.transporte;

public class Aereo implements EstrategiaEnvio
{
    @Override
    public int hacerRecorrido(Transporte unTransporte)
    {
        return unTransporte.cantidadEnvios() * 3;
    }
}
