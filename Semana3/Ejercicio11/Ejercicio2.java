package Semana3.Ejercicio11;

public class Ejercicio2 {
    public static void main(String[] args) {
        String linea;

        System.out.println("Ingresa el monto en Euros: ");
        linea = System.console().readLine();
        int euros;
        euros = Integer.parseInt(linea);

        double soles = 4.09;

        double tipoCambio = soles *euros ;
     
        System.out.println("La cantidad de Euros es: " + tipoCambio);

    }
}
