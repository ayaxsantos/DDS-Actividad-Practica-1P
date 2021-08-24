import db.EntityManagerHelper;
import dominio.destinatario.Destinatario;
import dominio.envio.*;

public class InterfazCorreo
{
    public static void ejecutar()
    {
        Observador observadorRegistro = new ObservadorRegistro();

        Destinatario unaPersona = new Destinatario("Armando","Paredes","aparedes@rescateDePatitas.com");
        Destinatario otraPersona = new Destinatario("Lau","Reles","lreles@acero.com");

        Destino destinoPri = new Destino("Calle falsa",123,"Sprinfield",unaPersona);
        Destino destinoSeg = new Destino("Medrano",951,"CABA",otraPersona);

        Envio envioPri = new Envio(30,unaPersona,observadorRegistro);
        Envio envioSeg = new Envio(31,unaPersona,observadorRegistro);
        Envio envioTer = new Envio(32,otraPersona,observadorRegistro);


        envioPri.cambiarEstadoActualizando(new Entregado());
        envioPri.cambiarEstadoActualizando(new Devuelto());
        envioTer.cambiarEstadoActualizando(new Pendiente());

        observadorRegistro.leerRegistroDelDia(envioPri);
        observadorRegistro.leerRegistroDelDia(envioSeg);
        observadorRegistro.leerRegistroDelDia(envioTer);

        EntityManagerHelper.beginTransaction();

        EntityManagerHelper.getEntityManager().persist(envioPri);

        EntityManagerHelper.commit();

    }
}
