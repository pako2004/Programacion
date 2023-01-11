package arrays;

import java.util.Arrays;

public class ejercicio6 {
    
    public static void main(String[] args) {
        
        int[] array = new int[15];
        rellenarAlea(array);
        System.out.println(Arrays.toString(array));

        rotarArray(array);
        System.out.println(Arrays.toString(array));


    }
    static void rellenarAlea(int[] tabla){


        for (int i = 0; i < tabla.length; i++){

            tabla[i] = (int)(Math.random()*101);

        }
    }

    static void rotarArray (int[] array){

        int[] tabla = Arrays.copyOf(array, array.length);

        for (int i = 0; i < tabla.length; i++){

            if(i == tabla.length-1){

                array[0] = tabla[tabla.length-1];
                
            }else{
            array[i+1] = tabla[i]; 
            }

        }

    }
}
