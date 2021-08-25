package dominio.accion;

import db.EntityManagerHelper;
import dominio.Paquete.Paquete;

import dominio.envio.Envio;

import java.util.List;

public class Empaquetar {

    public void ejecutar(int unPeso, int idEnvio)
    {
        Paquete unPaquete = new Paquete(unPeso);
        Envio unEnvio = (Envio) EntityManagerHelper.createQuery("from Envio where id = " + idEnvio).getSingleResult();
        unPaquete.definirTamanio();
        unEnvio.agregarPaquete(unPaquete);

        System.out.println("Paquete agregado al envio con codigo" + unEnvio.idEnvio());

        EntityManagerHelper.beginTransaction();

        EntityManagerHelper.getEntityManager().persist(unEnvio);

        EntityManagerHelper.commit();
    }
}
