package Semana13;

import java.util.Random;

public class EjerArrayBi03 {
    public static void main(String[] args) {
        /*
         * Ejercicio 3
         * Realiza un programa que rellene un array de 6 filas por 10 columnas
         * con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
         * A continuación, el programa deberá dar la posición tanto del máximo como del
         * mínimo.
         */

        int[][] array = new int[6][10];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = random.nextInt(0, 1001);
                System.out.printf("%7d", array[i][j]);
            }
            System.out.println();
        }
    }
}