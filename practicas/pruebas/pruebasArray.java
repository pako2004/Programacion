package pruebas;



import arrays.UtilesArrayLuis;

public class pruebasArray {
    public static void main(String[] args) {
        int[] array = new int[0];
        //int[] array = null;

        UtilesArrayLuis.rellenar(array,10);
         
        UtilesArrayLuis.imprimir(array);

        //array =UtilesArrayLuis.limpiar();

        array =UtilesArrayLuis.insertaAlInicio(array, 10);

        array =UtilesArrayLuis.insertaAlInicio(array, 20);

        array =UtilesArrayLuis.insertaAlInicio(array, 30);

        array =UtilesArrayLuis.insertaAlInicio(array, 40);

        array =UtilesArrayLuis.insertarAlFinal(array, 5);

        boolean ordenado = UtilesArrayLuis.estaOrdenado(array);

        System.out.println("Esta ordenado: " + ordenado);

        UtilesArrayLuis.imprimir(array);

        array =UtilesArrayLuis.eliminarPrimero(array);

        array =UtilesArrayLuis.eliminar(array, 40);

        array =UtilesArrayLuis.ordenar(array);

        array =UtilesArrayLuis.insertarOrdeando(array,5,15);

        UtilesArrayLuis.imprimir(array);
        
        int posicion30 =UtilesArrayLuis.buscar(array, 30);

        System.out.println("El elemento 30 está en la posicion: " + posicion30);

        int posicion99 =UtilesArrayLuis.buscar(array, 99);

        System.out.println("El elemento 99 está en la posicion: " + posicion99);

        array =UtilesArrayLuis.partirPor(array, 1,3);

        UtilesArrayLuis.imprimir(array);
        



    }
}
