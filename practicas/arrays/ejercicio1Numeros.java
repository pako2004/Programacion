package arrays;


import java.lang.reflect.Array;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;

import javax.management.openmbean.OpenType;
import javax.naming.directory.InitialDirContext;
import javax.swing.plaf.metal.MetalBorders.MenuItemBorder;
import javax.swing.text.Position;



public class ejercicio1Numeros {
 


    
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
    int[] copiaNumeros = null;
    int[] numeros = new int[10];
    
    numeros[0] = 0;
    numeros[1] = 0;
    numeros[2] = 0;
    numeros[3] = 0;
    numeros[4] = 0;
    numeros[5] = 0;
    numeros[6] = 0;
    numeros[7] = 0;
    numeros[8] = 0;
    numeros[9] = 0;

    boolean salir = false;

    do{
        
        int opcion =menu();

        switch (opcion){

            case 0:
                salir = true;
                break;
            case 1: //LIMPIAR ARRAY
                limpiarArray(numeros); 
                break;
            case 2: //almacenar nombre en posicion
                    
            System.out.println("Que nombre desea insertar?");
            String name = sc1.nextLine();
            System.out.println("Que posicion desea cambiar?");
            int posicion = sc.nextInt();

            numeros[posicion] = insertar(numeros,0,7);

                break;
            case 3:
                imprimir(numeros);
                break;
            case 4:
                borrar(numeros);
                break;
            case 5:
            llenar(numeros);
                break;
            case 6:
                llenarAleatorios(numeros);
                break;

            case 7:
                posicion = buscar(numeros);
                System.out.println("El numero esta en la posicion"+posicion);
                break;
            case 8:
                    Arrays.sort(numeros);
                break;
            case 9:
                int posicionBuscada = 0;
                buscarEnTablaOrdenada(numeros);

                break;
            case 10:
                desordernar(numeros);
                break;
            case 11: 
                copiaNumeros = copiarArray(numeros);
                imprimir(copiaNumeros);
                break;
            case 12:
                imprimir(copiaNumeros);
                break;
            case 13: //mientras mas me lo mamas mas me crece
                
                numeros = insertarArrayCompleto(numeros);
                break;
            case 14:
                numeros = borrarUltimoElemento(numeros);
                break;
            case 15: 
                numeros = insertarEnPosicionArrayCompleto(numeros);
                break;
            }       
            

          

    

    }while (salir == false);


    }
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
    static int menu(){
        System.out.println("---- Menú Array ----");
        System.out.println("0 salir");
        System.out.println("1- Limpiar array");  
        System.out.println("2- almacenar numero en posicion");
        System.out.println("3- imprimir / mostar array");
        System.out.println("4- borrar numero en posicion");
        System.out.println("5- Llenasr con 'Posicion-x' ");
        System.out.println("6 aleatorio- ");
        System.out.println("7 buscar");
        System.out.println("8 ordenar");
        System.out.println("9 organizar tabla");
        System.out.println("10 Desordenar");
        System.out.println("11 copiar array");
        System.out.println("12 Imprmir array copiado");
        System.out.println("----------------------------------");
        System.out.println("13 insertare en array completo no ordenado");
        System.out.println("14 Quitar ultimo elemento");
        System.out.println("15 insterta en array completo");
        System.out.println("______________________________________________");
        System.out.println("Ingrese una opcion");
        int opcion = sc.nextInt();
        return opcion;
    }

