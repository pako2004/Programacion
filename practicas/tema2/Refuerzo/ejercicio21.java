package tema2.Refuerzo;

import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual ha sido la nota del primer control?:");

        double nota1 = sc.nextDouble();

        System.out.println("Cual ha sido la nota del segundo control): ");

        double nota2 = sc.nextDouble();

        double acum = nota1 + nota2;

        double media = acum /2;

        if (media >= 5) {

            System.out.println("La media fue de"+media);


        } else {
         
                System.out.println("Cual ha sido el resultado de la recuperacion? (Apto / no apto) ");

                String resul = sc.next();
            
                resul = resul.toUpperCase();

                

                if (resul.equals("APTO")) {
                    
                    System.out.println("Tu nota de programacion fue 5");


                } else {
                    
                    System.out.println("Tu nota de programacion fue de 4.5");

                }
        }







    }


}
