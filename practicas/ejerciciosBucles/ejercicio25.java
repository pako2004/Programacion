package ejerciciosBucles;

import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        int numeroIntroducido = sc.nextInt();
    
        int numero = numeroIntroducido;
        int volteado = 0;
        
        while (numero > 0) {
          volteado = (volteado * 10) + (numero % 10);
          numero /= 10;
        } // while
        
        System.out.print("Si le damos la vuelta al " + numeroIntroducido);
        System.out.println(" tenemos el " + volteado + ".");

       /*  for (int i = num1;i < 0;){

            i = i%10;

            System.out.println();



        }*/


    }
}
