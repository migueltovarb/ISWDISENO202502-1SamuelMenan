package PaqueteCarro;

public class Llantas {
    private String tipo;
    private double tamaño; // en pulgadas

    public Llantas(String tipo, double tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public double getTamaño() {
        return tamaño;
    }

    @Override
    public String toString() {
        return "Llantas{tipo='" + tipo + "', tamaño=" + tamaño + "}";
    }
}

