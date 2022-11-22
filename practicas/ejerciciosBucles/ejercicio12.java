package ejerciciosBucles;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres saber de la tabla fibonacci?");

        int n = sc.nextInt();
        
        int num1 = 0;
        
        int fibonacci = 1;

      switch (n){
        
        
        case 1:
        System.out.println("0");
        break;
        case 2:
        System.out.println("0,1");
        break;

        default:

        System.out.println("0");
        System.out.println("1");


        for (int i = 0; i < n; i++){
            int num =fibonacci;
            fibonacci =num1 + fibonacci;
            
            num1 = num;
            
            
        
        

        System.out.println(fibonacci);


    }
}
}
}