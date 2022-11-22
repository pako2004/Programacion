package tema2.Refuerzo;

import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int precioEntradas = 0;
        int descuento = 10;
        int precioParejas = 11;
        int parejas = 0; 
        int solas = 0;

        System.out.println("Cuantas entradas quiere?");
        int entradas = sc.nextInt();

        System.out.println("Que dia de la semana es ");
        String dia = sc.next(); 

        dia.toUpperCase();
        

        System.out.println("Tiene tarjeta CineCampa? (s/n)");
        String tarjeta = sc.next();

        switch (dia)
        {
            default:

            precioEntradas = entradas * 8;
            break;

            case "MIERCOLES":

            precioEntradas = entradas * 5;
            break;

            case "JUEVES":


                
                parejas = entradas / 2;
                
                solas = entradas%2;

                precioEntradas = (parejas * 11)+(solas * 8);

                break;

            
            }

            int precioFinal = precioEntradas;

            if (tarjeta.equals("s"))
            {
                descuento = (precioEntradas * descuento)/100;
                precioFinal = precioFinal - descuento;
            }
            
            if (parejas > 0 )
            {
                System.out.println("Precio entrada de parejas = 11");
                System.out.printf("Entradas pareja: %d\n",parejas);

               
               
                if (solas > 0)
                {
                    System.out.println("Precio entrada suelta = 8");
                    System.out.printf("Entradas individuales %d\n",solas);
                }


            }
            
            System.out.printf("Total %dº\n",precioEntradas);

        }






    }

