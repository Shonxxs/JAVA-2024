package Semana3.Ejercicio11;

public class Ejercicio1 {
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

        int multiplicacion = numero1 * numero2;

        System.out.println("La multiplicacion es: "+ multiplicacion);
    }
}
