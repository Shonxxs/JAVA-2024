package Semana8;

import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        Random random = new Random();


        while (true) {


            int codigoAscii = random.nextInt(95) + 32;
            char caracter = (char) codigoAscii;


            System.out.print(caracter);


            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    }