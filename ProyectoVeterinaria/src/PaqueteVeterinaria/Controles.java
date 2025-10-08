package PaqueteVeterinaria;

public class Controles {
    private String fecha;
    private String tipo; 
    private String observaciones;

    public Controles(String fecha, String tipo, String observaciones) {
        if (isNullOrBlank(fecha) || isNullOrBlank(tipo)) {
            throw new IllegalArgumentException("Fecha y tipo de control son obligatorios");
        }
        this.fecha = fecha.trim();
        this.tipo = tipo.trim();
        this.observaciones = observaciones == null ? "" : observaciones.trim();
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    private static boolean isNullOrBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    @Override
    public String toString() {
        return "Control[fecha=" + fecha + ", tipo=" + tipo + ", obs=" + observaciones + "]";
    }


}

