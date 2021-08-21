package dominio.envio;

import java.time.LocalDateTime;

public class Devuelto extends Estado
{
    @Override
    public void confirmar(Envio unEnvio)
    {
        LocalDateTime fechaActual = LocalDateTime.now();
        unEnvio.setFechaDevolucion(fechaActual);
    }
}
