package ExamenParcial;

import java.util.Scanner;

public class Pregunta4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el año de nacimiento: ");
        int año = scanner.nextInt();
        System.out.print("Introduce el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Introduce el día de nacimiento (1-31): ");
        int dia = scanner.nextInt();

        if (esFechaValida(año, mes, dia)) {
            int numeroMagico = calcularNumeroMagico(año, mes, dia);

            System.out.println("El número mágico es: " + numeroMagico);
        } else {
            System.out.println("La fecha introducida no es válida.");
        }
    }

    private static boolean esFechaValida(int año, int mes, int dia) {
        if (año > 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= getDiasDelMes(mes)) {
            return true;
        } else {
            return false;
        }
    }

    private static int getDiasDelMes(int mes) {
        switch (mes) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static int calcularNumeroMagico(int año, int mes, int dia) {
        int suma = año + mes + dia;
        while (suma > 9) {
            suma = sumarDigitos(suma);
        }
        return suma;
    }

    private static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }
}