package funciones;

public class MathPako {
    public static void main(String[] args) {
        


    }
     /**
      * Devuelve verdadero si el numero es capicuo
      * @param numero
      * @return
      */
    static boolean esCapicua (int numero){

        boolean resultado = false;
        int volteado = 0;
        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
          }
          if (volteado == numero){

            resultado = true;

          }

        return resultado;

    }
  
    static boolean esPrimo (int numero){

        boolean resultado = true;

        for (int i = 0; i <= numero; i++){

          if ( numero %  i == 0){

            resultado = false;
          }


        }


        return resultado;

    }

    /**
      * Devuelve primo
      * @param numero
      * @return
      */
    static int siguientePrimo(int numero){

      int menorPrimo = numero + 1;
      
      boolean primo = false;

      while(!primo){

        if (esPrimo(menorPrimo)){

          primo = true;

          menorPrimo++;

        }else{
        }
      }
      
      return menorPrimo;

    }


    /**
     * Realiza una potencia
     * @param base
     * @param exponente
     * @return
     */
    static int potencia(int base, int exponente){

      int resultado = 0;
      if (exponente == 0){
        resultado = 1;
      }else{  
       for (int i = 0; i <= exponente; i ++){

        resultado = resultado * base;


      }
    }
      return resultado;
    }

    static int digitos(int numero){

      int digitos = 0;

      while (numero > 0){

        numero = numero/10;

        digitos++;

      }


      return digitos;

    }

    static int voltea (int numero){

      int volteado = 0;
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
      return volteado;
    }

    static int digitoAt (int numero, int posicion){

      int num = 0;

      

      return num;
    }
}
