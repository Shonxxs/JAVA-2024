package Semana14;

public class Matematicas {
    public static boolean esPrimo(int x) {
       
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }
}