package Semana5.Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero = 0;

        System.out.println("Ingrese un numero de la semana: ");
        numero= Integer.parseInt(System.console().readLine());

        if (numero == 1) {
            System.out.println("Lunes");
        }
        if (numero == 2) {
            System.out.println("Martes");
        }
        if (numero == 3) {
            System.out.println("Miercoles");
        }
        if (numero == 4) {
            System.out.println("Jueves");
        }
        if (numero == 5) {
            System.out.println("Viernes");
        }
        if (numero == 6) {
            System.out.println("Sabado");
        }
        if (numero == 7) {
            System.out.println("Domingo");
        }

    }
}
