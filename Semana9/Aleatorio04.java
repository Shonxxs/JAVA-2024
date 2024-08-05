package Semana9;

import java.util.Random;

public class Aleatorio04 {
    public static void main(String[] args) {
        
        int dado1 = (int) (Math.random() * 6+1);
        int dado2 = (int) (Math.random() * 6+1);

        int suma = dado1 + dado2;

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Suma: " + suma);

        if (suma == 7) {
            System.out.println("Ganador!");
        } else {
            System.out.println("NO ganastes!!!!");
        }
    }
}  
    
