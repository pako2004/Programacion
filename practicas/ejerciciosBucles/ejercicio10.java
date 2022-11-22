package ejerciciosBucles;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double num = 0;
        double media = 0;
        double total = 0;
        double acum = 0;



        while (num >= 0){

            System.out.println("Introduzca un numero (Numero negativo para cerrar el programa)");

            num = sc.nextDouble();

            total += num;

            if (num >= 0){

                acum++;
            }

            



        }

            media = total / acum;

            System.out.println("La media es de: "+ media);


    }
}
