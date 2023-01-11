package arrays;

import java.util.Scanner;

public class ejercicio15 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] mesas = new int[10];
        boolean salir = false;
        int num = 0;

        UtilesArrayLuis.aleatorio(mesas,5);

        do{

            System.out.print("¿Cuantos son?(Introduzca -1 para salir del programa): ");
            num = sc.nextInt();

            if (num == -1){
                salir = true;
                System.out.println("Vuelva pronto!");
            }

                
            if (num > 0 && num < 5){

                imprimirMesas(mesas);
                buscarMesa(mesas, num);

                }else{
                    System.out.println("Lo siento, no admitimos grupos de "+ num +" haga grupos de 4 personas como máximo e intente de nuevo.");
                }
                


            


        }while  (salir == false);

    }

    static int buscarMesa(int[] mesas, int num){

        int numMesa = 0;
        boolean encontrado = false;
        for (int i = 0; i < mesas.length; i++){

            int mesaLibre = UtilesArrayLuis.buscar(mesas, 0);
            if(mesaLibre >= 0){

                mesas[mesaLibre] += num;
                System.out.println("Por favor sientese en la mesa numero "+mesas[mesaLibre]);
                i = mesas.length;

            }else if(!encontrado && mesas[i] + num >= 4 ){
                numMesa = i;
                mesas[i] += num;
                System.out.println("Tendran que compartir mesa, Por favor sientese en la mesa numero "+mesas[i]);
                
            }else{

                System.out.println("Lo siento en este momento no hay sitio");
            }

            /*if((mesas[i] + num) >= 4 ){
                numMesa = i;
                mesas[i] += num;
                System.out.println("Tendran que compartir mesa, Por favor sientese en la mesa numero "+mesas[i]);
            }else if(mesas[i] == 0){

                mesas[i] += num;
                System.out.println("Por favor sientese en la mesa numero "+mesas[i]);

            }else{

                System.out.println("Lo siento en este momento no hay sitio");
            }*/


        }

        return numMesa;
    }


    static void imprimirMesas (int[] mesas){

        /*System.out.print("Mesa º:\t");
        for (int i = 1; i < 11; i++ ){
            System.out.print(i+"\t");
        } 
        System.out.println("");
        System.out.print("Ocupacion\t");
        for (int i = 0; i < mesas.length; i++){
            System.out.print("|"+ mesas[i]+"|"+"\t");
        }*/
        String array = "";
        System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");   
        System.out.println("│Mesa noº │  1 │  2 │  3 │  4 │  5 │  6 │  7 │  8 │  9 │ 10 │");
        System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
        System.out.println("│Ocupación│"+ocupantes(mesas));
        System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
                

    }

    static String ocupantes(int[] mesas){
        String suas = "";
        for (int i = 0; i < mesas.length; i++ ){

            suas += "  "+mesas[i]+" |";
        }
        return suas;
    }
}   
