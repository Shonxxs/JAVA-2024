package Semana8;

import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random random = new Random();


        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};


        int paloAleatorio = random.nextInt(palos.length);
        int cartaAleatoria = random.nextInt(cartas.length);


        System.out.println("La carta aleatoria es: " + cartas[cartaAleatoria] + " de " + palos[paloAleatorio]);
    }
}