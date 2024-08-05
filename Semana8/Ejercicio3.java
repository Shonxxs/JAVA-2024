package Semana8;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[50];

        for (int i = 0; i < 50; i++) {
            numeros[i] = random.nextInt(100) + 100;
        }

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        int max = numeros[0];
        int min = numeros[0];
        int sum = 0;
        for (int numero : numeros) {
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
            sum += numero;
        }
        double media = (double) sum / numeros.length;

        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + media);
    }
}