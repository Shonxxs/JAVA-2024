package Semana10;

public class Array02 {
    public static void main(String[] args) {
        int[] n = new int[5];

        System.out.println("Ingrese el 1er elemento del array: ");
        n[0] = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el 2do elemento del array: ");
        n[1] = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el 3er elemento del array: ");
        n[2] = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el 4to elemento del array: ");
        n[3] = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el 5to elemento del array: ");
        n[4] = Integer.parseInt(System.console().readLine());

        System.out.println("El primer elemento del array ingresado es "+n[0]);
        System.out.println("El segundo elemento del array ingresado es "+n[1]);
        System.out.println("El tercer elemento del array ingresado es "+n[2]);
        System.out.println("El cuarto elemento del array ingresado es "+n[3]);
        System.out.println("El quinto elemento del array ingresado es "+n[4]);
    }
}