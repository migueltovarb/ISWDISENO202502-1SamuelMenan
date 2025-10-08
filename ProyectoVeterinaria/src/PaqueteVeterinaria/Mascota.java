package PaqueteVeterinaria;

public class Mascota{
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
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
    @Override
    public String toString() {
        return "Dueño[nombre=" + nombre +
                ", especie=" + especie +
                ", edad=" + edad + "]";
    }
}