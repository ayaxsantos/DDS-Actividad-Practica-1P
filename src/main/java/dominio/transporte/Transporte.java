package dominio.transporte;

import dominio.envio.Envio;

import java.util.ArrayList;
import java.util.List;

public class Transporte {

    public List<Envio> envios = new ArrayList<>();
    public EstrategiaEnvio estrategia;

    public Transporte(EstrategiaEnvio estrategia) {
        this.estrategia = estrategia;
    }
}
