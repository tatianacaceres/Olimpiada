package app;

public class Maratonista extends Deportista {

    public int kmRecorridos;
    public String categoria;
    public String marca;
    public int velocidad;
    public int energia;

    public boolean correr() {
        if (this.energia > 0) {
            this.velocidad = 20;
            this.energia -= 5;
            return true;
        }
        return false;

    }

}