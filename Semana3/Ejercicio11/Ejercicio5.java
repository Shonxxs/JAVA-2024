package Semana3.Ejercicio11;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.println("Introduce el primer numero y el segundo numero separados por un espacio: ");
        
        int b = lee.nextInt();
        int h = lee.nextInt();

        int areaRectangulo = b * h;
        
        System.out.println("El area de un rectangulo es: "+ areaRectangulo);
    }    
}
