package Semana5;

public class OperadoresLogicos01 {
    public static void main(String[] args) {
        /*
         * Operadores Lógicos
         *  Y      &&   ambas expresiones deben ser verdaderas (7<12 && 7<10)
         *  O      ||   al menos una expresion debe ser verdadera (7<12 || 7<4)
         *  NO     !    niega una expresion !(7<12)
         */
        int numero = 0;
        System.out.println("Adivina el número que estoy pensando");
        System.out.println("Ingresa un número entre el 1 y el 100: ");
        numero = Integer.parseInt(System.console().readLine());

        if ((numero < 1) || (numero > 100)) {
            System.out.println("El número ingresado debe estar entre 1 - 100");
            System.out.println("Tienes otra oportunidad, ingrese un número: ");
            numero = Integer.parseInt(System.console().readLine());
        }

        if (numero == 15) {
            System.out.println("Has acertado!!! ");
        } else {
            System.out.println("Lo siento, ese no es el número que estoy pensado!!! ");
        }
    }
}