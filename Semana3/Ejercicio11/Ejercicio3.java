package Semana3.Ejercicio11;

public class Ejercicio3 {
    public static void main(String[] args) {
        int pasetas;
        double euros;

        System.out.println("Ingresa un monto en Pasetas: ");
        pasetas = Integer.parseInt(System.console().readLine());

        euros = pasetas * 0.018;
        System.out.println("El valor en Euros es: "+ euros);
    }
}
