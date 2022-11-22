package bucles;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class tandaPenalties {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        //VARIABLES 

        int golesJugador = 0;
        int golesCPU = 0;
        String marcadorJugador = "-----";
        String marcadorCPU = "-----";
        boolean bucle = false;
        String movimientoJugador = "";
        String movimientoCPU = "";
        int random = 0; //variable para elegir el movimiento de la cpu
        int tandas = 0;
        boolean gol = false;
        int turnos = 0;


        
        System.out.println("Cual es tu nombre?");

        String jugador = sc.nextLine();

        
        do{

        System.out.println("EMPIEZA LA TANDA DE PENALTIES");
            // para cada turno tendremos: 


            //pintar resultado penalties

            System.out.println(jugador + marcadorJugador);
            System.out.println("CPU "+ marcadorCPU);



            //eleccion entre tirar o detener el jugador 1
           

                while (turnos > 0 || golesCPU == golesJugador){
                if (turnos == 0 || (turnos /2) == 0 ){
                System.out.println(jugador + "Tira i (Izquierda), d (Derecha), c (Centro)");

                movimientoJugador = sc.nextLine().toLowerCase();

                random = (int)(Math.random()*10);

                 if (random < 3){
                    movimientoCPU = "i";
                }else if (random > 3 && random <9){
                    movimientoCPU = "d";
                }else{
                    movimientoCPU = "c";
                }

                if (movimientoCPU == movimientoJugador){

                    System.out.println("-PARADA-");

                }

            }
                 }
            //le toca tirar

                //eleccion tiro
                //eleccion cpu

                //resultado tiro

            //le toca parar
                //eleccion portero
                //eleccion cpu tipo

                //resultado tiro

        //resultado final de quien gana






        }while (bucle ==false);

    
    }
}
