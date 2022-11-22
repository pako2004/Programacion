package bucles;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcion;
        float num1;
        float num2;
        float resul = 0;
        
        do{

            System.out.println("====Calculadora====");

            System.out.println("1 - SUMA");
            System.out.println("2 - RESTA");
            System.out.println("3 - MULTIPLICACION");
            System.out.println("4 - DIVISION");
            System.out.println("0 - SALIR");

            opcion = sc.nextInt();

            switch (opcion){

                case 1:
                System.out.println("Escribe el primer numero");
                num1 = sc.nextFloat();
                System.out.println("Escribe el segundo numero");
                num2 = sc.nextFloat();
                resul = num1 + num2;
                break;
                
                case 2: 
                System.out.println("Escribe el primer numero");
                num1 = sc.nextFloat();
                System.out.println("Escribe el segundo numero");
                num2 = sc.nextFloat();
                resul = num1 - num2;
                break;

                case 3:

                System.out.println("Escribe el primer numero");
                num1 = sc.nextFloat();
                System.out.println("Escribe el segundo numero");
                num2 = sc.nextFloat();
                resul = num1 * num2;
                break;
                case 4:

                System.out.println("Escribe el primer numero");
                num1 = sc.nextFloat();
                System.out.println("Escribe el segundo numero");
                num2 = sc.nextFloat();
                resul = num1 / num2;
                break;

                default:



            }

                if (opcion > 0){

                    System.out.println("El resultado de su operacion es : "+resul);
                    System.out.println("");


                }else {
                    System.out.println("");
                    System.out.println("Hasta luego");
                }








            }while (opcion != 0);


    }
}
