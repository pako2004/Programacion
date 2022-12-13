package funciones.ejercicios;

import funciones.MathPako;

public class Ejercicio15 {
    public static void main(String[] args) {

        int numero = 1;

        while (numero <= 1000){
            int acum = 1;
            numero = MathPako.siguientePrimo(numero);
            System.out.println( acum+"- "+numero);
            acum++;
        }




    }
}
