package ExamenParcial;

import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce variedades de numeros: ");

        int numeroActual = 0;
        int numeroAnterior = 0;
        int contadorRepetidos = 0;
        int maxRepetidos = 0;
        int numeroMasRepetido = 0;
        int contadorIntroducciones = 0;

        while (true) {
            numeroActual = scanner.nextInt();
            contadorIntroducciones++;

            if (numeroActual == 0) {
                break;
            }

            if (numeroActual == numeroAnterior) {
                contadorRepetidos++;
            } else {
                if (contadorRepetidos > maxRepetidos) {
                    maxRepetidos = contadorRepetidos;
                    numeroMasRepetido = numeroAnterior;
                }
                contadorRepetidos = 1;
            }

            numeroAnterior = numeroActual;
        }

        if (contadorRepetidos > maxRepetidos) {
            maxRepetidos = contadorRepetidos;
            numeroMasRepetido = numeroAnterior;
        }
        System.out.println("Se han introducido " + contadorIntroducciones + " números.");
        System.out.println(
                "El número más repetido es el " + numeroMasRepetido + " y se ha escrito " + maxRepetidos + " veces.");
    }
}