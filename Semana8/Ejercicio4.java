package Semana8;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
         Random random = new Random();


        int numeroSecreto = random.nextInt(101);


        Scanner scanner = new Scanner(System.in);


        int oportunidades = 5;


        System.out.println("¡Bienvenido al juego de adivinanza de números!");
        System.out.println("Tienes 5 oportunidades para adivinar el número secreto.");


        while (oportunidades > 0) {
            System.out.print("Introduce un número entre 0 y 100: ");
            int numeroIntroducido = scanner.nextInt();


            if (numeroIntroducido == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número secreto.");
                break;
            } else {
                oportunidades--;
                System.out.println("Lo siento, no has adivinado el número secreto.");
                System.out.println("Te quedan " + oportunidades + " oportunidades.");


                if (numeroIntroducido < numeroSecreto) {
                    System.out.println("El número que has introducido es menor que el número secreto.");
                } else {
                    System.out.println("El número que has introducido es mayor que el número secreto.");
                }
            }
        }


        if (oportunidades == 0) {
            System.out.println("Lo siento, has agotado todas tus oportunidades.");
            System.out.println("El número secreto era " + numeroSecreto);
        }
    }
}