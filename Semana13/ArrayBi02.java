package Semana13;

public class ArrayBi02 {
    public static void main(String[] args) {
        int f, c;

        int[][] n = { { 20, 0 }, { 67, 33 }, { 0, 7 } };

        for (f = 0; f < 3; f++) {
            System.out.print("Fila: " + f);
            for (c = 0; c < 2; c++) {
                System.out.printf("%10d", n[f][c]);
            }
            System.out.println();
        }
    }
}
  