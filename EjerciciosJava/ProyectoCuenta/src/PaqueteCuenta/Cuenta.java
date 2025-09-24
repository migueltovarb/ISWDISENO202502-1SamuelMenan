package PaqueteCuenta;

public class Cuenta {
    private String titular;
    private double cantidad;

    // Constructor obligatorio (solo titular)
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    // Constructor con titular y cantidad
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Getters y setters
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

    // ingresar: si la cantidad es negativa no hace nada
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // retirar: si la cantidad solicitada es negativa no hace nada;
    // si al restar queda negativa, la cuenta pasa a 0
    public void retirar(double cantidad) {
        if (cantidad < 0) {
            return;
        }
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

