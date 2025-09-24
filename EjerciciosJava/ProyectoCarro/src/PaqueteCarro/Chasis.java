package PaqueteCarro;

public class Chasis {
    private double peso; // en kg
    private String material; // aluminio o acero

    public Chasis(double peso, String material) {
        this.peso = peso;
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Chasis{peso=" + peso + ", material='" + material + "'}";
    }
}

