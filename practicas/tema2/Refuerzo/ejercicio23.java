package tema2.Refuerzo;

import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
        

        // sc.nexLine(); limpia el buffer
        float porcentajeiva = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la base imponible: ");

            float base = sc.nextFloat();

            System.out.println("Introduzca el tipo de IVA(general, reducido o superreducido)");

            String iva = sc.next();

            String aaa = iva.toUpperCase();

            switch (aaa)
            {
                case "GENERAL": 
                

                porcentajeiva = (base * 21)/100;
                
                iva = "21%";
                

                break;
                case "REDUCIDO":

                porcentajeiva = (base * 10)/100;
                iva = "10%";



                break;
                case "SUPERREDUCIDO":

                iva  = "4%";

                porcentajeiva = (base * 4)/100;
                break;

                
            }
            float precioFinal = 0;
            float precioIVA = base + porcentajeiva;
            
            System.out.println("Introduce codigo de promocion(nopro, meno5, mitad, 5porc");

            String cod  = sc.next();

            cod.toLowerCase();

            int descuento = 1;

            switch (cod)
            {
                case "nopro":

                descuento = 0;

                break;

                case "mitad":

                precioFinal = precioIVA / 2;

                break;

                case "meno5":

                    precioFinal = precioIVA - 5;

                case "5porc": 

                    precioFinal = (precioIVA * 5)/100;
                


            }


                System.out.printf("base Imponible  \t%2.f\n", base);
                
                System.out.printf("IVA (%s)  \t%.2f\n", iva,porcentajeiva );

                System.out.printf("Precio con IVA  \t%.2f\n",precioIVA);

               if (descuento == 0 ) {
                



               } else {
                
                System.out.printf("Codigo prom (%s) \t%\n",cod,precioFinal);

                System.out.printf("TOTAL  \t%.2f\n",precioFinal);

               }




            /*System.out.println("INtroduzca el codigo promocional");

            String codigo = sc.nextLine();

            codigo.toLowerCase();

            switch (codigo)
            {
                case "mitad":

                base = 



            } */







    }
}
