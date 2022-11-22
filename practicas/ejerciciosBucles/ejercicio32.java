package ejerciciosBucles;

import java.util.Scanner;

public class ejercicio32 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero: ");

        long numero = sc.nextLong();

        String pares = "";

        long volteado = 0;

        long i = 0;

        int suma     = 0;

        while (numero>0){

            volteado = (volteado * 10) + (numero % 10);
          numero /= 10;

        }

        do{


            i = (volteado % 10);
            volteado /= 10;

            

            if ( i % 2 == 0 ){

                pares += i+", ";

                suma += i;


            }


        }while ( volteado> 0);

    

        System.out.println("Digitos pares: "+ pares);
        System.out.println("suma de los digitos :"+suma);
    }
}
