package PaqueteCarro;

public class Carro {
    private Llantas llantas;
    private Chasis chasis;
    private String color;

    public Carro(Llantas llantas, Chasis chasis, String color) {
        this.llantas = llantas;
        this.chasis = chasis;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carro{llantas=" + llantas +
                ", chasis=" + chasis +
                ", color='" + color + "'}";
    }
}

