package Semana3;

public class LeeNumeros {
    public static void main(String[] args) {
        String linea;

        System.out.println("Ingresa el primer numero: ");
        linea = System.console().readLine();
        int numero1;
        numero1 = Integer.parseInt(linea);

        System.out.println("Ingresa el segundo numero: ");
        linea = System.console().readLine();
        int numero2;
        numero2 = Integer.parseInt(linea);

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / (double) numero2;
        
        System.out.println("La suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
