package dominio.envio;

public interface Observador
{
    void actualizarEnvio(Envio unEnvio);
    void leerRegistroDelDia(Envio unEnvio);
}
