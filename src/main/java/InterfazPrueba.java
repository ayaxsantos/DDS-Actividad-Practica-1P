import db.EntityManagerHelper;
import dominio.Paquete.Paquete;
import dominio.accion.Empaquetar;
import dominio.destinatario.Destinatario;
import dominio.destinatario.Destino;
import dominio.envio.*;

public class InterfazPrueba
{
    public static void ejecutar()
    {
        Observador observadorRegistro = new ObservadorRegistro();

        Destino destinoPri = new Destino("Calle falsa",123,"Sprinfield");
        Destino destinoSeg = new Destino("Medrano",951,"CABA");

        Destinatario unaPersona = new Destinatario("Armando","Paredes","aparedes@rescateDePatitas.com", destinoPri);
        Destinatario otraPersona = new Destinatario("Lau","Reles","lreles@acero.com",destinoSeg);

        Envio envioPri = new Envio(30,unaPersona,observadorRegistro);
        Envio envioSeg = new Envio(31,unaPersona,observadorRegistro);
        Envio envioTer = new Envio(32,otraPersona,observadorRegistro);

        Paquete unPaquete = new Paquete(30);

        envioPri.cambiarEstadoActualizando(new Entregado());
        envioPri.cambiarEstadoActualizando(new Devuelto());
        envioTer.cambiarEstadoActualizando(new Pendiente());

        envioPri.agregarPaquete(unPaquete);

        observadorRegistro.leerRegistroDelDia(envioPri);
        observadorRegistro.leerRegistroDelDia(envioSeg);
        observadorRegistro.leerRegistroDelDia(envioTer);

        EntityManagerHelper.beginTransaction();

        EntityManagerHelper.getEntityManager().persist(envioPri);

        EntityManagerHelper.commit();


        EntityManagerHelper.beginTransaction();

        EntityManagerHelper.getEntityManager().persist(envioSeg);

        EntityManagerHelper.commit();


        EntityManagerHelper.beginTransaction();

        EntityManagerHelper.getEntityManager().persist(envioTer);

        EntityManagerHelper.commit();

        Empaquetar empaquetar = new Empaquetar();
        empaquetar.ejecutar(20,1);
    }
}
