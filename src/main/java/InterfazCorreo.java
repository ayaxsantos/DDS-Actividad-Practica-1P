import dominio.envio.*;

public class InterfazCorreo
{
    public static void ejecutar()
    {
        Observador observadorRegistro = new ObservadorRegistro();
        Envio envioPri = new Envio("30",null,observadorRegistro);
        Envio envioSeg = new Envio("31",null,observadorRegistro);
        Envio envioTer = new Envio("32",null,observadorRegistro);

        envioPri.cambiarEstadoActualizando(new Devuelto());
        envioPri.cambiarEstadoActualizando(new Entregado());
        envioTer.cambiarEstadoActualizando(new Pendiente());

        observadorRegistro.leerRegistroDelDia(envioPri);
        observadorRegistro.leerRegistroDelDia(envioSeg);
        observadorRegistro.leerRegistroDelDia(envioTer);
    }
}
