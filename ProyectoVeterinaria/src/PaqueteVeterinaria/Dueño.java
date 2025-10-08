package PaqueteVeterinaria;

public class Dueño {
    private String nombre;
    private String documento;
    private String telefono;

    private java.util.List<Mascota> mascotas = new java.util.ArrayList<>();

    public Dueño(String nombre, String documento, String telefono) {
        if (isNullOrBlank(nombre) || isNullOrBlank(documento) || isNullOrBlank(telefono)) {
            throw new IllegalArgumentException("Nombre, documento y teléfono son obligatorios");
        }
        this.nombre = nombre.trim();
        this.documento = documento.trim();
        this.telefono = telefono.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public java.util.List<Mascota> getMascotas() {
        return java.util.Collections.unmodifiableList(mascotas);
    }

    public Mascota buscarMascotaPorNombre(String nombreMascota) {
        if (isNullOrBlank(nombreMascota)) return null;
        for (Mascota m : mascotas) {
            if (m.getNombre().equalsIgnoreCase(nombreMascota.trim())) {
                return m;
            }
        }
        return null;
    }

    public void agregarMascota(Mascota mascota) {
        if (mascota == null) throw new IllegalArgumentException("La mascota no puede ser null");
        if (buscarMascotaPorNombre(mascota.getNombre()) != null) {
            throw new IllegalArgumentException("Ya existe una mascota con ese nombre para este dueño");
        }
        mascotas.add(mascota);
    }

    private static boolean isNullOrBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    @Override
    public String toString() {
        return "Dueño[nombre=" + nombre +
                ", documento=" + documento +
                ", telefono=" + telefono + "]";
    }
}