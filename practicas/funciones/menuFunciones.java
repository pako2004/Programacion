package funciones;

import java.util.Scanner;

public class menuFunciones {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Scanner sc2 = new Scanner(System.in);

        boolean salir = false;

        do{

            System.out.println("----FUNCIONES----");
            System.out.println("A) Capicua");
            System.out.println("B) Primo");
            System.out.println("C) siguiente Primo ");
            System.out.println("D) Sacar potencia");
            System.out.println("E) Cuantos digitos");
            System.out.println("F) Voltea el numero");
            System.out.println("G) Digito en posicon n");
            System.out.println("H) Posicion de un digito");
            System.out.println("I) Quitar por detras");
            System.out.println("J) Quitar por adelante");
            System.out.println("K) Pegar por delante");
            System.out.println("L) pegar por detras");
            System.out.println("M) Trozo del numero");
            System.out.println("N) Juntar numeros ");

    
            String opcion = sc.nextLine().toUpperCase();

            int numero = 0;
            
            switch (opcion){

                case "A":

                    System.out.println("Introduce un numero");
                    numero = sc2.nextInt();

                    Boolean esCapicua = MathPako.esCapicua(numero);

                    if(esCapicua == true){

                        System.out.println("ES capicuo");   

                    }else{

                        System.out.println("No es capicuo");


                    }   

                    break;
                
                case "B":

                    System.out.println("Introduce un numero ");
                    numero = sc2.nextInt();
                    boolean esPrimo = MathPako.esPrimo(numero);

                    if (esPrimo){

                        System.out.println("El numero es primo");

                    }else{

                        System.out.println("El numero no es primo");

                    }
                    break;
                
                case "C":
                    System.out.println("Introduce un numero");
                    numero = sc2.nextInt();

                    numero = MathPako.siguientePrimo(numero);

                    System.out.println("El siguiente primo es: "+ numero);
                    break;

                case "D":

                    System.out.println("Introduce la base");
                    int base = sc2.nextInt();
                    System.out.println("Introduce el exponente");
                    int exponente = sc2.nextInt();

                    int resultado = MathPako.potencia(base, exponente);

                    System.out.println("El resultado es: "+resultado);

                    break;
            
                case "E":
                        System.out.println("Introduzca el numero");
                        numero = sc2.nextInt();

                        numero = MathPako.digitos(numero);

                        System.out.println("La cantidad de digitos es "+numero);

                break;

                case "F":

                    System.out.println("Introduzca el numero ");
                    numero = sc2.nextInt();

                    numero = MathPako.voltea(numero);

                    System.out.println("El numero volteado es "+numero);
                    break;
                
                case "G":

                    System.out.println("Introduzca un numero");
                    numero = sc2.nextInt();

                    System.out.println("Introduzca la posicion que desa conocer");
                    int posicion = sc2.nextInt();

                    resultado = MathPako.digitoAt(numero, posicion);

                    System.out.println("El digito en la posicion "+ posicion+ " es: "+resultado);

                break;
                
                case "H":

                    System.out.println("Introduzca un numero");
                    numero = sc2.nextInt();
                    System.out.println("INtroduzca el digito al que deseas conocer su posicion");
                    int digito = sc2.nextInt();

                    resultado = MathPako.posicionDigito(numero, digito);

                    System.out.println("La posicion del digito "+digito+" es "+resultado);

                break;

                    case "I":

                        System.out.println("Introduzca el numero al que le quieres quitar por detras");
                        numero = sc2.nextInt();

                        System.out.println("INtroduzca cuantos le quiere quitar");
                        int quitar = sc2.nextInt();

                        resultado = MathPako.quitaPorDetras(numero, quitar );

                        System.out.println("EL resultado es :"+resultado);

                    break;

                    case "J":

                        System.out.println("Introduzca el numero a lque le quiere quitar por delante");
                        numero = sc2.nextInt();
                        System.out.println("Introduzca el numero al que le quiere squitar por delante");
                        int quitaDelante = sc2.nextInt();  

                        resultado = MathPako.quitaPorDelante(numero, quitaDelante);
                        System.out.println("El resultado es "+resultado);
                    break;

                    case "K":

                        System.out.println("Introduzca el numero al que le quiera pegar por detras");
                        numero = sc2.nextInt();
                        System.out.println("Introduzca el numero que quiere agregar");
                        int numero2 = sc2.nextInt();

                        resultado = MathPako.pegaPorDetras(numero, numero2 );

                        System.out.println("El resultado es : "+resultado);

                    case "L":

                        System.out.println("Introduzca un numero");
                        numero = sc2.nextInt();
                        System.out.println("Introduzca el numero a añadir ");
                        int digito2 = sc2.nextInt();

                        resultado = MathPako.pegaPorDelante(numero, digito2);

                        System.out.println("El resultado es "+resultado);

                        break;

                    
                    case "M":

                    System.out.println("Introduzca un numero ");
                    numero = sc2.nextInt();
                    System.out.println("Introduzca la posicion inicial");
                    int inicial = sc2.nextInt();
                    System.out.println("Introduzca la posicion final");
                    int cierre = sc2.nextInt();

                    resultado = MathPako.trozoDeNumero(numero, inicial, cierre);

                    System.out.println("El numero recortado es"+resultado);

                    break;

                    case "N":

                    System.out.println("Introduzca el primer numero");
                    numero = sc2.nextInt();
                    System.out.println("Introduzca el segundo numero");
                    numero2 = sc2.nextInt();

                    resultado = MathPako.juntaNumeros(numero, numero2);

                    System.out.println("El numero juntado es: "+resultado);





            }   





            
            


        }while (salir == false);



    }
}
