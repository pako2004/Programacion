package math;

public class ejercicio3Math {
    
    public static void main(String[] args) {
        
       int altura = 6 ;
       int largo = 2342;


       largo = (largo/10);

       System.out.println(largo);






        // Triangulo    
       /*for (int i = 1; i <= altura; i++){

        for (int j = 1; j <= altura-i; j++ ){

            System.out.print(" ");


        }

        for (int a = 1; a <= (i*2)-1; a++){

            System.out.print("*");
        }

        System.out.println("");


       }*/


         
       for (int i = 1; i <= altura; i++){

        for (int j = 1; j <= largo; j++){

            if (i == 1 || i == altura){
                System.out.print("*");
            }else if (j == largo  || j == 1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }

       }
       System.out.println("");


         }*/
    }
}
