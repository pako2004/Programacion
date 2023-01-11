package arraysBi;

import funciones.MathPako;

public class ejercicio1 {
    public static void main(String[] args) {
        
        int[][] erguevo = new int[5][5];
        rellenar(erguevo);
        

        for (int i = 0; i < erguevo.length; i++){
            int[] fila = erguevo[i];
            for(int j = 0; j < fila.length; j++){
                System.out.print(erguevo[i][j]+" ");
            }
            System.out.println();
        }

        
    }

    static void rellenar(int[][]mama){

        for(int i = 0; i < mama.length; i++){
            int[] fila = mama[i];
            for (int j = 0; j < fila.length; j++){
                mama[i][j] = (int)(Math.random()*10);
            }
        }

    }

  
}
