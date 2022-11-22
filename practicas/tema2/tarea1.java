package tema2;

import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class tarea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* La aplicación solicitará el aforo máximo del local,
         * l precio de las entradas y el numero de entradas vendidas.l precio de las entradas y el numero de entradas vendidas.
         * Hay que tener en cuenta que si el número de entradas
         * vendidas no supera el 20% del aforo del local,el concierto se cancela.
         * Si el número de entradas vendidas no supera el 50% del aforo, se realiza una rebaja del 25% del precio de la entrada
         * 
         */


         // establezco todas las variables
        double aforoMax = 0;
        double precioEntrada = 0;
        double numeroVendidas = 0;
        double porcentaje20 = 0;
        double porcentaje50 = 0;
        double rebaja25 = 0;
        double dineroRecau = 0;

        
//********************************************************/


System.out.println("Introduzca el aforo Maximo del local:");

aforoMax = sc.nextDouble();

System.out.println("Introduzca el precio de las entradas:");

precioEntrada =sc.nextDouble();

System.out.println("Introduzca el numero de entradas vendidas:");

numeroVendidas = sc.nextDouble();

porcentaje20 = (aforoMax *20)/100;
        porcentaje50 = (aforoMax *50)/100;
        rebaja25 = (precioEntrada *25)/100;

        // Hago la condicion inicial que me dice si el concierto se hace o no


            if (porcentaje20 > numeroVendidas) {

                System.out.println("El conierto se cancela");
                
            } else 
              {// si el concierto cumple con la condicion inicial
                if (porcentaje20 < numeroVendidas){


                    if (porcentaje50 > numeroVendidas){

                    

                    precioEntrada = precioEntrada - rebaja25;

                    dineroRecau = precioEntrada * numeroVendidas;

                    System.out.println("El dinero recaudado es de: "+dineroRecau);

                    //si las ventas superaron al 50%

                    }else  if (porcentaje50 < numeroVendidas){


                        dineroRecau = precioEntrada * numeroVendidas;

                    System.out.println("El dinero recaudado es de: "+dineroRecau);

                    }

                }

                }
                    


                }
                
                


            }

          



    
    

