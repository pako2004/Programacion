package bucles.ejercicios;

import java.util.Scanner;

public class frase_Palindromo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean bucle = false;

        String frase = "";

        String fraseVolteada = "";
        


        int condicion = 0;



        do{


            System.out.println("1) Para introducir frase");
            System.out.println("2) salir");

            condicion = sc.nextInt();
            sc.nextLine();
            switch (condicion){



                case 1: 

                    System.out.println("Introduzca la frase:");
                    frase = sc.nextLine();

                    frase = frase.toLowerCase();
                    frase = frase.replaceAll(" ", "");
            
                

                    for (int i = frase.length() -1 ; i >= 0; i--){

                        

                        fraseVolteada += frase.charAt(i);

                    }

                        System.out.println(fraseVolteada);

                        boolean esPalindromo = frase.equals(fraseVolteada);

                        if (esPalindromo){

                            System.out.println("Son palindromos");


                        }else{

                            System.out.println("No lo son");
                            System.out.println();


                        }


                        break;

                case 2:
                bucle = true;
                break;

                default: 

                System.out.println("Opcion no valida");

                break;
                
            }

        }while (bucle == false);


    }
}
