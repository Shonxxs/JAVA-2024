package Semana12;

public class EjerArray01 {
    public static void main(String[] args) {
      /*
         * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados.
         */

         int[] numeros =  new int[100];
         int i;
         String verde = "\033[32m";
         String blanco = "\033[37m";
         //Rellenar el array con 100 numeros aleatorios del 0 al 20
         for ( i = 0; i < numeros.length; i++) {
            numeros[i]= (int)(Math.random()*20+1);
            System.out.print(numeros[i] + " ");
         }

         System.out.println("\nIntroduzca un numero de los que se han mostrado: ");
         int valor1 = Integer.parseInt(System.console().readLine());

         System.out.println("Introduzca un numero por cual sustituirlo: ");
         int valor2= Integer.parseInt(System.console().readLine());

         for (i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor1) {
                numeros[i] = valor2;
                System.out.print(verde + "\"" + numeros[i] + "\" ");
            } else {
                System.out.print(blanco + numeros[i] + " ");
            }
            
         }


    }
}  