package bucles;

import java.util.Scanner;

public class bucles_Estadisticas {
    public static void main(String[] args) {
        
        int edad;
        int sumEdades = 0 ;
        int alumnos = 0 ;
        int mayores = 0;
        double media; 
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una edad (-1 para salir)");
        edad = sc.nextInt();


        while (edad != -1){

            if (edad != -1){

                sumEdades += edad;

            }

            if (edad != -1){

                alumnos ++;


            }

            if (edad != -1){
            
                if (edad >= 18 ){

                    mayores = mayores +1;


                }

           



            }


            System.out.println("Introduzca una edad (-1 para salir)");
        edad = sc.nextInt();

                






        }
        media = (double)sumEdades / (double)alumnos;

                System.out.println("La cantidad de alumnos es: "+alumnos);
                System.out.println("La suma de las edades es de: "+sumEdades);
                System.out.println("La cantidad de alumnos mayores de edad es de: "+mayores);
                System.out.println("La media es de : "+media);



    }
    
}
