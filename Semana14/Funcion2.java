package Semana14;

public class Funcion2 {
    public static void main(String[] args) {
        double l, b, a, r;
        int op;

        System.out.println("Ingrese el numero de la operación a realizar: ");
        System.out.println("--------------------------------------------: ");
        System.out.println("1. Area del cuadrado");
        System.out.println("2. Area del circulo");
        System.out.println("3. Area del triangulo");
        System.out.println("3. Area del rectangulo");

        op = Integer.parseInt(System.console().readLine());

        switch (op) {
            case 1:
                System.out.println("Ingresar el valor de lado del cuadrado: ");
                l = Double.parseDouble(System.console().readLine());
                System.out.println("El area del cuadrado es " + Matematicas.areaCuadrado(l));

                break;

            case 2:
                System.out.println("Ingresar el valor del circulo: ");
                b = Double.parseDouble(System.console().readLine());
                System.out.println("El area del circulo es " + Matematicas.areaCirculo(b));

                break;

            case 3:
                System.out.println("Ingresar el valor del triangulo: ");
                a = Double.parseDouble(System.console().readLine());
                System.out.println("El area del triangulo es " + Matematicas.areaCirculo(a));

                break;

            case 4:
                System.out.println("Ingresar el valor del rectangulo: ");
                r = Double.parseDouble(System.console().readLine());
                System.out.println("El area del rectangulo es " + Matematicas.areaCirculo(r));

                break;

        }
    }
}