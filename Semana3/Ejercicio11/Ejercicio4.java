package Semana3.Ejercicio11;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.println("Introduce el primer numero y el segundo numero separados por un espacio: ");
        
        int y = lee.nextInt();
        int x = lee.nextInt();

        int suma = x + y;
        int resta = x - y;
        int multiplicacion = x * y;
        double division = (double) x / (double )y;

        System.out.println("La suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
