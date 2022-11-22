package tema1;


import java.util.Scanner;

public class examen3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Tiene trabajo?");
        System.out.println("1) SI");
        System.out.println("2) NO");




        int respuesta = sc.nextInt();


        //if de si la persona tiene trabajo

        if (respuesta == 1) {

            System.out.println("Tiene cuenta con nosotros?");
            System.out.println("1)SI");
            System.out.println("2) NO");

               int  res1 = sc.nextInt();


               if (res1 == 1 ) {

                System.out.println("Cumples con las condiciones");

                
               } else {
                if (res1 == 2 ) {
                    System.out.println("No tienes cuenta con nosotros por lo tanto no la puedes pedir");
                    
                  


                }
                    
                }
                
            } 
                // if de si la persona no tiene trabajo

                if (respuesta ==2 ) {

                    System.out.println("Tiene cuenta con nosotros?");
                    System.out.println("1)SI");
                    System.out.println("2) NO");
        
                       int  res1 = sc.nextInt();

                    if (res1 == 1) {

                        System.out.println("Tienes ahorrado el 20% de la hipoteca?");
                        System.out.println("1)SI");
                        System.out.println("2) NO");

                        int res2 = sc.nextInt();

                      if (res2 == 1) {

                        System.out.println("Felicidades, puedes solicitar la hipoteca");

                        
                      } else {

                            System.out.println("No puedes solicitar la hipoteca");
                        
                      }


                      //si la respuesta a la primera pregunta fue no
                    } else {

                        System.out.println("No puedes solicitar la hipoteca");


                        



                    }

               


                    
                }


            
        
            
        }








    }

