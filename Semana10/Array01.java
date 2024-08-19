package Semana10;

public class Array01 {
    public static void main(String[] args) {
        /*
         * Un array es un tipo de dato capaz de almacenar múltiples valores. Se utiliza
         * para agrupar datos muy parecidos, por ejemplo, si se necesita almacenar la
         * temperatura media diaria en Málaga durante el último año se pueden utilizar las variables
         * temp0, temp1, temp2, temp3, temp4, ... y así hasta 365 variables distintas pero
         * sería poco práctico; es mejor utilizar un array de nombre temp y usar un índice para referenciar la
         * temperatura de un día concreto del año.
         */
        int[] numeros; // definiendo un array de enteros
        numeros = new int[4]; // reservamos el espacio para 4 enteros

        numeros[0] = 23;
        numeros[1] = 3;
        numeros[2] = 13;
        numeros[3] = 123;

        System.out.println("Los valores del array numero son: ");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);

        int suma = numeros[1] + numeros[3];
        System.out.println("El segundo elemento del array y el ultimo elemento suman: "+suma);


    }
}