package Semana8;

import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
         Random random = new Random();


        int contador = 0;


        while (true) {
            int numero = random.nextInt(51) * 2;
            System.out.println(numero);
            contador++;


            if (numero == 24) {
                System.out.println("¡Se ha generado el número 24!");
                break;
            }
        }


        System.out.println("Se han generado " + contador + " números.");
    }
}