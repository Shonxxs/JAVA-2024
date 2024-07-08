package Semana5;

public class Sentencialf03 {
    public static void main(String[] args) {
        //Operadores de comparación
        /*
         * Igual            ==     a == b
         * Distinto         !=     a != b
         * mayor que        >      a > b
         * menor que        <      a < b
         * mayor igual que  >=     a >= b
         * menor igual que  <=     a <= b
         */
        int notaFinal = 0;
        System.out.println("Ingrese nota final: ");
        notaFinal = Integer.parseInt(System.console().readLine());

        if (notaFinal >= 11) {
            System.out.println("Has aprobado");
        } else {
            System.out.println("Has reprobado");
        }
    }
}
