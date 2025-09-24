package PaqueteCuentaEjecutable;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular: ");
        String titular = sc.nextLine();

        System.out.print("Ingrese la cantidad inicial (0 si no desea): ");
        double cantidadInicial = Double.parseDouble(sc.nextLine());

        Cuenta miCuenta = new Cuenta(titular, cantidadInicial);
        System.out.println("Cuenta creada: " + miCuenta);

        System.out.print("Ingrese un monto a depositar: ");
        double montoIngreso = Double.parseDouble(sc.nextLine());
        miCuenta.ingresar(montoIngreso);
        System.out.println("Después de ingresar: " + miCuenta);

        System.out.print("Ingrese un monto a retirar: ");
        double montoRetiro = Double.parseDouble(sc.nextLine());
        miCuenta.retirar(montoRetiro);
        System.out.println("Después de retirar: " + miCuenta);

        sc.close();
    }
}

