package arrays;

import java.util.Scanner;

public class ejercicio8 {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double[] temperaturas = new double[12];
        String[] meses = {"Ene", "Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};

        temperaturas(temperaturas,meses);

        imprimir(temperaturas, meses);

    }
    static void temperaturas (double[] temp, String[] meses){
        System.out.println("Por favor ingrese las temperatura de los siguientes meses:");
        for (int i = 0; i < temp.length;i++){
            System.out.println(meses[i]);
            temp[i] = sc.nextDouble();
        }
    }

    static void imprimir(double[] temp, String[] meses){
        System.out.println("---------///---------");
        for (int i = 0; i < temp.length;i++){

            System.out.print(meses[i]+"-"+temp[i]+"º"+"\t||");
            for (int j = 0; j <= temp[i];j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
