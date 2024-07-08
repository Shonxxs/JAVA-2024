package Semana5;

public class Sentencialf01 {
    public static void main(String[] args) {
        String respuesta = "";

        System.out.println("¿Cuál es la capital de venezuela?");
        respuesta = System.console().readLine();

        if (respuesta.equals("caracas")) {
            System.out.println("Eres un genio, debes estar en sistemas");
            
        } else {
            System.out.println("Recoge tu pico y pala, ve a la chacra");
        }
    }
}
