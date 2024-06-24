package Semana3.Ejercicio11;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
       Scanner lee = new Scanner(System.in);

          System.out.print("Introduce la nota del primer examen (0-20): ");
          int notaPrimerExamen = lee.nextInt();

          System.out.print("Introduce la media deseada (0-20): ");
          int mediaDeseada = lee.nextInt();

          double pesoPrimerExamen = 0.4; 
          double pesoSegundoExamen = 0.6; 

          double notaNecesariaSegundoExamen = (mediaDeseada - (notaPrimerExamen * pesoPrimerExamen)) / pesoSegundoExamen;

          System.out.println("La nota necesaria en el segundo examen es: " + notaNecesariaSegundoExamen);

    }
}