/**
 * BOrra todos los valores del array que se le pasa
 * @param tabla
 */
    static void limpiarArray(int[] tabla){
        for (int i = 0; i < tabla.length; i++){
            tabla[i]= 0;
        }
    }

    static int insertar(int[] tabla,int nuevoNumero, int posicion){
        if (tabla.length < posicion && posicion >= 0){
            tabla[posicion] = nuevoNumero;
        }else {
            System.out.println("Posicion no valida, debe indicar un numero entero entre 0 y "+tabla.length);
        }
        return tabla[posicion];
    }

    static void imprimir(int[] tabla){
        int i = 0;
        for (int numero : tabla){
            System.out.print (numero+", ");
            
            i++;
        }
        System.out.println();
        /* mostrar un arrays
         * 
         * Sout(Arrays.toString(tabla))
         */
    }
    /**
     * borra de un aray una posicion en concreto
     * @param tabla
     */
    static void borrar(int[] tabla){

        System.out.println("Que posicion quieres borrar?");
        int posicion = sc.nextInt();

        tabla[posicion] = 0;
        System.out.println("Numero borrado correctamente");

        if (tabla.length < posicion && posicion < 0){
            tabla[posicion] = 0;
            System.out.println("Numero borrado correctamente");
        }else{
            System.out.println("Error - Posicion Fuera de rango");
        }
    }
    
    static void llenar(int[] tabla){
        
        for(int i = 0; i < tabla.length; i++){
            tabla[i] = 0;
        }

        /*otra forma de llenar
         * Arrays.fill(tabla,"NOMBRE");
         */
        /*LLENAR INTERVALOS DE POSICIONES
         * 
         *  Arrays.fill(tabla,5,6,"PAKO")
         * 
         */
    }
    static void llenarAleatorios(int[] tabla){
        
        for(int i = 0; i < tabla.length; i++){
            tabla[i] = (int)(Math.random()*100);

        }

    }

    static int buscar(int[] tabla){

        int resultado = 1;

        System.out.println("Que valor quieres buscar");
        int numeroBuscado =sc.nextInt();

        int indiceBusqueda = 0;

        while (resultado == -1 && indiceBusqueda < tabla.length){
            int numeroEnPosicion = tabla[indiceBusqueda];
            if (numeroBuscado == numeroEnPosicion){
                resultado = indiceBusqueda;

            }
        }

        return resultado;
    }

    static int buscarEnTablaOrdenada(int[] tabla){
        
        System.out.println("Que numero quoieres buscar");

        int valorBuscado = sc.nextInt();

        int resultado =  Arrays.binarySearch(tabla, valorBuscado);

        return resultado;
    

    }

    static void intercambiar(int[]tabla){



    }

    static void desordernar(int[]tabla){

        int segundoPos;
        
        for (int i = tabla.length - 1; i > 0; i--)
        {
            int random = (int)(Math.random()*tabla.length-1);
            segundoPos = random;
            
            int[] nuevaPos = new int[1];
            
            nuevaPos[0] = tabla[segundoPos];
            tabla[segundoPos] = tabla[i];
            tabla[i] = nuevaPos[0];

        }
    }

    static int[] copiarArray(int[] original){
        /*forma manual 
        copia = new int[original.length];

        int indice = 0;
        for (int i : original)
        {   

            copia[indice]= i;
            indice++;
        }

        return copia;*/

        int[] copia = Arrays.copyOf(original, original.length);
        return copia;

    }
    /**
     * Crear un nuevo array con una posicion mas y insertar un nuevo valor
     * @param original
     * @return
     */
    static int[] insertarArrayCompleto(int[] original){

        int[] copia = Arrays.copyOf(original, original.length+1);

        System.out.println("Introduce el nuevo valor");
        int last = sc.nextInt();

        copia[copia.length-1] = last;

        System.out.println("copia lenght = "+copia.length);

        return copia;
        

    }
    static int[] borrarUltimoElemento(int[] tabla){

        int[] tabla2 = null; 
        if (tabla.length == 0){
            System.out.println("La cadena esta vacia, no se puede borrar");   
        }else{
            tabla2 = Arrays.copyOf(tabla, tabla.length-1);
        }
            

        return tabla2;
    }
    static int[] insertarEnPosicionArrayCompleto(int[] tabla){

        
        int[] copia = new int[tabla.length+1];;
        int aux = 0;  //otro contador que no se va a actualizar cuando llegue a la posicion indicada  
        System.out.println("Indique el valor que quiere insertar");
        int val = sc.nextInt();
        System.out.println("Indique la posicion");
        int pos = sc.nextInt();
        if (pos <= tabla.length){
            for (int i = 0; i <= copia.length-1; i++){
                  
                
                if (i == (pos-1) ){
                copia[i] = val;

                }else{
                    copia[i] = tabla[aux];
                    aux++;
                }
                
            }
            
        }else{
            System.out.println("La posicion dada no existe en el array");
        }
          

        System.out.printf("Actualizacion array =  ");
        imprimir(copia);
            return copia;
    }


 
}