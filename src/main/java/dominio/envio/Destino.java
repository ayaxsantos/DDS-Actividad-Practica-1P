package dominio.envio;

import javax.persistence.Entity

@Entity
public class Destino {

    public String calle;
    public int numero;
    public String departamento;
    public String localidad;

    public Destino(String calle, int numero, String localidad)
    {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
    }

    public void departamento(String departamento) {
        this.departamento = departamento;
    }
}
