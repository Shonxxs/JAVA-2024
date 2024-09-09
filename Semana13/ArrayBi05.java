package Semana13;

public class ArrayBi05 {
    public static void main(String[] args) {
        int[][] n = new int[4][5];

        int f, c;

        for (f = 0; f < 4; f++) {
            for (c = 0; c < 5; c++) {
                n[f][c] = (int) (Math.random() * 100 + 0);

            }
        }
        for (f = 0; f < 4; f++) {
            System.out.print("Fila: " + f);
            for (c = 0; c < 5; c++) {
                System.out.printf("%10d", n[f][c]);
            }
            System.out.println();
        }
    }
    
}