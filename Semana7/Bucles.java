package Semana7;

public class Bucles {
    public static void main(String[] args) {
        /*
         * Los bucles, se usan para repetir instrucciones o un conjunto de 
         * sentencias. Para romper el bucle se requiere una condición.
         */
        //Bucle FOR: se usa cuando se conoce el número exacto de repeticiones.
        /* for(inicializacion; condicion; incremento){
         * Instrucciones a repetir
         * }
         */
        System.out.println("Listado de numeros del 1 al 10");
        // for (int i = 1; i < 11; i++) {
        //     System.out.println(i);  
        // }
        // Bucle WHILE: va repetir siempre y cuando se cumpla una determinada
        // condicion.
        // int i = 1;
        // while (i < 11) {
        //     System.out.println(i);
        //     i++;
        // }
        //Bucle DO-WHILE: iden que WHILE, salvo, la condicion se evalua al
        // final.
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 11);
    }
}