package Semana3;

public class SaludoNombre {
    public static void main(String[] args) {
        String nombre; 
        System.out.println("Por favor, escribe tu nombre: ");
        nombre = System.console().readLine();
        System.out.println("Hola " + nombre);
    }
}
