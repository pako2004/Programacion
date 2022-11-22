package bucles.ejercicios;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

import javax.print.DocFlavor.STRING;
import javax.sound.midi.Soundbank;
import javax.swing.JSpinner.NumberEditor;

public class cifrado {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String texto = "";
        String cifrado = "";
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String palabra = "";
        abc = abc.toLowerCase();

        char espacio = ' ';

        boolean bucle = false;

        char ascii = 'a';

        int factor = 0;
        String [] palabras ;
        
        do{

            System.out.println("------ CIFRADO ------");

            System.out.println("a) Introducir frase");
            System.out.println("b) Cifrar frase");
            System.out.println("c) descifrar");
            System.out.println("d) Ver frase");
            System.out.println("e) salir");

            char opcion = sc.nextLine().charAt(0);


            switch (opcion){

                case 'a':

                    System.out.println();
                    System.out.print("Introduzca el texto:");

                    texto = sc.nextLine().toUpperCase();
                    
                    System.out.println("Introduce un factor");

                    factor = sc.nextInt();


                    palabras = texto.split(" ");

                break;
                   

                case 'b':   //cifrado

                    palabras = texto.split(" ");

                    //recorro todas las palabras
                    for (int x = 0; x <= palabras.length-1; x++){

                        palabra = palabras[x]; 

                        String palabraCifrada = "";
                        
                        //recorrer 1 palabra y cifrarla
                        for (int i = 0; i<= palabra.length() -1; i++){

                            char caracter = palabra.charAt(i);


                            int numeroNuevoCaracter = (int)caracter + factor;


                                //veo si estoy en el rango de 65 a 90

                                if (numeroNuevoCaracter > 90){

                                //tengo que empezar desde A cuando llega a Z

                                numeroNuevoCaracter = ((numeroNuevoCaracter - 65)% 25)+65;
                                    
                            }
                            cifrado = factor + "";
                        char nuevoCaracter = (char)numeroNuevoCaracter;
                        cifrado +=nuevoCaracter;
                        System.out.println("texto : "+caracter +"---------"+ " cifrado "+nuevoCaracter + " ("+numeroNuevoCaracter+")");
                    }
                    
                    cifrado += " ";
                    }
                    

                    System.out.println("---------");
                    System.out.println("La frase cifrada es: "+cifrado);
                    break;

                    case 'c':

                        System.out.print("Introduce el cifrado: ");
                         cifrado = sc.nextLine();

                         System.out.print("Introduce el factor: ");

                         factor = sc.nextInt();



                         





                    break;

                    case 'd':

                    break;

                    case 'e':

                    bucle = true;
                    break;
                    }

                    sc.nextLine();

                }while (bucle == false);
            







        

    }
}
