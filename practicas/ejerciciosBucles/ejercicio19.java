package ejerciciosBucles;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Introduzca la altura de la piramide:");

        int altura = sc.nextInt();

        System.out.println("Introduzca el caracter de relleno");

        String relleno = sc.next();*/

        String vacio = " ";
        int base = 1;
      
        int longitud = 1;

        /*while (base <= longitud){
        for (int i = 1; i <  espacios;i++){

            System.out.print("a");

        }

        for (int i = 1; i <= longitud; i++) {
                if (i < 2){

                    System.out.println(relleno);
                }
                if (i == longitud){
                    System.out.println(relleno);
                }
                System.out.println("a");


        }
        System.out.println();
        
        base++;
        espacios--;*/


        int alturaPiramide = 4;
        

        for (int altura = 1; altura <= alturaPiramide; altura++ ){

            // creamos los espacios que hay en cada fila
            for (int numeroEspacios = 0; numeroEspacios<alturaPiramide-altura; numeroEspacios++){

                System.out.print("_");
            }
            
        

        

        //creo la izquierda de la piramide

        for(int aux = 0; aux < altura; aux++){

            System.out.print("*");
        }
            // Creo la parte derecha
            for (int aux = 1 ; aux<altura; aux++){


                System.out.print( " M" );


            }
            System.out.println("");
        
        
    }
    }

}