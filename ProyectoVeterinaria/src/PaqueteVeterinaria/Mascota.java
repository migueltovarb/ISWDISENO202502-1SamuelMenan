package PaqueteVeterinaria;

public class Mascota{
    private String nombre;
    private String especie;
    private int edad;
    private Dueño dueno;
    private java.util.List<Controles> controles = new java.util.ArrayList<>();

    public Mascota(String nombre, String especie, int edad) {
        if (isNullOrBlank(nombre) || isNullOrBlank(especie) || edad < 0) {
            throw new IllegalArgumentException("Nombre, especie obligatorios y edad no negativa");
        }
        this.nombre = nombre.trim();
        this.especie = especie.trim();
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public Dueño getDueno() { return dueno; }
    public void setDueno(Dueño d) { this.dueno = d; }

    public java.util.List<Controles> getControles() {
        return java.util.Collections.unmodifiableList(controles);
    }

    public void agregarControl(Controles c) {
        if (c == null) throw new IllegalArgumentException("El control no puede ser null");
        controles.add(c);
    }

    public String resumen() {
        return "Mascota: " + nombre + ", especie: " + especie + ", controles: " + controles.size();
    }

    private static boolean isNullOrBlank(String s) {
        return s == null || s.trim().isEmpty();
    }
    @Override
    public String toString() {
        return "Mascota[nombre=" + nombre +
                ", especie=" + especie +
                ", edad=" + edad +
                (dueno != null ? ", dueño=" + dueno.getNombre() : "") + "]";
    }
}