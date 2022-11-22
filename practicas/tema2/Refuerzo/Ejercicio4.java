package tema2.Refuerzo;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

System.out.println("Introduzca cuantas horas trabaja durante la semana");

int horas = sc.nextInt();

int salario = 0;

if (horas > 40) {

    int a = 40 * 12;

    horas = horas - 40;

    horas = horas * 16;

    salario =  horas + a;

    
} else {

    salario = horas *12;
    
}

System.out.println("El sueldo semanal es de: "+salario);



    }

}
