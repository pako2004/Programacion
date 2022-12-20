package pruebas;



import arrays.UtilesArrayLuis;

public class pruebasArray {
    public static void main(String[] args) {

        int[] array = new int[10];
        array[1] = 10;
        array[9]=10;

        

        //array = UtilesArrayLuis.limipiar();.


        int acum = 0;
        array = UtilesArrayLuis.insertaAlInicio(array, 77);

        for (int i = 0; i < array.length; i++){

            System.out.println(i+"- "+array[i]);
            acum++;
        }
        System.out.println(acum);
        /* 
        int[] array = null;

        UtilesArrayLuis.rellenar(10);

        UtilesArrayLuis.imprimir(array);

        array = UtilesArrayLuis.limpiar();*/

        //se esta creando mas posiciones de array pero estan vacias 

    }
}
