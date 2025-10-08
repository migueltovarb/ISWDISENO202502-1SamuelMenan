package PaqueteVeterinaria;

public class Dueño {
    private String nombre;
    private String documento;
    private String telefono;

    public Dueño(String nombre, String documento, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
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

    @Override
    public String toString() {
        return "Dueño[nombre=" + nombre +
                ", documento=" + documento +
                ", telefono=" + telefono + "]";
    }
}