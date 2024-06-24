package Semana3.Ejercicio11;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
     Scanner lee = new Scanner(System.in);

        System.out.print("Introduce el tamaño en Mb: ");

        int tamañoEnMb = lee.nextInt();
        int tamañoEnKb = tamañoEnMb * 1024;

        System.out.println(tamañoEnMb + " Mb es igual a " + tamañoEnKb + " Kb");
    }
}
