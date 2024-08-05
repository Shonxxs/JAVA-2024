package Semana9;

public class Aleatorio02 {
    public static void main(String[] args) {
      
        System.out.println("20 numeros aleatorios entre 50 y 60 (sin decimales)");

        for (int i = 1; i < 21; i++) {
            System.out.println((int)((Math.random()*11)+50));     
        }
    }
}