package funciones;

public class MathPako {
    public static void main(String[] args) {
        
      boolean escoco = esCapicua(161);

        if (escoco == true){

          System.out.println("si");

        }

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
  
    static boolean esPrimo (int numero){

        boolean resultado = true;

        for (int i = 2; i <= numero; i++){

          if ( (numero %  i) == 0){

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

    static int posicionDigito (int numero, int digito){

      int posicion = 0;
      int acum = 0;
      int i = 0;
      int volteado = 0;
      boolean encontrado = false;
  
      voltea(numero);
    
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

    static int quitaPorDetras (int numero){

      int num = 0;
      int volteado = 0;
      
      num = num + (numero /10);
      return num;

    }

    static int quitaPorDelante (int numero){

      int num = 0;

      int volteado = 0;
      voltea(numero);

       volteado = (volteado /10);
      numero = volteado;
      

      voltea(numero);
      num = numero;
      return num;

    }

    static int pegaPorDetras (int numero, int digito){

      

      int volteado = 0;
      voltea(numero);
      String sA = String.valueOf(digito);
      String sB = String.valueOf(volteado);

      String res = sA + sB;

      int resultado = Integer.parseInt(res); 
      voltea(resultado);
      


      return resultado;

    }

    static int pegaPorDelante (int numero, int digito){

      String sA = String.valueOf(digito);
      String sB = String.valueOf(numero);

      String res = sA + sB;

      int resultado = Integer.parseInt(res);



      return resultado;
    }

    static int trozoDeNumero (int numero, int inicio, int cierre){
      int resultado = 0;

      voltea(numero);

      while (inicio > 0){
        numero = (numero /10);
        inicio--;
      }

      voltea(numero);

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
    String sA = String.valueOf(numero1);
      String sB = String.valueOf(numero2);

      String res = sA + sB;

      int resultado = Integer.parseInt(res);



      return resultado;




  }

}
