package math;

import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class ejercicio2Math {
    public static void main(String[] args) {
        

        System.out.println("Introduzca numero al que le quiere sacar exponente: ");

        Scanner sc = new Scanner(System.in);

        int expo1 = sc.nextInt();
        
        System.out.println("Introduza el numero del exponente: ");
        
        Scanner sc2 = new Scanner(System.in);

        int num2 = sc2.nextInt();

        System.out.println("El resultado de la operacion es: " + Math.pow(expo1, num2));



    }
    
}
