package Semana8;

import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        Random random = new Random();


        int numTiradas = 0;


        while (true) {
 
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;


            System.out.println("Tirada " + (numTiradas + 1) + ": Dado 1 = " + dado1 + ", Dado 2 = " + dado2);


            numTiradas++;


            if (dado1 == dado2) {
                System.out.println("¡Los dados tienen el mismo valor! Se han realizado " + numTiradas + " tiradas.");
                break;
            }
        }
    }
}