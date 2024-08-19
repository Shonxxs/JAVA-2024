package Semana10;

public class Array04 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int suma = 0;
        double promedio;

        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*20+1);
            suma = suma + num[i];
        }
        promedio= suma / num.length;

        for (int i = 0; i < num.length; i++) {
            System.out.println("num ["+i+"] : "+num[i]);
        }

        System.out.println("El promedio de los numeros del arreglo es: "+promedio);
    }
}