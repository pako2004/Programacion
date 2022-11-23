package funciones;

import java.util.Scanner;


public class funciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        String cadena;
        
    System.out.println( "INICIO");

    /*for (int i = 0; i < 5; i++){

        System.out.println("HOLA");

    }*/


imprimir5Veces();

    }
    // FUNCIONES 

    static void imprimir5Veces(){

        for (int i = 0; i < 5; i++){

            //System.out.println("HOLA");
            imprimirAlgo("HOLA");

        }

    }

static void imprimirAlgo(String cadena){

    System.out.println("Imprimimos la cadena : "+ cadena );

}




    static int numeroMaximo(int num1, int num2)
    {
        int maximo = num1;

        if (num1 < num2){

            maximo = num2;

        }

        return maximo;


    }

static int suma(int a, int b){

    return a+b;
}


//sobrecargamos la funcion/metodo suma
static int suma(int a, int b, int c){

    return a + b +c;

}

//devuelve un valor entre 0 y 1
static double aleatorio(){

    return Math.random();
}
//devuelve un numero entre 0 y maximo
static double aletorio(int maximo){

    return Math.random()*maximo;

}
// devuelve un numero entre maximo y minimo
static double aleatorio(int maximo, int minimo){

        return Math.random()*(maximo-minimo) + minimo;

}

}
