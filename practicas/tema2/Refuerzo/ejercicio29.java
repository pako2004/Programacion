package tema2.Refuerzo;

import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args) {


        final double precioPalmera = 1.40;
        final double precioDonut = 1;
        final double precioPitufoAce = 1.20 ;
        final double precioPitufoTor = 1.60;
        final double precioCafe = 1.20;
        final double precioZumo = 1.50;

        double precioComida = 0;
        double precioBebida = 0;
        double total = 0;
        String tipoPitufo ="";


        Scanner sc = new Scanner(System.in);

        System.out.println("Que ha tomado para comer? palmera, donut o pitufo");

        String comida =sc.next();

        if (comida.equals("pitufo")) {

            System.out.println("Con aceite o tortilla?");
            tipoPitufo = sc.next();

            if (tipoPitufo.equals("aceite")) {
                
                precioComida = precioPitufoAce;

            } else {
                if (tipoPitufo.equals("tortilla"))
            {
                precioComida = precioPitufoTor;
            }

            }
        } else {
            
            if (comida.equals("donut")) {
                
                precioComida = precioDonut;


            } else {

                if (comida.equals("palmera"))
                {

                    precioComida = precioPalmera;


                }
                
            }

        }

        System.out.println("Que ha tomado de beber");

        String bebida = sc.next();

        if (bebida.equals("zumo")) {
            
            precioBebida = precioZumo;


        } else if (bebida.equals("cafe")){
            
            precioBebida = precioCafe;
            
        }

        total = precioBebida + precioComida;

System.out.println(comida + ((tipoPitufo.length() > 0) ? " " + tipoPitufo : " ") + ": " +precioComida);
System.out.println(bebida +": "+ precioBebida);
System.out.println("Total desayuno: "+total);





    }
    
}
