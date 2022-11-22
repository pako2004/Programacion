package tema2.Refuerzo;

import java.util.Scanner;

public class Ejercicio7y8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");

        double nota1 = sc.nextDouble();

        System.out.println("Ingrese la segunda nota: ");

        double nota2 = sc.nextDouble();

        System.out.println("INgrese la tercera nota: ");

        double nota3 = sc.nextDouble();

        double total = nota1 + nota2 + nota3;

        double media = total/3; 

        System.out.println(media);

        if (media < 5 ) {
    
            System.out.println("Suspenso");
        
        } else if (media >= 5 && media < 7) 
        {
        
            System.out.println("Aprobado");
        } else if (media >= 7 && media < 9 )
        {
            System.out.println("Notable");
        
        }else if (media >= 9 || media == 10)
        {
        
            System.out.println("Sobresaliente");
        }    
        

    }
}
