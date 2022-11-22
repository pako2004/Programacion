package bucles.ejercicios;


import java.util.Scanner;


public class conanElBarbaro_LuisRodriguez {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
      
        //Bucle juego
        //  Bucle partida
        //      generar personajes
        //      bucle pelea individual
        //          ataque conan
        //          ataque zombi


        // Variables

        int cantidadZombies= 0;
        boolean finTurno = false;
        int numZombie = 0;
        double probCritico = 0;
        double probContra = 0;
        
        // ---- vidas ----//
        
        int vidasConan = 4;
        final int vidasZombi = 1;

        // --- armas conan ---//
        int armaConan = 0;
        int ataqueConan = 0;
        int ataqueZombi = 0;
        int defensaMaxConan = 0;
        int ataqueMaxConan = 0;
        int defensaConan = 0;
        int defensaZombi = 0;

        // ---- bucle ----//

        boolean salir = false;

        do{
            // generacion personajes //
            cantidadZombies =  5 + (int)(Math.random()*5);

            
        
            System.out.println("Seleccione un arma para Conan");
            System.out.println("1) Espada de dos Manos, Ataque 60 y Defensa 40");
            System.out.println("2) Hacha, Ataque 70 y Defensa 30");
            System.out.println("3) Espada Corta y Escudo, Ataque 30 y Defensa 70");

            armaConan = sc.nextInt();
            
            switch (armaConan){

                case 1: 
                    ataqueMaxConan = 60;
                    defensaMaxConan = 40;
                    break;

                case 2: 
                    ataqueMaxConan = 70;
                    defensaMaxConan = 30;
                    break;

                case 3:
                    ataqueMaxConan = 30;
                    defensaMaxConan = 70;
                    break;


            }

            for (numZombie = 1; numZombie <= cantidadZombies; numZombie++){ 


                defensaConan = (int)(Math.random()*defensaMaxConan);
                
                defensaZombi = (int)(Math.random()*70);

                finTurno = false;

                while (finTurno == false){

                  

                        ataqueConan = (int)(Math.random()*ataqueMaxConan);
                        ataqueZombi = (int)(Math.random()*50);

                          // Probabilidad de un golpe critico

                    double random = Math.random(); 
                    
                    if (random < 0.1){
                        ataqueConan = ataqueConan * 2;
                    

                        System.out.println("Conan - ataca   /GOLPE CRITICO/-"+ataqueConan);
                        System.out.println("zombie" + numZombie + " - Defiende -"+defensaZombi );
                        System.out.println();

                        defensaZombi -= ataqueConan;
                    }else{
                        System.out.println("Conan - ataca -"+ataqueConan);
                        System.out.println("zombie" + numZombie + " - Defiende -"+defensaZombi );
                        System.out.println();

                        defensaZombi -= ataqueConan;
                    }

                        if (ataqueConan <= 5){
                            
                            System.out.println("Conan la manqueó, se autolesiona");

                            vidasConan -= 1;
                            System.out.println("Conan pierde una vida, le quedan "+ vidasConan);
                            System.out.println();
                            defensaConan = (int)(Math.random()*defensaMaxConan);

                        }


                        if (defensaZombi <= 0){
                            System.out.println("zombie"+numZombie + " Ha muerto");
                            System.out.println("------------------------------------");

                            finTurno = true;
                        
                        
                        
                        }else{  // Probabilidad de esquivar y contraatacar

                         random = Math.random();
                         
                         if (random <= 0.2){

                            System.out.println("zombie"+numZombie + " ataca - "+ataqueZombi);

                            System.out.println("Conan logra esquivar");

                             probContra = Math.random();

                         }else if (random > 0.2 && probContra < 0.3){

                            System.out.println("zombie"+numZombie + " ataca - "+ataqueZombi);

                            ataqueConan = (int)(Math.random()*ataqueMaxConan);

                            random = Math.random();

                            if (random < 0.2){
                                ataqueConan = ataqueConan * 5;  //probabilidad de golpe critico
                            }

                            System.out.println("Conan logra esquivar y contraataca -"+ ataqueConan);

                            defensaZombi -= ataqueConan;

                            if (defensaZombi <= 0){
                                System.out.println("zombie"+numZombie + " Ha muerto");
                                System.out.println("------------------------------------");
    
                                finTurno = true;
                            
                            
                            
                            }



                         }else{


                        System.out.println("zombie"+numZombie + " ataca - "+ataqueZombi);

                        System.out.println("Conan - defiende -"+defensaConan);
                        System.out.println("");

                        defensaConan -= ataqueZombi;
                         }

                        if (defensaConan <= 0){
                            System.out.println("Conan Ha muerto");

                            vidasConan -= 1; 

                            System.out.println("A conan le quedan "+vidasConan+ " vidas");

                            System.out.println("");

                              
                        }
                    }

                        if (vidasConan == 0){

                            System.out.println("GAME OVER");
                            System.out.println();


                            finTurno = true;

                        }

                       

                        }
                        if (vidasConan == 0){

                            numZombie = cantidadZombies;
                    }

                    if (numZombie == cantidadZombies && defensaZombi <= 0){

                        System.out.println("*************************");
                        System.out.println("        ENHORABUENA     ");
                        System.out.println("**** TESORO CONSEGUIDO ****");
                        System.out.println("*************************");
                        System.out.println();


                    }

            }
            
            // salir del juego  //
            sc.nextLine();
            System.out.println("Otra partida? ((s) para continuar otro para salir");

            String bucle = sc.nextLine().toLowerCase();

            switch (bucle){

                case "s":
                cantidadZombies = 0;
                vidasConan = 4;


                System.out.println("---- NUEVA PARTIDA ----");

                break;
                default:
                salir = true;


                

            }

        }while (salir == false);

        System.out.println();
        System.out.println("GRACIAS POR JUGAR");

    }

    }



