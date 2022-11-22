package ejerciciosBucles;

import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int acum = 0;

        System.out.print("Introduce un numero: ");
        
        int numeroIntroducido = sc.nextInt();

        System.out.println("Introduce un digito: ");

        int digito = sc.nextInt();

        int numero = numeroIntroducido;

        int volteado = 0;

        String posicion = "";

        
        int i = 0;

        while (numero>0){

            volteado = (volteado * 10) + (numero % 10);
          numero /= 10;

        }
        
        do{


            i = (volteado % 10);
            volteado /= 10;

            acum++;

            if ( i == digito){

                posicion += acum+", ";


            }




        }while ( volteado> 0);


        System.out.println("El digito "+digito+" tiene la posicion "+posicion);


        }



    }
