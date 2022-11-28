package funciones;

import java.util.Scanner;

public class menuFunciones {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean salir = false;

        do{

            System.out.println("----FUNCIONES----");
            System.out.println("a) Capicua");
            System.out.println("B) Primo");
            System.out.println("");

            String opcion = sc.nextLine();

            int numero = 0;
            switch (opcion){

                case "A":

                    System.out.println("Introduce un numero");
                    numero = sc.nextInt();

                    Boolean esCapicua = MathPako.esCapicua(numero);

                    if(esCapicua){

                        System.out.println("ES capicuo");   

                    }else{

                        System.out.println("No es capicuo");


                    }   

                    break;
                
                case "B":

                    System.out.println("Introduce un numero ");
                    numero = sc.nextInt();
                    boolean esPrimo = MathPako.esPrimo(numero);

                    if (esPrimo){

                        System.out.println("El numero es primo");

                    }else{

                        System.out.println("El numero no es primo");

                    }



            }

            



        }while (salir == false);



    }
}
