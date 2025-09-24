package PaqueteCuentaEjecutable;

public class Cuenta {
    private String titular;
    private double cantidad;

    // Constructor con solo titular
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    // Constructor con titular y cantidad inicial
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // ingresar dinero (ignora negativos)
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // retirar dinero (si queda negativo, pasa a 0)
    public void retirar(double cantidad) {
        if (cantidad < 0) return;
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{titular='" + titular + "', cantidad=" + cantidad + "}";
    }
}

