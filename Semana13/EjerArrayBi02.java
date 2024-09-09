package Semana13;

public class EjerArrayBi02 {
    public static void main(String[] args) {
        /*
         * Ejercicio 2
         * Escribe un programa que genere aleatoriamente 20 números enteros. Estos
         * números se deben
         * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
         * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
         * tratara. La suma total debe aparecer en la esquina inferior derecha.
         */
        int[][] num = new int[4][5]; // Array de 4 filas por 5 columnas

        int fila;
        int columna;

        // Genera los numeros aleatorios y los introduce en cada espacio del array
        System.out.println("Array de 4 x 5");
        for (fila = 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++) {
                num[fila][columna] = (int) (Math.random() * 100) + 1;
                // System.out.print("\t("+fila+", "+columna+ ") -> " + num[fila][columna]);
                System.out.printf("%7d", num[fila][columna]);
            }
            System.out.println();
        }

        // Sumas parciales de las filas
        int sumaFila;

        System.out.println("Array de 4 x 5, con sumas parciales en filas");
        for (fila = 0; fila < 4; fila++) {
            sumaFila = 0;
            for (columna = 0; columna < 5; columna++) {
                System.out.printf("%7d", num[fila][columna]);
                sumaFila += num[fila][columna];
            }
            System.out.printf("|%7d\n", sumaFila);
        }

        // Sumas parciales de las columnas
        for (columna = 0; columna < 5; columna++) {
            System.out.print("-------");
        }
        System.out.println("-------");

        int sumaColumna;
        int sumaTotal = 0;

        for (columna = 0; columna < 5; columna++) {
            sumaColumna = 0;
            for (fila = 0; fila < 4; fila++) {
                sumaColumna += num[fila][columna];
            }
            sumaTotal += sumaColumna;
            System.out.printf("%7d", sumaColumna);
        }
        System.out.printf("|%7d ", sumaTotal);
    }

}