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

    // Funcion que calcula el area de un cuadrado
    public static double areaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }
    public static double areaCirculo(double radius){
        return 3.1416 *radius *radius;

    } 
    public static double areaTiangulo(double lado , double base){
        return base * lado ;
    }
    public static double areaRectangulo (double largo, double ancho){
        return largo * ancho;
    }
}