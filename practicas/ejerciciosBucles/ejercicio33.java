package ejerciciosBucles;

import java.util.Scanner;

public class ejercicio33 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la altura");

        int altura = sc.nextInt();


        for (int i = 0; i < altura-1; i++){// lateral izquierdo     

            System.out.print("*");
            
            for (int j = 0; j < altura-2; j++){ // espacios 
                System.out.print(" ");

            }

            System.out.println("*");



            
        }

        for (int i = 0; i < altura-altura+1; i++){

            System.out.print(" ");

            for (int j = 0; j <altura-2; j++){

                System.out.print("*");

            }
            System.out.println(" ");


        }
    }
}
