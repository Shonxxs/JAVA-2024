package Semana13;

public class ArrayBi01 {
    public static void main(String[] args) {
        /*
         * Un array de bidemensional o de dos dimenciones en un arreglo que utiliza dos
         * indices,
         * es un array que contiene a otro array
         */
        int[][] n = new int[3][2]; // declarar un array de 3 filas por 2 columnas

        n[0][0] = 20;
        n[1][0] = 27;
        n[1][1] = 33;
        n[2][1] = 7;

        int f, c;

        for (f = 0; f < 3; f++) {
            System.out.print("Fila: " + f);
            for (c = 0; c < 2; c++) {
                System.out.printf("%10d", n[f][c]);
            }
            System.out.println();
        }
    }
}
