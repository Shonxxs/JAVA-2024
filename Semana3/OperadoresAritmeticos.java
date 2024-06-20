package Semana3;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int x = 2;
        int y = 9;

        int suma = x + y;
        int resta = x - y;
        int multiplicacion = x * y;
        double division = (double) x / (double )y;
        int resto = x % y;

        System.out.println(x + " " + suma + " " + resta);
        System.out.println(multiplicacion + " " + division + " " + resto);
    }
}
