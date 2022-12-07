package funciones.ejercicios;



public class funcionesRecursivas {
    
    // Ejercicio 1- Suma numeros naturales

    static int suma(int numero){

        int resultado = numero;

        if (numero == 1){//caso base

            return resultado;

        }else{ //case recursivo

            return numero + (suma(numero - 1));
        }
    }

    static int factorial (int numero){

        int resultado = 0;

        if (numero == 1){

            return numero;

        }else{

            
            return numero * factorial(numero-1);
        }


        
    }

static int figura(int largo){


    if (largo == 1){

        System.out.print("*");
        System.out.println("");
        return largo;    

    }else{  


        System.out.print("*");
        
        return largo;
        /*for (int i = 0; i <= largo-1; i++){

            System.out.print("*");*/

        }
        

}
     




    public static void main(String[] args) {

        int numero = 4;

        System.out.println(figura(numero));
        
    }



}
