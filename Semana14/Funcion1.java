package Semana14;

import Semana14.Matematicas;

public class Funcion1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());

        if (Matematicas.esPrimo(n)) {
            System.out.println("El " + n + " es primo");
        } else {
            System.out.println("El " + n + " No es primo");
        }

    }
}