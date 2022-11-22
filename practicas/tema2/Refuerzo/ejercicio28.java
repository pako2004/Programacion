package tema2.Refuerzo;

import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Jugador 1 Elige piedra, papel o tijeras");

        String jugador1 = sc.next();

        System.out.println("Jugador 2 Elige piedra, papel o tijeras");

        int jugada = (int)(Math.random()*2);
        String jugador2 ="";
        
        switch (jugada)
        {

            case 0: 
                jugador2="papel";
                break;
            case 1:
                jugador2="piedra";
                break;
                
                case 2:
                jugador2="tijeras";
                break;

            
        }

        System.out.println(jugador2 + "SWITCH");

        if (jugador1.equals("piedra")  || jugador1.equals("papel")|| jugador1.equals("tijeras") || (jugador2.equals("piedra")  || jugador2.equals("papel")|| jugador2.equals("tijeras"))) {
            

            if (jugador1.equals("piedra") ) {

                if (jugador2.equals("piedra"))
                {
                    System.out.println("EMPATE");
                }
                else{
                    if (jugador2.equals("papel"))
                    {
                        System.out.println("Jugador 2 ganó");
                    }
                    else{
                        if (jugador2.equals("tijeras"))
                        {
                            System.out.println("Jugador 1");
                        }
                        
                    }

                }

                if (jugador1.equals("papel") ) {

                    if (jugador2.equals("piedra"))
                    {
                        System.out.println("Jugador 1 ganó");
                    }
                    else{
                        if (jugador2.equals("papel"))
                        {
                            System.out.println("EMPATE");
                        }
                        else{
                            if (jugador2.equals("tijeras"))
                            {
                                System.out.println("Jugador 2");
                            }
                            
                        }
    
                    }


            } 

            if (jugador1.equals("tijeras") ) {

                if (jugador2.equals("piedra"))
                {
                    System.out.println("Jugador 2 ganó");
                }
                else{
                    if (jugador2.equals("papel"))
                    {
                        System.out.println("Jugador 1 ganó");
                    }
                    else{
                        if (jugador2.equals("tijeras"))
                        {
                            System.out.println("EMPATE");
                        }
                        
                    }

                }


        } 


        } else {

            System.out.println("ERROR");
            
        }




    }
    
    }
}
