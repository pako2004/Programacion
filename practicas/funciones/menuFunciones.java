package funciones;

import java.util.Scanner;

public class menuFunciones {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean salir = false;

        do{

            System.out.println("----FUNCIONES----");
            System.out.println("A) Capicua");
            System.out.println("B) Primo");
            System.out.println("C) siguiente Primo ");
            /*System.out.println("D) Sacar potencia");
            System.out.println("E) Cuantos digitos");
            System.out.println("F) Voltea el numero");
            System.out.println("G) Digito en posicon n");
            System.out.println("H) Posicion de un digito");
            System.out.println("I) Quitar por detras");
            System.out.println("J) QUitar por adelante");
            System.out.println("K) Pegar por delante");
            System.out.println("L) pegar por detras");
            System.out.println("M) Trozo del numero");
            System.out.println("N) Juntar numeros ");*/


            String opcion = sc.nextLine();

            int numero = 0;
            sc.nextLine();
            switch (opcion){

                case "A":

                    System.out.println("Introduce un numero");
                    numero = sc.nextInt();

                    Boolean esCapicua = MathPako.esCapicua(numero);

                    if(esCapicua == true){

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
                    break;
                
                case "C":
                    System.out.println("Introduce un numero");
                    numero = sc.nextInt();

                    MathPako.siguientePrimo(numero);

                    System.out.println("El siguiente primo es: "+ numero);
                    break;



            }

            
            


        }while (salir == false);



    }
}
