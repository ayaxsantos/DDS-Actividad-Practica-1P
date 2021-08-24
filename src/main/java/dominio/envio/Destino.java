package dominio.envio;


import dominio.destinatario.Destinatario;

import javax.persistence.*;

public class Destino {

    private int id;

    private Destinatario destinatario;

    public String calle;

    public int numero;

    public String localidad;

    public Destino(String calle, int numero, String localidad, Destinatario destinatario) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.destinatario = destinatario;
    }
}
