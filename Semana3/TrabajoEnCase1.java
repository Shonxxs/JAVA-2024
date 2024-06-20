package Semana3;

public class TrabajoEnCase1 {
    public static void main(String[] args) {
        int euros;
        double soles;

        System.out.println("Ingresa un monto en Euros: ");
        euros = Integer.parseInt(System.console().readLine());

        soles = euros * 4.09;
        System.out.println("El valor en soless es: "+ soles);
    }
}
