package dominio;

import dominio.envio.Envio;
import dominio.envio.Pendiente;
import dominio.transporte.EstrategiaEnvio;

import java.util.Arrays;
import java.util.List;

public class FixtureMetodosTransportes {




    protected static final List<Envio> envios = Arrays.asList(
            new Envio("30",null,null,null),
            new Envio("31",null,null,null, null),
            new Envio("32",null,null,null, null)
    );
    ;
    //protected static final EstrategiaEnvio estrategiaDeEnvio = null;
    //protected static final int capacidadMaxima = 1500;




}
