package funciones.ejercicios;

import java.util.Scanner;

public class Ejercicio1_LuisRodriguez {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final double PLATO1 = 5;
        final double PLATO2 = 4;
        final double PLATO3 = 4.5;
        final double PLATO4 = 6;
        final double PLATO5 = 8;
        final double PLATO6 = 9;
        final double PLATO7 = 5;
        final double PLATO8 = 1.5;
        final double PLATO9 = 1.25;
        final double PLATO10 = 2;
        boolean salir = false;
        int opcion = 0;
        double total = 0;
        double cantidad = 0;
        double cant1 = 0;
        double cant2 = 0;
        double cant3 = 0;
        double cant4 = 0;
        double cant5 = 0;
        double cant6 = 0;
        double cant7 = 0;
        double cant8 = 0;
        double cant9 = 0;
        double cant10 = 0;
        double descuent1 = 2;
        double descuento2 =3;
        double descuento3 = 5;
        double restado = 0;



        do{
            
            System.out.println(" *** RESTAURANTE VEGA DE MIJAS ****");
            System.out.println(" ----------------------------------");
            System.out.println("Primeros platos");
            System.out.println(" 1. Salmorejo (5€)");
            System.out.println(" 2. Sopa picadillo (4€)");
            System.out.println(" 3. Ensalada de atún (4.5€)");
            System.out.println("Segundos platos");
            System.out.println(" 4. Paella (6€)");
            System.out.println(" 5. Salmón (8€)");
            System.out.println(" 6. Codillo al horno (9€)");
            System.out.println(" 7. Lentejas (5€)");
            System.out.println("Postres");
            System.out.println(" 8. Fruta (1.5€)");
            System.out.println(" 9. Café (1.25€)");
            System.out.println("10. Helado (2€)");
            System.out.println();
            System.out.println();
            System.out.println("0. SALIR (Imprimir Ticket + FIN) ");
            System.out.println("Selecciona la opción deseada por el cliente...");

            opcion = sc.nextInt();

            if (opcion < 0 || opcion > 7){

                System.out.println(" Por favor selccione una opcion correcta");

            

            }else if (opcion != 0){
                System.out.println("Cuanta cantidad quiere?");
                cantidad = sc.nextInt();
                restado = 1 * cantidad;
            }
                switch(opcion){

                    case 0:
                        //FACTURA
                        System.out.println("--------------------");                    
                        if (cant1 > 0 || cant2 > 0 || cant3 > 0){
                            System.out.println("**Primeros platos");
                            if (cant1 > 0){
                                System.out.println("Salmorejo x "+cant1);
                            }
                             if (cant2 > 0){
                                System.out.println("Sopa picadillo x "+cant2);

                             }

                             if (cant3 > 0){
                                System.out.println("Ensalada de atún x "+cant3);
                             }
                        }
                        
                        if (cant4 > 0 || cant5 > 0 || cant6 > 0 || cant7 > 0){
                            System.out.println("**Segundos platos");
                            if (cant4 > 0){
                                System.out.println("Paella x "+cant4);
                            }
                             if (cant5 > 0){
                                System.out.println("Salmón x "+cant5);

                             }

                             if (cant6 > 0){
                                System.out.println("Codillo al horno x "+cant6);
                             }
                             
                             if (cant7 > 7){
                                System.out.println("Lentejas x "+cant7);
                             }
                        }   

                        if (cant8 > 0 || cant9 > 0 || cant10 > 0){
                            System.out.println("**Postres");
                            if (cant8 > 0){
                                System.out.println("Fruta x "+cant8);
                            }
                             if (cant9 > 0){
                                System.out.println("Café x "+cant9);

                             }

                             if (cant10 > 0){
                                System.out.println("Helado x "+cant10);
                             }
                        }
                        // DESCUENTO
                        if (total >= 20 && total <= 30){
                            total = total - descuent1;
                            System.out.println("Descuento de: "+descuent1);
                        }
                        if (total > 30 && total <= 50){
                            total = total - descuento2;
                            System.out.println("Descuento de: "+descuento2);
                        }
                        if (total > 50){
                            total = total -descuento3;
                            System.out.println("Descuento de: "+descuento3);
                        }

                        System.out.println("TOTAL A PAGAR: "+total);
                        

                        salir = true;
                    break;
                    //OPERACIONES
                    case 1:

                        total += PLATO1 * cantidad;
                        cant1 += cantidad;
                        


                        break;
                    
                    case 2:

                        total += PLATO2 * cantidad;    
                        cant2 += cantidad;
                        break;

                    case 3:

                        total += PLATO3 * cantidad;
                        cant3 += cantidad;
                        break;
                    
                    case 4:

                        total += PLATO4 * cantidad; 
                        cant4 += cantidad;

                        if (cantidad >= 2){
                            total -= restado;
                        }

                        break;
                     case 5:

                        total += PLATO5 * cantidad;
                        cant5 += cantidad;
                        if (cantidad >= 2){
                            total -= restado;
                        }
                        break;
                        
                    case 6:

                        total += PLATO6 * cantidad;
                        cant6 += cantidad;
                        if (cantidad >= 2){
                            total -= restado;
                        }
                        break;
                    case 7:

                        total += PLATO7 * cantidad;
                        cant7 += cantidad;
                        if (cantidad >= 2){
                            total -= restado;
                        }
                        break;
                    case 8:

                        total += PLATO8 * cantidad;
                        cant8 += cantidad;
                        break;
                    case 9:

                        total += PLATO9 * cantidad;
                        cant9 += cantidad;
                        break;
                    case 10:

                        total += PLATO10 * cantidad;
                        cant10 += cantidad;
                        break;


                }





        
        }while (salir == false);


        




    
    }
}
