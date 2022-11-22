package ejerciciosBucles;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ejercicio7 {
    public static void main(String[] args) {
        
        int contraseña = 2314;

        int usuario = 0;

        Scanner sc = new Scanner(System.in);

        int intentos = 0;


        while (intentos < 4){


            System.out.println("Introduzca el codigo de la caja fuerte");

            usuario = sc.nextInt();

            if (usuario == contraseña){

                System.out.println("La caja fuerte se ha abierto satisfactoriamente");

                intentos = intentos + 5;


            }else{

                System.out.println("Lo siento, esa no es la combinacion");

                intentos++;
                
                System.out.println("Intentos restantes: "+(4-intentos));
            }




        }



    }
}
