package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

import funciones.MathPako;

public class ejercicio10 {
    public static void main(String[] args) {
        
        int[] numeros = new int[10];

        aleatorio(numeros);

        System.out.println(Arrays.toString(numeros));

        organizar(numeros);

        System.out.println("---------------------");

        System.out.println(Arrays.toString(numeros));
        
    }

    static void aleatorio(int[] array) {

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*21);
        }

    }

    static void organizar (int[]array){

        int[] tabla = Arrays.copyOf(array, array.length);
        int posicion = 0;
        for (int i = 0; i < array.length; i++){

            if (MathPako.esPrimo(array[i])){
                array[posicion] = array[i];
                array[i] = tabla[posicion];
                posicion++;
            }
        }

    }
}
