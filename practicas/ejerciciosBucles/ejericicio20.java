package ejerciciosBucles;

import java.util.Scanner;

public class ejericicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la altura de la piramide");
        int alturaIntroducida = sc.nextInt();
        
        int espaciosPorDelante = alturaIntroducida - 1;
         
        int altura= 1;
        int alturaActual = 1;


        for (altura = 1; altura <= alturaIntroducida; altura++ ){

            // creamos los espacios que hay en cada fila
            for (int numeroEspacios = 0; numeroEspacios<alturaIntroducida-altura; numeroEspacios++){

                System.out.print("_");
            }
            
        

        

        //creo la izquierda de la piramide

        for(int aux = 0; aux <= altura; aux++){

            System.out.print("*");

            for(aux = 0; aux <= (altura-2); aux++){

                System.out.print(" ");

            }

            // Creo la parte derecha
            for (aux = 1 ; aux<altura-2; aux++){


                System.out.print( "*" );


            }
            System.out.println("");
        }
        
    }


    }
}
