package tema2;

import java.util.Scanner;

public class tarea4 {
    public static void main(String[] args) {
        
        double numPersonas = 0;
        double precioGasolina = 1.75;
        double gastoGasolina = 8; //por cada 100
        double precioAvio = 95;
        double precioConEquipaje = 115;
        double precioTren = 80;
        String tipoViaje ="";
        double precioTotal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos van a viajar?");

        numPersonas = sc.nextDouble();

        System.out.println("En que van a viajar?");

        tipoViaje = sc.next();

        tipoViaje.toLowerCase();


        switch (tipoViaje){

            case "avion": /*****************************************/
            System.out.println("LLevan equipaje?");

            String res1 = sc.next();

            if (res1.equals("si")) {

                precioTotal = precioConEquipaje * numPersonas;

               
                
            } else {
                
                precioTotal = precioAvio * numPersonas;
                
            }
            break;

            case "tren": /****************************/

            if (numPersonas == 4) {

                precioTotal = precioTren * numPersonas;

                precioTotal =  precioTotal - ((precioTotal * 25)/100) ;

             

                
            } else if (numPersonas == 3) {

                precioTotal = precioTren * numPersonas;

                precioTotal =  precioTotal - ((precioTotal * 10)/100) ;


                
            } else if (numPersonas < 3) {

                precioTotal = precioTren * numPersonas;

            } {


                
            }
            break;
            
            case "coche":


            gastoGasolina = 8 * 5.5;
            precioGasolina = 1.75 * gastoGasolina;

            precioTotal = precioGasolina;
            
            System.out.println("La gasolina necesaria es de "+(int)gastoGasolina+" litros");
           break;



        }

        System.out.println("El coste de su viaje es de "+precioTotal);


    }
    
}
