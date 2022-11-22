package tema2;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
/*
 * Leer nota numerica y pasarla a letra
 * suspenso 0-4,9
 * aprobado 5-7
 * notable 7-9
 * sobresaliente 9-10
 */

Scanner sc = new Scanner(System.in);

System.out.println("Introduzca nota numerica: ");

float nota = sc.nextFloat();



if (nota < 5 ) {
    
    System.out.println("Suspenso");

} else if (nota >= 5 && nota < 7) 
{

    System.out.println("Aprobado");
} else if (nota >= 7 && nota < 9 )
{
    System.out.println("Notable");

}else if (nota >= 9 || nota == 10)
{

    System.out.println("Sobresaliente");
}











    }
    
}
