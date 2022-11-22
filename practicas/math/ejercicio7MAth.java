package math;

public class ejercicio7MAth {

public static void main(String[] args) {
    

    double tirada1 = (Math.random()*6);

    double tirada3 = (Math.random()*6);

    double tirada2 = (Math.random()*6);

    System.out.println("Tirada 1: " + tirada1);

    System.out.println("Tirada 2: " + tirada2);

    System.out.println("Tirada 3: " + tirada3);



    double max = Math.max(tirada1, tirada2);

    max = Math.max(max, tirada3);

    double min = Math.min(tirada1, tirada2);

    min= Math.min(tirada3, min);

    System.out.println("La tirada mas alta fue: " + (int) max);

    System.out.println("La tirada mas baja fue: " + (int) min);

}





    
}
