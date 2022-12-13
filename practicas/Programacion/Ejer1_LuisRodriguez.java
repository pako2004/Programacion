package Programacion;

import java.util.Scanner;

public class Ejer1_LuisRodriguez {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cadena = "La libertad, Sancho, es uno de los mas preciosos dones que a los hombres dieron los cielo; con ella no pueden igualarse los tesoros que encierra la tierra ni el mar encubre; por la libertad asi como por la honra se puede y debe aventurar la vida, y, por el contrario, el cautiverio es el mayor mal que puede venir a los hombres (Don quijote - Miguel de cervantes)";
        
        int posicion = (int)(Math.random()*(cadena.length()-1)); //Genero posicion aleatoria del string

        System.out.print("El caracter en la posicion "+posicion+" es: ");
        System.out.println((cadena.charAt(posicion) == ' ' ? "Es un espacio": cadena.charAt(posicion)));// si la condicion es true, que muestre que es un espacio, si no, que meustre el caracter
        System.out.println("--------------------");
        System.out.println("Introduzca un caracter");
        
        String caracter = sc.nextLine();
        cadena = cadena.toLowerCase(); // Pongo el caracter y el string en minusculas

        String cadena2 =  cadena.replaceAll(caracter, ""); //Remplazo el caracter con un caracter vacio
        
        System.out.println("La cadena sin ese caracter es:");
        System.out.println(cadena2);//print de la cadena modificada
        System.out.println("------------------------");
        System.out.println();
        System.out.printf("El titulo del libro es: ");
        int position = cadena.indexOf('(');//busco posicion del (
        String titulo = cadena.substring(position); // corto el string para comenzar desde el (
        titulo = titulo.replace("(", "");
        titulo = titulo.replace(")", ""); //Remplazo los parecntesis con un caracter vacio

        System.out.println(titulo);







        


    }
}
