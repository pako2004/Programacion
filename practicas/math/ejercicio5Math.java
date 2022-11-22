package math;

import java.util.Scanner;

public class ejercicio5Math {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de seg:");

        Float numeroSegundos = sc.nextFloat();
        Float operacionSegundos  = numeroSegundos / 60;
    


        System.out.println("Estas por el minuto: " + Math.ceil(operacionSegundos));
    }
    
}
