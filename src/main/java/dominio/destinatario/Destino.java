package dominio.destinatario;


import dominio.destinatario.Destinatario;

import javax.persistence.*;

public class Destino {

    public String calle;

    public int numero;

    public String localidad;

    public Destino(String calle, int numero, String localidad, Destinatario destinatario) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
    }
}
