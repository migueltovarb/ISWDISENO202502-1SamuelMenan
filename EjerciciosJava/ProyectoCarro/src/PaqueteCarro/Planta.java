package PaqueteCarro;

import java.util.Random;

public class Planta {
    private String nombre;
    private String[] tiposLlantas = {"Deportiva", "TodoTerreno", "Económica"};
    private double[] tamañosLlantas = {15, 17, 19};
    private double[] pesosChasis = {800, 1000, 1200};
    private String[] materiales = {"Aluminio", "Acero"};
    private String[] colores = {"Rojo", "Negro", "Blanco", "Azul"};

    private Random rnd = new Random();

    public Planta(String nombre) {
        this.nombre = nombre;
    }

    public Carro fabricarCarro() {
        String tipoLlanta = tiposLlantas[rnd.nextInt(tiposLlantas.length)];
        double tamañoLlanta = tamañosLlantas[rnd.nextInt(tamañosLlantas.length)];
        Llantas llantas = new Llantas(tipoLlanta, tamañoLlanta);

        double pesoChasis = pesosChasis[rnd.nextInt(pesosChasis.length)];
        String material = materiales[rnd.nextInt(materiales.length)];
        Chasis chasis = new Chasis(pesoChasis, material);

        String color = colores[rnd.nextInt(colores.length)];

        return new Carro(llantas, chasis, color);
    }

    public String getNombre() {
        return nombre;
    }
}

