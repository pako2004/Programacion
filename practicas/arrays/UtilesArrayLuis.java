package arrays;

import java.util.Scanner;

public class UtilesArrayLuis {
    
static Scanner sc = new Scanner(System.in);


    public static  boolean esNulo(int[] tabla){

        boolean nulo = false;

        if(tabla == null){
            System.out.println("Es nulo");
            nulo = true;
        }else{
            System.out.println("No es nulo");
        }
        return nulo;
    }

    public static int[] limipiar(){

        int[] copia = null;
        return copia;
    }
}
