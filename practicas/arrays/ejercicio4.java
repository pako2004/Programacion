package arrays;

import java.util.Arrays;

public class ejercicio4 {
    
    public static void main(String[] args) {
        
        int[] numero = new int[20];
        rellenarAlea(numero);
        int[] cuadrado = new int[20];
        rellenarCuadrado(numero, cuadrado);
        int[] cubo = new int[20];
        rellenarCubo(numero,cubo); 
        
        
        imprimir(numero, cuadrado, cubo);





    }

    static void rellenarAlea(int[] tabla){


        for (int i = 0; i < tabla.length; i++){

            tabla[i] = (int)(Math.random()*101);

        }
    }

    static void rellenarCuadrado (int[] tabla, int[] tabla2){

        for (int i = 0; i < tabla.length; i++){

            tabla2[i] = tabla[i] * 2;

        }

    }

    static void rellenarCubo (int[] tabla, int[] tabla2){

        for (int i = 0; i < tabla.length; i++){

            tabla2[i] = (int)(Math.pow(tabla[i], 3));

        }

    }

    static void imprimir(int[]array1, int[]array2, int[] array3){

        for (int i = 0; i < array1.length; i++){

            System.out.println(array1[i]+ "\t"+array2[i]+"\t"+array3);

        }

    }
    

}
