package PaqueteCarro;

public class Programa {
    public static void main(String[] args) {
        Planta planta1 = new Planta("Planta Norte");
        Planta planta2 = new Planta("Planta Sur");

        System.out.println("Fabricando carros en " + planta1.getNombre());
        for (int i = 1; i <= 100; i++) {
            Carro c = planta1.fabricarCarro();
            System.out.println("Carro #" + i + ": " + c);
        }

        System.out.println("\nFabricando carros en " + planta2.getNombre());
        for (int i = 1; i <= 100; i++) {
            Carro c = planta2.fabricarCarro();
            System.out.println("Carro #" + i + ": " + c);
        }
    }
}

