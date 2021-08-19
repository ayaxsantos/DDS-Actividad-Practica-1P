package dominio.envio;

public class Destino {

    public String calle;
    public int numero;
    public String departamento;
    public String localidad;

    public Destino(String calle, int numero, String departamento, String localidad)
    {
        this.calle = calle;
        this.numero = numero;
        this.departamento = departamento;
        this.localidad = localidad;
    }

}
