package dominio.transporte;

import dominio.envio.Destino;

import java.util.ArrayList;
import java.util.List;

public class Terrestre implements EstrategiaEnvio
{
    public List<Destino> recorrido = new ArrayList<>();

    @Override
    public void empezarRecorrido() {

    }
}
