package Semana9;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio05 {
    public static void main(String[] args) {

        int oportunidades = 5;
        int numeroIntroducido;
        boolean acertado = false;
        int numeroMisterioso = (int) (Math.random() * 100);

        System.out.println("Estoy pensando un múmero del 0 al 100, adivinalo. Tienes 5 oportunidades");

        do {
            System.out.print("Introduce un número: ");
            numeroIntroducido = Integer.parseInt(System.console().readLine());
            oportunidades--;
            if ((numeroIntroducido > numeroMisterioso) && (oportunidades > 0)) {
                System.out.println("El número que estoy pensando es menor que " + numeroIntroducido);
                System.out.println("Te quedan " + oportunidades + " oportunidades.");
            }
            if ((numeroIntroducido < numeroMisterioso) && (oportunidades > 0)) {
                System.out.println("El número que estoy pensando es mayor que " + numeroIntroducido);
                System.out.println("Te quedan " + oportunidades + " oportunidades.");
            }
            if (numeroIntroducido == numeroMisterioso) {
                acertado = true;
                System.out.println("!Has acertado!");
            }
        } while (!acertado && (oportunidades > 0));

        if (!acertado) {
            System.out.println("Lo siento, no has acertado, el numero que estaba pensando era el " + numeroMisterioso);
        }
    }
}