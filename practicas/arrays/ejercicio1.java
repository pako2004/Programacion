package arrays;

import java.text.Normalizer;
import java.util.Scanner;

import javax.naming.directory.InitialDirContext;
import javax.swing.plaf.metal.MetalBorders.MenuItemBorder;
import javax.swing.text.Position;

public class ejercicio1 {
    
    public static void main(String[] args) {
        
    
    /*
     * crear array de nombres de 10 elementos
     * menu
     * 1- Limpiar array
     * 2- almacenar nombre en posicion
     * 3- imprimir / mostar array || [0]= pepe etc....
     * 4- borrar nombre en posicion
     * 5- llenar con "POsicion-x" todo el array
     */

    String[] nombre = new String[9];

    nombre[0] = "Luis";
    nombre[1] = "María";
    nombre[2] = "Carlos";
    nombre[3] = "Jose";
    nombre[4] = "Ismael";  
    nombre[5] = "Fatima";
    nombre[6] = "Paola";
    nombre[7] = "Angel";
    nombre[8] = "Anuel";
    nombre[9] = "Elver";

    boolean salir = false;

    do{
        
        int opcion =menu();

        switch (opcion){


            case 1: //LIMPIAR ARRAY
                nombre[] = limpiarArray(nombre[]); 
                break;
            case 2: //almacenar nombre en posicion
                    
            System.out.println("Que nombre desea insertar?");
            String name = sc.nextLine();
            System.out.println("Que posicion desea cambiar?");
            int posicion = sc.nextInt();

            nombre[posicion] = insertar(nombre,"Alejandro",7);

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }

          

    

    }while (salir == false);


    }
    static Scanner sc = new Scanner(System.in);
    static int menu(){
        System.out.println("---- Menú Array ----");
        System.out.println("1- Limpiar array");  
        System.out.println("2- almacenar nombre en posicion");
        System.out.println("3- imprimir / mostar array");
        System.out.println("4- borrar nombre en posicion");
        System.out.println("5- Llenasr con 'Posicion-x' ");
        System.out.println("6- Salir");
        System.out.println("----------------------------------");
        System.out.println("Ingrese una opcion");
        int opcion = sc.nextInt();
        return opcion;
    }

/**
 * BOrra todos los valores del array que se le pasa
 * @param tabla
 */
    static void limpiarArray(String[] tabla){
        for (int i = 0; i < tabla.length; i++){
            tabla[i]= null;
        }
    }

    static String insertar(String[] tabla,String nuevoNombre, int posicion){
        if (tabla.length < posicion && posicion >= 0){
            tabla[posicion] = nuevoNombre;
        }else {
            System.out.println("Posicion no valida, debe indicar un numero entero entre 0 y "+tabla.length);
        }
        return tabla[posicion];
    }

    static void imprimir(String[] tabla){
        int i = 0;
        for (String nombre : tabla){
            System.out.println("El nombre en la posicion "+ i+"es "+ nombre);
            i++;
        }
    }
}  
