package dominio.Paquete;

import dominio.envio.Envio;

public class Paquete {

    private int idpaquete;
    private Envio envio;
    public int peso;
    public Tamanio tamanio;

    public Paquete(int peso) {
        this.peso = peso;
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
