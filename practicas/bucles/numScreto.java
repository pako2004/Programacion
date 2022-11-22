package bucles;


import java.util.Scanner;



public class numScreto {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int numero = (int) (Math.random()*(100 + 1));
        int usuario = 0;
        int intentos = 0;
        String partida = "si";
        int ganadas = 0;
        int acumIntentos = 0;
        int masRapida = 100;
        System.out.println("asdad  "+numero);


        while (partida.equals("si")){

        

        while (usuario != -1){

            intentos ++;

            System.out.println("Adivine el numero ");
            
            usuario = sc.nextInt();
            acumIntentos ++;
            if (usuario == numero){
                System.out.println("Felicidades has acertado");

                ganadas ++;

                usuario = -1;

            } else{

                if (usuario > numero){

                    System.out.println("Menor");

                } else{

                     System.out.println(" Mayor");

                }

            }

           /* if  (intentos >= 5 & numero != -1){

                System.out.println("Escribe -1 para rendirte");

                numero = sc.nextInt();
            }*/
        }

            masRapida = Math.min(masRapida, acumIntentos);

        System.out.println("Quieres jugar otra partida?(si/no)");

        partida = sc.next();

        if (partida.equals("no")){

            System.out.println("Numero partida ganadas: "+ ganadas);

            System.out.println("La partida mas rapida fue de: "+masRapida);

        } else {

            usuario = -2;

        }

        }



    }
    
}
