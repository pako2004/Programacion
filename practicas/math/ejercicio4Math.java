package math;

public class ejercicio4Math {
    public static void main(String[] args) {
        
        float num1 = (float) Math.random();

        System.out.println(num1);
        System.out.println(num1 + " -> Redondea normalmente(Round)  " + Math.round(num1));
        System.out.println(num1 + " -> Redondea al valor mas bajo(floor)  " + Math.floor(num1));
        System.out.println(num1 + " -> Redondea al valor mas alto(ceil)  " + Math.ceil(num1));
        
    }
    
}
