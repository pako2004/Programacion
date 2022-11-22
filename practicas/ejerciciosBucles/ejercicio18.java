package ejerciciosBucles;

import java.util.Scanner;

import javax.net.ssl.ManagerFactoryParameters;
import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;

public class ejercicio18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer numero: ");

        int a = sc.nextInt();

        System.out.println("Introduzca el segundo numero: ");

        int b = sc.nextInt();

        int num1;
        int num2;


        if  (a != b){
        num1 = Math.min(a, b);
        num2 = Math.max(a,b);

            for (int i = num1 ;i < num2;) {

                i = i+7;

                System.out.println(i);


            }


        
        }

            



        }

        




    }

