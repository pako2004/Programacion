package tema2.Refuerzo;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        
        
Scanner sc = new Scanner(System.in);

System.out.println("EScriba la hora");

int diaSemana = sc.nextInt();


    switch (diaSemana)
    {
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        System.out.println("Buenos Dias");
        break;
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        System.out.println("Buenas Tardes");
        break;
        case 21:
        case 22:
        case 23:
        case 24:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        System.out.println("Buenas Noches");
        break;








    }
}
}