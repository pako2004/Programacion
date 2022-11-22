package bucles.ejercicios;

import java.net.SocketTimeoutException;
import java.text.spi.NumberFormatProvider;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import javax.print.DocFlavor.STRING;

public class MenuFrase_LuisRodriguez {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char condicion;
        String frase = "";
        int numeroPalabras = 1;
        String opcionD = "";
        int numeroVeces = 0;
        int bucle = 1;
        int posicionD = 0;
        String posiciones = "";




        do{

            System.out.println("* Opcion a - Añadir a la frase");
            System.out.println("* Opcion b - Indicar la ultima frase introducida");
            System.out.println("* Opcion c - Indicar el numnero de palabras que tiene la frase");
            System.out.println("* Opcion d -Indicar cuantas veces a aparece un carácter en la frase");
            System.out.println("* Opcion e - Limpiar frase");

            System.out.println("* Opcion s - salir");

            condicion = sc.nextLine().charAt(0);

            switch(condicion){

                case 'a':
                    int  acum = 0;
                    acum++;                            

                    System.out.println("Introduzca la frase");

                    String nuevoTrozo = sc.nextLine();

                    frase = frase+" "+nuevoTrozo;

              


                    break;

                case  'b':

                    if (frase.equals("")){
                    
                    System.out.println("No hay una frase introducida");

                    }else{

                        System.out.println(frase);

                    }




                     break;

                case 'c':

                    int longFrase = frase.length();

                    for (int i = 0; i == longFrase;){

                    posicionD = frase.indexOf(' ');

                    posiciones =posicionD+" ";
                }

                    

                    System.out.println("Cantidad de palabras" +posicionD);

                    


                break;

                case 'd':

                break;

                case 'e':

                break;

                case 's':

                bucle = 0;

                break;

            }
        }while (bucle == 1);






    }
}
