package dominio.Paquete;

public class Paquete
{
    public int peso;
    public Tamanio tamanio;

    public Paquete (int peso, Tamanio tamanio) {
        this.peso = peso;
        this.tamanio = tamanio;
    }

    public void definirTamanio(){
        if(peso < 5)
            this.tamanio = Tamanio.CHICO;
        else if(peso > 5 && peso < 30)
            this.tamanio = Tamanio.MEDIANO;
        else
            this.tamanio = Tamanio.GRANDE;
    }
}
