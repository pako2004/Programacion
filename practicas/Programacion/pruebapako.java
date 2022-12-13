package Programacion;

public class pruebapako {
    public static void main(String[] args) {
        
        boolean var2 = false;
        boolean var3 = false;
        boolean var = false;
        int diaMes = 15;
        System.out.println((!var && var3)||(var2 && !var3)? "El dia es par": "El dia no es par");

        System.out.println(( var ||(!var2 && !var3))?"verdad" : "falso");
    }
}
