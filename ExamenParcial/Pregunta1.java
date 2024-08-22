package ExamenParcial;

import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Introduce el valor final: ");
        int fin = scanner.nextInt();

        System.out.print("Introduce el tamaño del grupo: ");
        int grupo = scanner.nextInt();

        int contador = 0;
        for (int i = inicio; i <= fin; i++) {
            System.out.print(i + " ");
            contador++;

            if (contador == grupo) {
                System.out.println();
                System.out.print("¿Quieres continuar? (s/n): ");
                String respuesta = scanner.next();

                if (respuesta.equalsIgnoreCase("n")) {
                    break;
                }

                contador = 0;
            }
        }
    }
}