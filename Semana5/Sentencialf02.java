package Semana5;

public class Sentencialf02 {
    public static void main(String[] args) {
        int numero = 0;

        System.out.println("Ingrese un número entero");
        numero = Integer.parseInt(System.console().readLine());

        if (numero > 0) {
            System.out.println("El número ingresado es positivo");
        } else {
            System.out.println("El número ingresado es negatico");
        }
    }
}
