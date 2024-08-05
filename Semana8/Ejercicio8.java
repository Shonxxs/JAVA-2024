package Semana8;

import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
         Random random = new Random();


        String[] figuras = {"Corazón", "Diamante", "Herradura", "Campana", "Limón"};


        String figura1 = figuras[random.nextInt(figuras.length)];
        String figura2 = figuras[random.nextInt(figuras.length)];
        String figura3 = figuras[random.nextInt(figuras.length)];


        System.out.println("Tirada: " + figura1 + " - " + figura2 + " - " + figura3);


        if (figura1.equals(figura2) && figura2.equals(figura3)) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else if (figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3)) {
            System.out.println("Bien, ha recuperado su moneda");
        } else {
            System.out.println("Lo siento, ha perdido");
        }
    }
}