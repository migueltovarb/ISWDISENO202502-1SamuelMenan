package PaqueteVeterinaria;

public class ProgramaVeterinaria {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("pepe","perro", 4);
        Dueño dueño1 = new Dueño("Samuel", "1080044964", "3184821735");
        Dueño dueño2 = new Dueño("Juan", "1080045987", "3188721920");

        System.out.println(mascota1);
    }
}