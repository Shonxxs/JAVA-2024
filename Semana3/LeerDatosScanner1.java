package Semana3;

import java.util.Scanner;

public class LeerDatosScanner1 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.println("Introduce tu nombrey edad separados por un espacio: ");
        
        String nombre = lee.next();
        int edad = lee.nextInt();

        System.out.println("Tu nombre es: "+ nombre + ", tu edad es: "+ edad);
    }
}
