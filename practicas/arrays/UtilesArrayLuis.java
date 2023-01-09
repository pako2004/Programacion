package arrays;

import java.util.Arrays;
import java.util.Scanner;



public class UtilesArrayLuis {
    
static Scanner sc = new Scanner(System.in);

    /**
     * Toma como parametra un array y devuelve boolean
     * @param tabla
     * @return
     */
    public static  boolean esNulo(int[] tabla){

        boolean nulo = false;

        if(tabla == null){
            System.out.println("Es nulo");
            nulo = true;
        }else{
            System.out.println("No es nulo");
        }
        return nulo;
    }

    /**
     * Deja vacio un array
     * @return
     */
    public static int[] limpiar(){

        int[] copia = null;
        return copia;
    }
    /**
     * Le da mas espacios al array
     * @param tabla
     * @param numElem
     * @return
     */
    public static int[] rellenar(int[] tabla, int numElem){

        int[] newTabla = new int[numElem];
        Arrays.fill(newTabla, 0);
        return newTabla;
    }
    /**
     * Aumenta los espacios de un array y les coloca un valor 
     * @param tabla
     * @param numElem
     * @param valor
     * @return
     */
    public static int[] rellenar(int[] tabla, int numElem, int valor){

        int[] newTabla = new int[numElem];
        if (esNulo(tabla)){

        System.out.println("El array es Nulo, ingrese un array con valores");

        for (int i = 0; i < newTabla.length;i++){

            newTabla[i] = valor;
        }
        }else{
            for (int i = 0; i < newTabla.length;i++){

                newTabla[i] = valor;}
    }
        return newTabla;
    }

/**
 * toma como parametro un array y el valor a insertar (El array se me genra con una posicion menos)
 * @param tabla
 * @param valor
 * @return
 */
    public static int[] insertarAlFinal(int[] tabla, int valor){

        int[] newTabla = Arrays.copyOfRange(tabla, 1, tabla.length+1);

        newTabla[newTabla.length-1] = valor;

        return newTabla;


    }
    /**
     * Toma como valoras una array y un numero
     * @param tabla
     * @param valor
     * @return
     */
    public static int[] insertaAlInicio(int[] tabla, int valor){

        int acum = 0;
        int[] newTabla = new int[tabla.length+1];

        for (int i = 0; i < newTabla.length; i++){

            if (i == 0){

                newTabla[i] = valor;

            }else{

                newTabla[i] = tabla[acum];
                acum++;

            }

        }

        return newTabla;
    }

    public static int[] insertarEnPosicion(int[] tabla, int pos, int valor){

        int[] newTabla = new int[tabla.length+1];

        for (int i = 0; i < pos; i++){

            newTabla[i] = tabla[i];

        }

        for (int i = pos; i < tabla.length; i++){

            newTabla[i+1] = tabla[i];
        }

        return newTabla;
    }   

    public static int[] insertarOrdeando(int[] tabla, int pos, int valor){

        int posicionInsercion = 0;
        boolean encontrado =false;
        while(posicionInsercion<=tabla.length && !encontrado){

            if(tabla[posicionInsercion]< valor){

                posicionInsercion++;

            }else{


                encontrado = true;
            }

        }
        return insertarEnPosicion(tabla,posicionInsercion,valor);
    }

    public static int[] eliminarUltimo(int[]tabla){

        int[] newTabla = Arrays.copyOfRange(tabla, 0, tabla.length-1);

        return newTabla;

    }

    public static int[] eliminarPrimero(int[] tabla){

        int[] newTabla = Arrays.copyOfRange(tabla, 1, tabla.length);

        return newTabla;

    }

    public static int[] eliminar(int[]tabla, int elem){

         int posicionElem = buscar(tabla, elem);

         if (posicionElem > 0 ){
            eliminarPosicion(tabla, posicionElem);
         }

        return tabla;
        
    }

    public static int buscar (int[] tabla, int valor){

        boolean encontrado = false;
        int i = 0;
        int posicionElem = -1;
        while (i < tabla.length && !encontrado){

            if (tabla[i] == valor){
                encontrado = true;
                posicionElem = i;
            }else{
                i++;
            }
            
        }
        return posicionElem;
    }

    public static int[] eliminarPosicion(int[] tabla, int pos){

        int[] primeraParte = Arrays.copyOfRange(tabla,  0, pos);

        primeraParte = eliminarUltimo(primeraParte);

        int[] segundaParte = Arrays.copyOfRange(tabla, pos+1, tabla.length );

        int[] tablaFinal = new int[tabla.length-1];

        System.arraycopy(primeraParte, 0, tablaFinal, 0, tabla.length-1);
        System.arraycopy(segundaParte, 0, tablaFinal, primeraParte.length-1, segundaParte.length-1);

        return tablaFinal;
        /*
         * 
         */

        /*
         * arg1 -> array origen
         * arg2 -> posicion desde la que empiezo a leer
         * arg3 -> array destino
         * arg4 -> posicion desde la que voy a insertar en el array destino
         * arg5 -> numero de elementos que voy a copiar del origen al destino
         */

        //System.arraycopy(arg1, arg2 ,arg3 , arg4, arg5)


    }

    public static int[] ordenar(int[]tabla){

         Arrays.sort(tabla);

         return tabla;
    }

    public static void desordenar(int[] tabla){
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

    public static void imprimir(int[] tabla){
        System.out.println(Arrays.toString(tabla));
    }

    public static int[] invertir(int[] tabla){

        int[] invertido = new int[tabla.length];

        for (int i = 0; i < tabla.length/2;i++){

            int numero = invertido[i];
            invertido[i] = tabla[tabla.length-1-i];
            invertido[tabla.length-1-i] = numero;
            

            /*
             * sin crear otro array 
        for (int i = 0; i < tabla.length/2;i++){

            int numero = tabla[i];
            tabla[i] = tabla[tabla.length-1-i];
            tabla[tabla.length-1-i] = numero;
            

        }
             */
        }
        return invertido;
    }

    public static boolean estaOrdenado(int[]tabla){

        boolean ordenado = true;

        int[] copia = Arrays.copyOf(tabla, tabla.length);

        copia = ordenar(copia);

        return  sonIguales(tabla, copia);

    }

    public static boolean sonIguales(int[]tabla,int[]tabla2){

        if(tabla.length == tabla2.length){
            int i = 0;
            Boolean iguales = true;
            while(i < tabla.length && iguales){
                if (tabla[i] != tabla2[i]){
                    iguales = false;
                }else{
                    i++;
                }
            }
        }else{
            return false;
        }
        return false;
    }

    public static int[] partirPor(int[] array, int posicionInicial, int posicionCorte){

        if(posicionInicial < posicionCorte && posicionInicial < array.length-1){
            //creo el nuevo array que tiene de tamaño la posicion final - posicion inicila+1 para incluirlo
            int[] nuevo = new int[posicionCorte-posicionInicial+1];
            int indiceNuevo = 0;
            for(int i = posicionInicial; i <= posicionCorte; i++){
                nuevo[indiceNuevo] =array[i];
                indiceNuevo++; 
            }
            return nuevo;    
        }else{
            return array;
        }
        
    }


}
