package bucles.ejercicios;

public class pagaDelHijo {
    public static void main(String[] args) {

        int precioBicicleta = 2000;

        int contSemanas = 0;

        for (double paga = 0.05; paga <= 2000;){

            
            paga *= 2;

            contSemanas++;

        }

        System.out.println("Se tardará "+contSemanas +" Semanas");


    }
}
