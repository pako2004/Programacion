package ejerciciosBucles;

import java.util.Scanner;



public class ejercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int num1 = 0;
        int min = 10001;
        int max = 0;
        int acum = 0;

        do{

            System.out.println("Introduzca un numero");

            num1 = sc.nextInt();

            suma = suma + num1;
            acum++;
            min = Math.min(min, num1);
            max = Math.max(num1, max);

        }while (suma<10000);

        System.out.println("La suma de los numeros es de: "+suma);
        System.out.println("La media es de: "+suma/(double)acum);
        System.out.println("El minimo es: "+min);
        System.out.println("El maximo es de: "+max);
        System.out.println("La cantidad de numeros introducidos es: "+acum);

        
    }
}
