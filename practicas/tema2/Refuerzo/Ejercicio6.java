package tema2.Refuerzo;

import java.util.Scanner;

public class Ejercicio6 {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Ingrese la altura");

double h = sc.nextDouble();

double t = (2 * h);

double g = 9.81;

t = t / g; 

double resultado = (Math.sqrt(t));

System.out.println("El tiempo de caida es "+resultado);


}


}
