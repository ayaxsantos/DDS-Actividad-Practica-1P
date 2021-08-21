package dominio.transporte;

import dominio.Exception.TransporteLlenoException;
import dominio.envio.Envio;

import java.util.ArrayList;
import java.util.List;

public class Transporte {

    private List<Envio> envios = new ArrayList<>();
    private EstrategiaEnvio estrategia;
    private int capacidadMaxima = 1500;

    public Transporte(EstrategiaEnvio estrategia) {
        this.estrategia = estrategia;
    }

    public int cantidadEnvios()
    {
        return this.envios.size();
    }

    public void hacerRecorrido(){
        this.estrategia.hacerRecorrido(this);
        this.envios.clear();
    }

    public boolean puedeSalir()
    {
        return this.pesoActual() >= 1000;
    }

    public int pesoActual(){
        return this.envios.stream().mapToInt(unEnvio -> unEnvio.obtenerPesoEnvio()).sum();
    }

    public void cargarEnvio(Envio unEnvio){
        if(this.pesoActual() < capacidadMaxima) this.envios.add(unEnvio);
        else throw new TransporteLlenoException();
    }
}
