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
        boolean ganador = false;
        boolean empate = false;
        int turnos = 0;
        int falloPenal = 0;


        
        System.out.println("Cual es tu nombre?");

        String jugador = sc.nextLine();

        
        do{

        System.out.println("EMPIEZA LA TANDA DE PENALTIES");
            
            
            
            while (ganador == false && empate == false){
            // para cada turno tendremos: 


            //pintar resultado penalties

            System.out.println(jugador + " "+marcadorJugador);
            System.out.println("CPU "+ marcadorCPU);



             //eleccion entre tirar o detener el jugador 1
           

               
                if (turnos == 0 || (  turnos % 2 ) == 0   ){
                    System.out.println(jugador + " Tira i (Izquierda), d (Derecha), c (Centro)");

                    movimientoJugador = sc.nextLine().toLowerCase();

                    random = (int)(Math.random()*10);

                     if (random < 3){
                        movimientoCPU = "i";
                    }else if (random > 3 && random < 6){
                        movimientoCPU = "d";
                    }else{
                        movimientoCPU = "c";
                    }

                    falloPenal = (int)(Math.random()*10);

                    if (falloPenal < 3){

                        movimientoJugador = "Fallo";

                    }



                         if (movimientoCPU.equals(movimientoJugador)){
                        
                             System.out.println("-PARADA-");
                            marcadorJugador = marcadorJugador.replaceFirst("-", "O");

                    }else{

                        System.out.println("GOL");
                        marcadorJugador = marcadorJugador.replaceFirst("-", "X");
                        golesJugador += 1; 


                    }
                    
                
                    }else{

                        System.out.println(jugador + " Intenta parar i (Izquierda), d (Derecha), c (Centro)");

                        movimientoJugador = sc.nextLine().toLowerCase();

                        random = (int)(Math.random()*10);

                        if (random < 3){
                            movimientoCPU = "i";
                        }else if (random > 3 && random < 6){
                            movimientoCPU = "d";
                        }else{
                            movimientoCPU = "c";
                        }

                            if (movimientoCPU == movimientoJugador){

                                System.out.println("-PARADA-");
                                marcadorJugador = marcadorJugador.replaceFirst("-", "O");

                            }else{

                                System.out.println("GOL");
                                marcadorCPU = marcadorCPU.replaceFirst("-", "X");
                                golesCPU += 1; 


                            }

                    


                    }

            if (golesCPU == 5 && golesJugador == 5){

                System.out.println("EMPATE");
                
                
                empate = true;

            }else if( golesCPU == 5){

                System.out.println(" GANÓ LA CPU");

                ganador = true;
                

            }else if(golesJugador == 5){

                System.out.println(jugador + " GANÓ");
                ganador = true;

            }

            turnos +=1;
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


                 System.out.println("Quieres desempatar?");

                 


                 sc.nextLine();
        }while (bucle ==false);

    
    }
}
