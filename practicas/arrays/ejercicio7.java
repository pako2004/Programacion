package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale.LanguageRange;

public class ejercicio7 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] array = new int[100];
        generarAleatorios(array);

        imprimir(array);

        //leer numero a modificar y nuevo numero

        System.out.println("Que numero desea Buscar?");
        int numeroBuscado = sc.nextInt();
        System.out.println("Ingrese el numero nuevo");
        int numeroNuevo = sc.nextInt();
        boolean[] posiciones = modificarArray(array, numeroBuscado, numeroNuevo);
        //modificar arrar

        imprimir(array, posiciones);



    }

    static void generarAleatorios(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*21);
        }
    }

    static void imprimir (int[] array){
        System.out.println(Arrays.toString(array));
    }
    /**
     * Cambia el numero buscado por el numero nuevo en todo el array
     * @param array
     * @param numeroBuscado
     * @param numeroNuevo
     * @return
     */
    static boolean[] modificarArray (int[] array, int numeroBuscado, int numeroNuevo){
        boolean[] posiciones = new boolean[100];
        for (int i = 0; i < array.length; i++){
                if (array[i]== numeroBuscado){
                    array[i] = numeroNuevo;
                    posiciones[i] = true;
                }
        }
        return posiciones;
    }
    /**
     * Imprime el array, y los numeros cambiados los pone entre comillas
     * @param array
     * @param posiciones
     */
    static void imprimir (int[] array, boolean[] posiciones ){

        for (int i = 0; i < array.length; i++){
            if (posiciones[i] == true){ 
                System.out.print("\""+array[i]+"\" ");
            }else{
            System.out.print(array[i]+" ");
            }
        }

    }

}
