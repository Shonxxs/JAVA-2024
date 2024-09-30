package Semana14;

import java.util.Scanner;
import java.util.regex.MatchResult;

import Semana14.MatchLibrary.MathLibrary;

public class FuncionEjercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatchLibrary mathLibrary = new MatchLibrary();

        while (true) {
            System.out.println("┌────────────────────────────────┐");
            System.out.println("│       ESCOGE LA OPERACION      │");
            System.out.println("├────────────────────────────────┤");
            System.out.println("│ A.- esCapicua                  │");
            System.out.println("│                                │");
            System.out.println("│ B.- esPrimo                    │");
            System.out.println("│                                │");
            System.out.println("│ C.- siguientePrimo             │");
            System.out.println("│                                │");
            System.out.println("│ D.- potencia                   │");
            System.out.println("│                                │");
            System.out.println("│ E.- digitos                    │");
            System.out.println("│                                │");
            System.out.println("│ F.- voltea                     │");
            System.out.println("│                                │");
            System.out.println("│ G.- digitoN                    │");
            System.out.println("│                                │");
            System.out.println("│ H.- posicionDeDigito           │");
            System.out.println("│                                │");
            System.out.println("│ I.- quitaPorDetras             │");
            System.out.println("│                                │");
            System.out.println("│ J.- quitaPorDelante            │");
            System.out.println("│                                │");
            System.out.println("│ K.- pegaPorDetras              │");
            System.out.println("│                                │");
            System.out.println("│ L.- pegaPorDelante             │");
            System.out.println("│                                │");
            System.out.println("│ M.- trozoDeNumero              │");
            System.out.println("│                                │");
            System.out.println("│ N.- juntaNumeros               │");
            System.out.println("└────────────────────────────────┘");

            System.out.print("Ingrese la opción: ");
            String opcion = scanner.nextLine().toUpperCase();

            switch (opcion) {
                case "A":
                    System.out.print("Ingrese un número: ");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("El número es capicúa: " + MathLibrary.esCapicua(num));
                    break;
                case "B":
                    System.out.print("Ingrese un número: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("El número es primo: " + MathLibrary.esPrimo(num));
                    break;
                case "C":
                    System.out.print("Ingrese un número: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("El siguiente primo es: " + MathLibrary.siguientePrimo(num));
                    break;
                case "D":
                    System.out.print("Ingrese la base: ");
                    double base = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el exponente: ");
                    int exponente = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("La potencia es: " + MathLibrary.potencia(base, exponente));
                    break;
                case "E":
                    System.out.print("Ingrese un número: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("El número de dígitos es: " + MathLibrary.digitos(num));
                    break;
                case "F":
                    System.out.print("Ingrese un número: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("El número volteado es: " + MathLibrary.voltea(num));
                    break;
                case "G":
                    System.out.print("Ingrese un número: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese la posición del dígito: ");
                    int posicion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("El dígito en la posición es: " + MathLibrary.digitoN(num, posicion));
                    break;
                case "H":
                    System.out.print("Ingrese un número: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el dígito a buscar: ");
                    int digito = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("La posición del dígito es: " + MathLibrary.posicionDeDigito(num, digito));
                    break;
                case "I":
                    System.out.print("Ingrese un número: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el número de dígitos a quitar: ");
                    int digitos = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("El número sin los últimos " + digitos + " dígitos es: "
                            + MathLibrary.quitaPorDetras(num, digitos));
                    break;
                case "J":
                    System.out.print("Ingrese un número: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el número de dígitos a quitar: ");
                    digitos = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("El número sin los primeros " + digitos + " dígitos es: "
                            + MathLibrary.quitaPorDelante(num, digitos));
                    break;
                case "K":
                    System.out.print("Ingrese un número: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el número a pegar: ");
                    int num2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("El número con el número pegado es: " + MathLibrary.pegaPorDetras(num, num2));
                    break;
                case "L":
                    System.out.print("Ingrese un número: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el número a pegar: ");
                    num2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("El número con el número pegado es: " + MathLibrary.pegaPorDelante(num, num2));
                    break;
                case "M":
                    System.out.print("Ingrese un número: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese la posición inicial: ");
                    posicion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese la longitud del trozo: ");
                    int longitud = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("El trozo de número es: " + MathLibrary.trozoDeNumero(num, posicion, longitud));
                    break;
                case "N":
                    System.out.print("Ingrese el primer número: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("La unión de los números es: " + MathLibrary.juntaNumeros(num, num2));
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}