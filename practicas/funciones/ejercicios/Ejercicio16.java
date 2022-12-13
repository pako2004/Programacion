package funciones.ejercicios;

import funciones.MathPako;

public class Ejercicio16 {
    public static void main(String[] args) {
        
        int numero = 1;

        while ( numero <= 99999){
            
            if (MathPako.esCapicua(numero) == true){

                System.out.println(numero);
                numero++;

            }else{
                numero++;
            }


        }


    }
}
