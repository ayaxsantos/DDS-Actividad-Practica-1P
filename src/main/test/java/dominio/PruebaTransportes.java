package dominio;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import dominio.envio.Envio

public class PruebaTransportes {

    @Test
    public void testTransporte()
    {

        List<Envio> envios = Arrays.asList(
                new Envio("30",null,null,null, null),
                new Envio("31",null,null,null, null),
                new Envio("32",null,null,null, null)
        );

    }




}

/*protected String codigoEnvio;
    private Destinatario destinatario;
    private Observador registro;
    protected LocalDateTime fechaDevolucion;
    private Estado estado;
    private List<Paquete> paquetes = new ArrayList<>();
    private Destino destino;
    public Envio(String codigoEnvio, Destinatario destinatario, Observador registro, Destino destino)
 */