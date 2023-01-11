package arraysBi;

import java.util.Arrays;

public class arraysBi {
    public static void main(String[] args) {
        
        int[][] datos = new int [3] [2]; // TRes filas y dos columnas
                                            //Equivalente a tres arrays de dos elementos
        datos[0][1] = 0;
        datos[0][1] = 1;
        datos[1][1] = 2;
        datos[2][1] = 3;
        datos[2][0] = 4;
        
        System.out.println(Arrays.deepToString(datos));

        System.out.println(datos.length);

        for (int i = 0; i < datos.length; i++){
            int[] fila = datos[i];
            for(int j = 0; j < fila.length; j++){
                System.out.print(datos[i][j]+" ");
            }
            System.out.println();
        }

    }
}
