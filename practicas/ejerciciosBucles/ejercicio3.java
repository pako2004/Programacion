package ejerciciosBucles;

public class ejercicio3 {
    public static void main(String[] args) {
        
        
        int num1 = 0;
        int acum = 1;

        do{

           
            

            num1 = 5 *acum;

           System.out.println(num1);
            if (num1 / 5 == 0){

                System.out.println(acum);



            }
            acum++;





        }while( num1 < 100 );





    }
}
