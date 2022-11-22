package tema2;

import java.util.Scanner;

public class ejercicioSwitch {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el dia de la semana: ");
        
        int diaSemana = sc.nextInt();

    switch (diaSemana)
    {
        case 1: 
        System.out.println("LUNE");
        break;
        case 2: 
        System.out.println("marte");
        break;
        case 3: 
        System.out.println("meircas");
        break;
        case 4: 
        System.out.println("jeuve");
        break;
        case 5: 
        System.out.println("vierne");
        break;
        case 6: 
        System.out.println("savbafo");
        
        case 7: 
        System.out.println("domiengo");
        System.out.println("FIN DE SEMANA MMGV");
        break;
        default:
        System.out.println("ERROL");


    }

/*
 * Leer un numero y decir cuantas cifras tiene
 */

System.out.println("Ingrese un numero");

int num = sc.nextInt();

if (num>0 && num<9) {
    
    System.out.println("El numero tiene 1 cifra");

} else if (num>9 && num<100) {
    
    System.out.println("El numero tiene 2 cifra");

} else if (num>100 && num<1000) {
    
    System.out.println("El numero tiene 3  cifra");

} else if (num>1000 && num<10000) {
    
    System.out.println("El numero tiene 4 cifra"); {
    
    }

    /*
     * Dado un mes en letar "ENERO"
     * Cuantos dias tiene el mes
     */



System.out.println("Ingrese el Mes: ");

int mes = sc.nextInt();

switch (mes)
{
    case 1 + 2 + 3:
    System.out.println("ENERO");



}




}
}
}

