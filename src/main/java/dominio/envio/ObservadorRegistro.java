package dominio.envio;

import infraestructura.Redis;

import java.util.Set;

public class ObservadorRegistro implements Observador
{
    private final Redis redis;

    public ObservadorRegistro() {
        this.redis = new Redis();
    }

    @Override
    public void actualizarEnvio(Envio unEnvio)
    {
        //redis.insertarSet(unEnvio.codigoEnvio,unEnvio.getEstado());
    }

    @Override
    public void leerRegistroDelDia(Envio unEnvio)
    {
        Set<String> registroEnvios = null; //redis.leerSet(unEnvio.codigoEnvio);
        System.out.println("El envio " + unEnvio.codigoEnvio + " estuvo:");
        registroEnvios.forEach(unValor -> System.out.println("Estado: " + unValor));
    }
}
