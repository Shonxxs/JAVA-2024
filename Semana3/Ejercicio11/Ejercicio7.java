package Semana3.Ejercicio11;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.print("Introduce el número de horas trabajadas esta semana: ");
        
        int horasTrabajadas = lee.nextInt();
        int salarioPorHora = 12;
        int salarioSemanal = horasTrabajadas * salarioPorHora;

        System.out.println("El salario semanal es: " + salarioSemanal + " soles");
    }
}
