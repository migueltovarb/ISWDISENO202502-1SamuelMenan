package PaqueteVeterinaria;

public class ProgramaVeterinaria {
    private java.util.Map<String, Dueño> duenosPorDocumento = new java.util.HashMap<>();

    public void registrarDueno(String nombre, String documento, String telefono) {
        if (duenosPorDocumento.containsKey(documento)) {
            throw new IllegalArgumentException("Ya existe un dueño con ese documento");
        }
        Dueño d = new Dueño(nombre, documento, telefono);
        duenosPorDocumento.put(d.getDocumento(), d);
    }

    public void registrarMascota(String documentoDueno, String nombre, String especie, int edad) {
        Dueño d = duenosPorDocumento.get(documentoDueno);
        if (d == null) throw new IllegalArgumentException("El dueño no existe");
        Mascota m = new Mascota(nombre, especie, edad);
        m.setDueno(d);
        d.agregarMascota(m);
    }

    public void registrarControl(String documentoDueno, String nombreMascota, String fecha, String tipo, String observaciones) {
        Dueño d = duenosPorDocumento.get(documentoDueno);
        if (d == null) throw new IllegalArgumentException("El dueño no existe");
        Mascota m = d.buscarMascotaPorNombre(nombreMascota);
        if (m == null) throw new IllegalArgumentException("La mascota no existe para ese dueño");
        Controles c = new Controles(fecha, tipo, observaciones);
        m.agregarControl(c);
    }

    public java.util.List<Controles> historialMascota(String documentoDueno, String nombreMascota) {
        Dueño d = duenosPorDocumento.get(documentoDueno);
        if (d == null) throw new IllegalArgumentException("El dueño no existe");
        Mascota m = d.buscarMascotaPorNombre(nombreMascota);
        if (m == null) throw new IllegalArgumentException("La mascota no existe para ese dueño");
        return m.getControles();
    }

    public String resumenPorMascota(String documentoDueno, String nombreMascota) {
        Dueño d = duenosPorDocumento.get(documentoDueno);
        if (d == null) throw new IllegalArgumentException("El dueño no existe");
        Mascota m = d.buscarMascotaPorNombre(nombreMascota);
        if (m == null) throw new IllegalArgumentException("La mascota no existe para ese dueño");
        return m.resumen();
    }

    public static void main(String[] args) {
        ProgramaVeterinaria app = new ProgramaVeterinaria();
        app.registrarDueno("Samuel", "1080044964", "3184821735");
        app.registrarDueno("Juan", "1080045987", "3188721920");

        app.registrarMascota("1080044964", "Pepe", "Perro", 4);
        app.registrarMascota("1080044964", "Michi", "Gato", 2);

        app.registrarControl("1080044964", "Pepe", "2025-10-08", "vacuna", "Antirrábica");
        app.registrarControl("1080044964", "Pepe", "2025-10-15", "chequeo", "Control general");

        System.out.println(app.resumenPorMascota("1080044964", "Pepe"));
        for (Controles c : app.historialMascota("1080044964", "Pepe")) {
            System.out.println(c);
        }
    }
}