package PaqueteCuenta;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Creando una nueva cuenta...");

        System.out.print("Ingrese el nombre del titular: ");
        String titular = sc.nextLine();

        System.out.print("Ingrese la cantidad inicial (0 si no desea): ");
        double cantidadInicial;
        // Validación simple para evitar excepciones si escriben texto
        while (true) {
            try {
                String linea = sc.nextLine();
                cantidadInicial = Double.parseDouble(linea.trim());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Valor inválido. Ingrese un número para la cantidad inicial: ");
            }
        }

        Cuenta miCuenta = new Cuenta(titular, cantidadInicial);
        System.out.println(miCuenta);

        System.out.print("¿Desea ingresar dinero? Escriba el monto (0 para omitir): ");
        double montoIngreso;
        while (true) {
            try {
                montoIngreso = Double.parseDouble(sc.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Valor inválido. Ingrese el monto a ingresar: ");
            }
        }
        miCuenta.ingresar(montoIngreso);
        System.out.println("Después de ingresar: " + miCuenta);

        System.out.print("¿Desea retirar dinero? Escriba el monto (0 para omitir): ");
        double montoRetiro;
        while (true) {
            try {
                montoRetiro = Double.parseDouble(sc.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Valor inválido. Ingrese el monto a retirar: ");
            }
        }
        miCuenta.retirar(montoRetiro);
        System.out.println("Después de retirar: " + miCuenta);

        sc.close();
    }
}
