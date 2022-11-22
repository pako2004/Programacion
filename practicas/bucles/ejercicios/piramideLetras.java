package bucles.ejercicios;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class piramideLetras {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean bucleALtura = false;
        int altura = 0;
        String relleno = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letra;
        int posicion = 0;
        relleno =relleno.toLowerCase();
        do{
            System.out.println("Introduzca una altura, máximo 25");

            altura = sc.nextInt();

            System.out.println("Introduzca desde que letra quiere empezar");
            sc.nextLine();
            letra = sc.nextLine().toLowerCase();

            



            if (altura <= 25){

                bucleALtura = true;

            }

            for (int i = 0; i < relleno.length(); i++){ //for para saber en que posicion esta el caracter  
                        
                if (relleno.substring(i).startsWith(letra)){
                    posicion = i; 
                    System.out.println(posicion);
                    i = relleno.length();
                }
            }

    

         }while (bucleALtura == false);


        for (int i = 0 ; i <= altura - 1; i++){

            for (int x = 0 ; x <= i; x++){

                
                //System.out.print(relleno.charAt(posicion));
                //posicion += 1;

                int codigoAsciiCaracter = (((int)posicion + x) % 25) + 65;
                char nuevoCaracter = (char)codigoAsciiCaracter;
                System.out.print(nuevoCaracter);


                
            }

            System.out.println();

        }

    }
}
