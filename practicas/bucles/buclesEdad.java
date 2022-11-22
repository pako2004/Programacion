package bucles;

import java.util.Scanner;



public class buclesEdad {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int edad = 0;
        int max = 0;
        int min;

        System.out.println("Introduzca una edad");
        edad = sc.nextInt(); 

        min = edad;
        max = edad;
        while (edad >= 0 ){

            System.out.println("Introduzca una edad");
            edad = sc.nextInt();

            if (edad > max){

                max = edad;
            }
            

            min=Math.min(min, edad);
        }
        
        System.out.println("La edad minima es: "+min);

        System.out.println("La edad maximo es: "+max);
        

        


    }
}
