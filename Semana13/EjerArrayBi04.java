package Semana13;

import java.util.Random;

public class EjerArrayBi04 {
    public static void main(String[] args) {
        /*
         * Ejercicio 3
         * Realiza un programa que rellene un array de 6 filas por 10 columnas
         * con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
         * A continuación, el programa deberá dar la posición tanto del máximo como del
         * mínimo.
         */

        int[][] array = new int[6][10];

        int minimo = 1000;
        int maximo = 0;

        int filaminimo= 0;
        int columnaminimo = 0;
        int filamaximo = 0;
        int columnamaximo = 0;

        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                array[fila][columna] = (int) (Math.random() * 1000) + 0;
                System.out.printf("%7d", array[fila][columna]);
            }
            System.out.println();
        }

        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 10; columna++) {

                // calcula el minimo valor del array
                if (array[fila][columna] < minimo) {
                    minimo = array[fila][columna];
                    filaminimo = fila;
                    columnaminimo = columna;
                }

                // calcula el maximo valor del array
                if (array[fila][columna] > maximo) {
                    maximo = array[fila][columna];
                    filaminimo = fila;
                    columnaminimo = columna;
                }

            }
        }

        System.out.println("El mínimo es: " + minimo);
        System.out.println("Fila: "+ filaminimo + ", Columna: "+ columnaminimo);
        System.out.println("El máximo es: " + maximo);
        System.out.println("Fila: "+ filamaximo + ", Columna: "+ columnamaximo);
    }
}