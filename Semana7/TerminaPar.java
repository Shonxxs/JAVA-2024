package Semana7;

public class TerminaPar {
    public static void main(String[] args) {
        int numero;

        do {
            System.out.println("Ingresa un número: ");
            numero = Integer.parseInt(System.console().readLine());

            if (numero % 2 ==0) {
                System.out.println("Que buen numero: "+numero);
            } else {
                System.out.println("Ingresastes un mal numero, ADIOS!!!");
            }
        } while (numero % 2 ==0);
    }
}
