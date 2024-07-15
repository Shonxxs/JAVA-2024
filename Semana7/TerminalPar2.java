package Semana7;

public class TerminalPar2 {
    public static void main(String[] args) {
        int numero;
        String rpta;
        do {
            System.out.println("Ingrese un número: ");
            numero = Integer.parseInt(System.console().readLine());

            System.out.println("Quieres continuar? (s/n)");
            rpta = System.console().readLine();
        } while (rpta.equals("s"));
        System.out.println("ADIOS!!!!");
    }
}
