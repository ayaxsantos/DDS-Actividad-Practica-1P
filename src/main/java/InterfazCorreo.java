import dominio.destinatario.Destinatario;
import dominio.envio.*;

public class InterfazCorreo
{
    public static void ejecutar()
    {
        Observador observadorRegistro = new ObservadorRegistro();

        Destino destinoPri = new Destino("Calle falsa",123,"Sprinfield");
        Destino destinoSeg = new Destino("Medrano",951,"CABA");
        destinoSeg.departamento("614");

        Destinatario unaPersona = new Destinatario("Armando","Paredes","aparedes@rescateDePatitas.com","99");

        Destinatario otraPersona = new Destinatario("Lau","Reles","lreles@acero.com","12");

        Envio envioPri = new Envio(30,unaPersona,observadorRegistro,destinoPri);
        Envio envioSeg = new Envio(31,unaPersona,observadorRegistro,destinoPri);
        Envio envioTer = new Envio(32,otraPersona,observadorRegistro,destinoSeg);

        envioPri.cambiarEstadoActualizando(new Devuelto());
        envioPri.cambiarEstadoActualizando(new Entregado());
        envioTer.cambiarEstadoActualizando(new Pendiente());

        observadorRegistro.leerRegistroDelDia(envioPri);
        observadorRegistro.leerRegistroDelDia(envioSeg);
        observadorRegistro.leerRegistroDelDia(envioTer);


    }
}
