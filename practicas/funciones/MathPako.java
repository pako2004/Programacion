package funciones;

import javax.lang.model.element.ModuleElement.DirectiveVisitor;

public class MathPako {
    public static void main(String[] args) {
        
      

    }
     /**
      * Devuelve verdadero si el numero es capicuo
      * @param numero
      * @return
      */
    static boolean esCapicua (int numero){
        int num = numero;
        boolean resultado = false;
        int volteado = 0;
        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
          }
          if (volteado == num){

            resultado = true;

          }

        return resultado;

    }
    /**
     * Dice si el numero es primo o no
     * @param numero
     * @return
     */
    static boolean esPrimo (int numero){

        boolean resultado = true;

        if (numero == 0 || numero == 1 || numero == 4) {
          return false;
        }

        for (int x = 2; x < numero / 2; x++) {
          // Si es divisible por cualquiera de estos números, no
          // es primo
          if (numero % x == 0)
            return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;



        

    }

    /**
      * Devuelve siguiente primo
      * @param numero
      * @return
      */
    static int siguientePrimo(int numero){

      int menorPrimo = numero + 1;
      
      boolean primo = false;

      while(primo == false){
        
        if (esPrimo(menorPrimo) == true){

          primo = true;
        }else{ 
          
          menorPrimo++;
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

      int resultado = base;
      if (exponente == 0){
        resultado = 1;
      }else{  
       for (int i = 1; i <= exponente; i++){

        
        if (i == 1){

        }else{
        resultado = resultado * base;
        }
      }
    }
      return resultado;
    }
    /**
     * Dice cuantos disgitos tiene un numero
     * @param numero
     * @return
     */
    static int digitos(int numero){

      int digitos = 0;

      while (numero > 0){

        numero = numero/10;

        digitos++;

      }


      return digitos;

    }
    /**
     * VOleta el numero
     * @param numero
     * @return
     */
    static int voltea (int numero){

      int volteado = 0;
      while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
      }
      return volteado;
    }
    /**
     * Indica que numero esta en cierta posicion de un numero dado
     * @param numero
     * @param posicion
     * @return
     */
    static int digitoAt (int numero, int posicion){

      int digito = 0;
      int volteado = 0;
      int i = 0;
      int acum = 0;

      while (numero>0){

        volteado = (volteado * 10) + (numero % 10);
      numero /= 10;

    }
    
    do{

        i = (volteado % 10);
        volteado /= 10;
        acum++;

        if ( acum == posicion){
            digito = i;
        }

    }while ( volteado> 0);

      return digito;
    }
    /**
     * Dice donde se encuentra un digito dentro de un numero 
     * @param numero
     * @param digito
     * @return
     */
    static int posicionDigito (int numero, int digito){

      int posicion = 0;
      int acum = 0;
      int i = 0;
      int volteado = 0;
      boolean encontrado = false;
  
      volteado = voltea(numero);
    
    do{

        i = (volteado % 10);
        volteado /= 10;

        acum++;

        if ( i == digito){
            posicion = acum;
            encontrado = true;

        }
        if (volteado == 0){

          posicion = -1;

          encontrado = true;
        }
    }while ( encontrado == false);


      return posicion;

    }
    /**
     * QUitar n digitos por detras a un numero
     * @param numero
     * @param quitar
     * @return
     */
    static int quitaPorDetras (int numero, int quitar){

      int num = 0;
      int volteado = 0;
      int divisor = 10;
      divisor = MathPako.potencia(divisor, quitar);

      num = (numero /divisor);
      return num;

    }
    /**
     * QUitar n digitos por delante a un numero
     * @param numero
     * @param quitar
     * @return
     */
    static int quitaPorDelante (int numero, int quitar){

      int num = 0;
      int divisor = 10;
      int volteado = 0;
      divisor =  MathPako.potencia(divisor, quitar);
      numero = voltea(numero);


       numero = (numero / divisor);
      
      

      num = voltea(numero);
      
      return num;

    }
    /**
     * Quitar n digitos por detras
     * @param numero
     * @param digito
     * @return
     */
    static int pegaPorDetras (int numero, int digito){

        int resultado = MathPako.juntaNumeros(numero, digito);

      return resultado;

    }
    /**
     * Pega un numero a u numero ya dado por delante
     * @param numero
     * @param digito
     * @return
     */
    static int pegaPorDelante (int numero, int digito){

      numero = voltea(numero);

      int resultado = juntaNumeros(numero, digito);

      resultado = voltea(resultado);

      return resultado;
    }

    static int trozoDeNumero (int numero, int inicio, int cierre){
      int resultado = 0;

      numero = voltea(numero);

      while (inicio > 0){
        numero = (numero /10);
        inicio--;
      }

      numero = voltea(numero);

      while (cierre > 0){
        numero = (numero /10);
        cierre--;
      }

      resultado = numero;

      return resultado;
    }

    static int[] stringToInt(String num){
      char[] chars=num.toCharArray();
      int i=0;

      Boolean error=false;
      while(error==false&&i<=chars.length-1){
          if(chars[i]<48||chars[i]>57){
              error=true;
          }
          i++;
      }

      int[] temparray=new int[chars.length];

      if(error==false){
          for(int j=0; j<=temparray.length-1; j++){
              temparray[j]=chars[j]-48;
          }
      }
      else{
          System.out.println("Error, has introducido un carácter que no era un número.");
          for(int j=0; j<=temparray.length-1; j++){
              temparray[j]=0;
          }
      }
      
      return temparray;
  }

  static int juntaNumeros (int numero1, int numero2 ){
    
      int añade = numero1 * (potencia(10, digitos(numero2)));
      int resultado = añade +  numero2;
      
      return resultado;




  }

}
