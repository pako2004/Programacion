package funciones.ejercicios;

import java.util.Scanner;

public class Ejercicio2_LuisRodriguez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        int altura = 0;



        System.out.println("Introduzca una cadena");
        cadena = sc.nextLine();

        System.out.println("Introduzca una altura");
        altura = sc.nextInt();
        altura *= 2;
        int largo = (altura/2) + cadena.length() ; //Largo de cada linea
        for (int i = 0; i <= altura ; i++){//bucle principal
          

            for (int j = 0; j <= largo  ; j++){ //Bucle que genera lineas
                if (i == (altura /2)){
                    
                    if (j == 2 ){
                        System.out.print(cadena);
                        System.out.print("X");
                        System.out.print("X");
                        j = largo;
                    }else{
                    System.out.print("X");
                    }
                    

                }else{
                    
                    if (i % 2 != 0){

                    System.out.print("A");

                    }
                    if (i % 2 == 0){

                    System.out.print("H");

                    }
                }
                
            }
            System.out.println(""); // salto del linea

        }



    }
}
