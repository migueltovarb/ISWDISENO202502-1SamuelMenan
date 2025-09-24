package PaquetePersona;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el sexo (H/M): ");
        char sexo = sc.nextLine().toUpperCase().charAt(0);

        System.out.print("Ingrese el peso (kg): ");
        double peso = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese la altura (m): ");
        double altura = Double.parseDouble(sc.nextLine());

        // Crear los tres objetos
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona p2 = new Persona(nombre, edad, sexo);
        Persona p3 = new Persona();
        // Configurar atributos al último con setters
        p3.setNombre("Carlos");
        p3.setEdad(22);
        p3.setSexo('H');
        p3.setPeso(70);
        p3.setAltura(1.75);

        // Mostrar resultados
        mostrarInfo(p1);
        mostrarInfo(p2);
        mostrarInfo(p3);

        sc.close();
    }

    private static void mostrarInfo(Persona persona) {
        int imc = persona.calcularIMC();
        String estadoPeso = (imc == -1) ? "Por debajo del peso ideal" :
                (imc == 0) ? "Peso ideal" :
                        "Sobrepeso";

        System.out.println("\n--- Información de la persona ---");
        System.out.println(persona);
        System.out.println("Estado IMC: " + estadoPeso);
        System.out.println("¿Es mayor de edad?: " + (persona.esMayorDeEdad() ? "Sí" : "No"));
    }
}
