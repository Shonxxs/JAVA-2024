package Semana3.Ejercicio11;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.println("Introduce el primer numero y el segundo numero separados por un espacio: ");
        
        int base = lee.nextInt();
        int altura = lee.nextInt();

        double areaTriangulo = (double) base * (double) altura / 2;
        
        System.out.println("El area de un triangulo es: "+ areaTriangulo);
    }
}
