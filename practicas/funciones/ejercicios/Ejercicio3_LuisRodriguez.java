package funciones.ejercicios;

import java.util.Scanner;

import javax.management.openmbean.OpenMBeanConstructorInfoSupport;

public class Ejercicio3_LuisRodriguez {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String caracteres = "";
        String cadena = "";
        String posiciones = "";
        int veces = 0;
        String palabra = "";
        char opcion = 'a';
        boolean salir = false;
        
        do{

            System.out.println("A)Introducir una cadena de caracteres");
            System.out.println("B)Mostrar la cadena actual");
            System.out.println("C)Buscar cadena");
            System.out.println("D)Recorres cadena");
            System.out.println("E)Invertir cadena");
            System.out.println("F)Salir");

            opcion = sc.nextLine().toUpperCase().charAt(0);

            switch (opcion){

                case 'A':
                    cadena = "";
                    System.out.println("Introduzca cadena");
                    cadena = sc.nextLine();

                break;

                case 'B':
                    System.out.println("La cadena actual es: "+cadena);
                break;

                case 'C':

                    System.out.println("Que caracteres quiere buscar?");
                    caracteres = sc.nextLine();
                    cadena.toLowerCase();
                    caracteres.toLowerCase();
                    String[] parts = cadena.split(" "); //array de la cadena
                    for (int i = 0; i <= cadena.length(); i++){

                        if (caracteres.equals(parts[i])){

                            veces++;
                            posiciones = posiciones+", ";


                        }

                        if ( i == (cadena.length()-1)){
                            
                            System.out.println("La cadena: "+caracteres+" aparece : "+veces+" veces");
                            System.out.println("Aparecen en la posicion: "+posiciones);

                        }
                
                    }
                    break;
                    case 'D':
                    for (int n = cadena.length () -1; n >= 0; n--) {
                         char c = cadena.charAt (n); System.out.print (c); 
                        
                        }






                break;




            }   
                






        }while (salir == false);


    }
}
