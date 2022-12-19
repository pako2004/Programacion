package pruebas;

import arrays.UtilesArrayLuis;

public class pruebasArray {
    public static void main(String[] args) {
        

        int[] array = new int[10];
        array[1] = 10;

        array = UtilesArrayLuis.limipiar();

        if (array == null){
            System.out.println("siu");
        }


    }
}
