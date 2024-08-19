package Semana10;

public class Array03 {
    public static void main(String[] args) {
           // definicion del array y reserva de espacios
           int[] numeros = new int[5];

           numeros[0] = 8;
           numeros[1] = 33;
           numeros[2] = 200;
           numeros[3] = -12;
           numeros[4] = 11;
   
           System.out.println("El array numeros tiene 5 elementos ¿cuál de ellos quiere ver?");
           System.out.print("Introduzca un número del 0 al 4: ");
   
           int index = Integer.parseInt(System.console().readLine());
   
           System.out.print("El elemento que se encuentra en la posición " + index);
           System.out.println(" es el " + numeros[index]);
   
       }
   }