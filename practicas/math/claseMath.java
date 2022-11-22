package math;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class claseMath {
    
    public static void main(String[] args) {
        //ABS
        System.out.println(Math.abs(-3));

        //Min y Max

        double num1 = 12.35634;
        double num2 = 12.356234;
        double num3 = 12.6234;
        double minimo = Math.min(num1, num2);
        minimo = Math.min(minimo, num3);

        System.out.println("El minimo es: " + minimo);
        double maximo =Math.max(num1, num2);
        System.out.println("El maximo es: " + maximo);

        //Potencia - pow
        System.out.println("2 elevado a 4" +Math.pow(4, 2));






        //Redondeo - round

        System.out.println(num1 + " -> " + Math.round(num1));
        System.out.println(num3 + " -> " + Math.round(num3));

        System.out.println(num1 + " floor -> " + Math.floor(num1));
        System.out.println(num3 + " floor -> " + Math.floor(num3));

        System.out.println(num1 + " ceil  -> " + Math.ceil(num1));
        System.out.println(num3 + " ceil -> " + Math.ceil(num3));

        //Aleatorio

        System.out.println("0 y 1   " + Math.random()); //0 y 1

        System.out.println("0 y 100   " + Math.random()*100); //0 y 100

        System.out.println("50 y 100   " + Math.random()*(100+50)+(100-50)); //50 y 100



        // Hacer un programa que nos pida un numero de segundos y nos indique en que minutos estamos

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de seg:");

        int numeroSegundos = sc.nextInt();
        int operacionSegundos  = numeroSegundos / 60;
    


        System.out.println("Estas por el minuto: " + Math.round(operacionSegundos));

        
        

    
    }





}
