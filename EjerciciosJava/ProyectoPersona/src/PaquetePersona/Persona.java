package PaquetePersona;

import java.util.Random;

public class Persona {
    // Constantes
    public static final char SEXO_HOMBRE = 'H';
    public static final char SEXO_MUJER = 'M';

    // Atributos
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;   // en kg
    private double altura; // en metros

    // Constructores
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = SEXO_HOMBRE; // por defecto hombre
        this.peso = 0;
        this.altura = 0;
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.dni = generaDNI();
    }

    // Métodos
    public int calcularIMC() {
        if (altura <= 0) return 0;
        double imc = peso / (altura * altura);
        if (imc < 20) return -1; // bajo peso
        if (imc <= 25) return 0; // peso ideal
        return 1;                // sobrepeso
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        if (sexo == SEXO_HOMBRE || sexo == SEXO_MUJER) {
            return sexo;
        }
        return SEXO_HOMBRE; // por defecto
    }

    private String generaDNI() {
        Random rnd = new Random();
        int num = 10000000 + rnd.nextInt(90000000); // 8 cifras
        char letra = (char) ('A' + (num % 23)); // simplificado
        return num + "" + letra;
    }

    // Getters y setters (excepto DNI que no debe modificarse)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad +
                ", dni='" + dni + "', sexo=" + sexo +
                ", peso=" + peso + ", altura=" + altura + "}";
    }
}
