package tema2.Refuerzo;


import java.util.Scanner;



public class ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("EScriba su dia de nacimiento");

        int dia = sc.nextInt();


        System.out.println("Escriba su mes de nacimiento ");

          //  int mes = sc.nextInt();
        String mes = sc.next();
        
       mes = mes.toUpperCase();

        String horoscopo;
        
        // 21: 3  22:4 23:6 24:4 19:1

        switch (mes)
    {
        case "ENERO": 

            if (dia < 20) {
                System.out.println("CAPRICORNIO");
                horoscopo = "Capricornio";
            } else {
                System.out.println("Acuario");
            }   horoscopo = "Acuario;";
            break;
            
            case "FEBRERO": 

            if (dia < 20) {
                System.out.println("ACUARIO");
                horoscopo = "ACUARIO";
            } else {
                System.out.println("PISCIS");
            }   horoscopo = "PISCIS";
            break;


            case "MARZO": 

            if (dia <= 20) {
                System.out.println("PISCIS");
                horoscopo = "PISCIS";
            } else {
                System.out.println("ARIES");
            }   horoscopo = "ARIES;";
            break;

            case "ENERO": 

            if (dia < 20) {
                System.out.println("CAPRICORNIO");
                horoscopo = "Capricornio";
            } else {
                System.out.println("Acuario");
            }   horoscopo = "Acuario;";
            break;



    }


    }
}
