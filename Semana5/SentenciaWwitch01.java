package Semana5;

public class SentenciaWwitch01 {
    public static void main(String[] args) {
        int dia = 0;
        System.out.println("Ingrese el número de dia: ");
        dia = Integer.parseInt(System.console().readLine());

        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "no existe ese día";
                break;
        }
        System.out.println("El día " + dia + ": " + nombreDia);
    }
}