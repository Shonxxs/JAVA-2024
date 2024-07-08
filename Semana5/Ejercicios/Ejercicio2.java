package Semana5.Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un día de la semana que sea del (lunes, martes, miércoles, jueves, viernes): ");
        String dia = scanner.nextLine();
        if (dia.equalsIgnoreCase("lunes")) {
            System.out.println("A primera hora tienes Algoritmos y Programacion");
        } else if (dia.equalsIgnoreCase("martes")) {
            System.out.println("A primera hora tienes Calculo 1");
        } else if (dia.equalsIgnoreCase("miércoles")) {
            System.out.println("A primera hora tienes Estadistica");
        } else if (dia.equalsIgnoreCase("jueves")) {
            System.out.println("A primera hora Investigacion de operaciones(IO)");
        } else if (dia.equalsIgnoreCase("viernes")) {
            System.out.println("A primera hora no tienes clases");
        } else {
            System.out.println("Día no válido");
        }
    }
}