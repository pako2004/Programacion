package bucles;

import java.util.Scanner;

public class ejercicio_SUma {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = (int)(Math.random()*(100 + 1));
    int num2 = (int)(Math.random()*(100 + 1));
    int respuesta;
    String condicion = "si";

    do{

        System.out.println("Cuanto es la suma de "+num1 + " + " +num2);
        respuesta = sc.nextInt();
        
        int suma = num1 + num2;

        if (respuesta == suma){

          System.out.println("Respuesta correcta");



        }else{

          System.out.println("Respuesta Incorrecta, la respuesta es: "+suma);

        }
        
        System.out.println("Quiere volver a jugar? (si/no)");

        condicion = sc.next();

        if  (condicion.equals("si")){

          num1 = (int)(Math.random()*101);

          num2 = (int)(Math.random()*101);


        }

    } while (condicion.equals("si"));



  }  
}
