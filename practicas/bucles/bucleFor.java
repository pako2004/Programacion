package bucles;

import java.util.Scanner;

import javax.crypto.ShortBufferException;
import javax.print.event.PrintEvent;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.html.FormSubmitEvent;

public class bucleFor {
    public static void main(String[] args) {
        
        // mostrar numeros 1 a n
        
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Hasta que numero quiere llegar?");

        int N = sc.nextInt();

        System.out.println("De cuanto en cuanto quiere ir?");

        int salto = sc.nextInt();

        for (int i = 1; i<= N;i = i+= salto){

            System.out.println(i);
            

        }*/


        // multiplos 7 hasta N

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Hasta que numero quiere llegar?");

        int N = sc.nextInt();

        for (int i = 0; i <= N; i +=7){

            System.out.println(i);



        }*/

        //PEDIR 10 NUMEROS Y MOSTRAR LA MEDIA Y LA SUMA TOTAL 

        /*Scanner sc = new Scanner(System.in);

        float num;
        float media = 0;
        float suma = 0;

        for (int i = 1; i <= 10; i++){

            System.out.println("Introduzca un numero");
            num = sc.nextFloat();

            suma += num;

            

        }

        media = suma / 10;

        System.out.println("La suma total es: "+suma);
        System.out.println("La media es: "+media);*/

        // tabla de multiplicar de N

        /*Scanner sc = new Scanner(System.in);

        int num;


      
       
        for (int i = 1; i <= 10; i++){

            System.out.println("");
            System.out.println("TABLA DE MULTIPLICAR DE "+i);

            for (int j = 1; j <= 10 ; j++){

                System.out.println(j+" x "+i+" = "+(j*i));


            }


       
        
        } */

        Scanner sc = new Scanner(System.in);
        
System.out.println(" x del rextangulo");

int x = sc.nextInt();

System.out.println(" y del rectangulo");

int y = sc.nextInt();

        for (int i = 0; i < y; i++ ){

            for (int j = 0;j < x; j++){

                System.out.print("x");
                

            }
                System.out.println("");

        }


        
    }
}
