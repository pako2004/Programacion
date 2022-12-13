package arrays;

public class arrays {
    public static void main(String[] args) {

        //declarar edades; array de 5 elementos

        int[] edades = new int[5];

        //declarar nombres = array de string de 5 elementos

        String[] nombres = new String[5];

        // formas de inicializar valores de arrats

        int[] edades2 = {1,10,3,5,8,13};
        System.out.println("EDADES2: La posicion 2 tiene el valor: "+edades2[2]);

        //dar un vlaor en concreto a una posicion especifica

        edades2[0] = 19;   

        //Poner a todas las posiciones del array edades vlaor 18

        for (int i = 0; i < edades.length  ; i++){

            edades[i]=18;


        }
        System.out.println(edades[0]);

        /*for (int i = 0; i < edades.length  ; i++){ || RECORRER UN ARRAY  

            System.out.println("La posicion "+i+ " tiene el valor "+edades[i]);
            System.out.println("La posicion "+i+ " tiene el valor"+ nombres[i]);
            System.out.println("-------");
        } */ 

        int[] e;
        int[] d;
        e = new int[5];
        for (int i = 0; 1 < e.length;i++){
        e[i] = 5;

    }

    d = e;
    System.out.println("Array d, en la posicion 4 es: "+d[4]);
    d[4] = 10;    

    System.out.println("array d en la posicion 4 "+d[4]);
    d[4]=10;
    System.out.println("Array e en la posicion 4 "+e[4]);
    System.out.println();
    }   
}