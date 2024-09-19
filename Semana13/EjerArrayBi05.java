package Semana13;

import java.util.Random;

public class EjerArrayBi05 {
    public static void main(String[] args) {

        int[][] matrix = new int[12][12];
        Random random = new Random();
        for (int fila = 0; fila < 12; fila++) {
            for (int columna = 0; columna < 12; columna++) {
                matrix[fila][columna] = (int) (Math.random() * 101) + 0;
            }
        }

        System.out.println("Matrix original:");
        for (int fila = 0; fila < 12; fila++) {
            for (int columna = 0; columna < 12; columna++) {
                System.out.printf("%3d ", matrix[fila][columna]);
            }
            System.out.println();
        }

        int[][] rotarMatrix = new int[12][12];
        for (int fila = 0; fila < 12; fila++) {
            for (int columna = 0; columna < 12; columna++) {
                rotarMatrix[columna][11 - fila] = matrix[fila][columna];
            }
        }

        System.out.println("Matrix rotada:");
        for (int fila = 0; fila < 12; fila++) {
            for (int columna = 0; columna < 12; columna++) {
                System.out.printf("%3d ", rotarMatrix[fila][columna]);
            }
            System.out.println();
        }
    }
}