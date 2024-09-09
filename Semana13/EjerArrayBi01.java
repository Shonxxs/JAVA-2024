package Semana13;

public class EjerArrayBi01 {
    public static void main(String[] args) {
        int f, c;

        int[][] n = { { 0, 30, 2, 0, 0, 5 }, { 75, 0, 0, 0, 0, 0 }, { 0, 0, -2, 9, 0, 11 } };

        for (f = 0; f < 3; f++) {
            System.out.print("Fila: " + f);
            for (c = 0; c < 6; c++) {
                System.out.printf("%10d", n[f][c]);
            }
            System.out.println();
        }
    }
}