package tema1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class examen2 {
public static void main(String[] args) {


    // Generando dias

    int dia = (int)(Math.random()*31);
    
    int mes = (int)(Math.random()*(12));

    int año = (int)(Math.random()*(2022));

//formato fecha

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MMM E yyyy");

    //estableciendo fecha
    LocalDate fecha = LocalDate.of(año,mes,dia);



    Period faltante = Period.between(LocalDate.now(), fecha);

    //mostrando resultados

    System.out.println("Es el dia "+ fecha.format(formato));

    int diaFal = faltante.getDays();
    int mesFal = faltante.getMonths();
    int añoFal = faltante.getYears();

    System.out.println("Faltan "+ diaFal + "dias "+ mesFal + " meses " + añoFal + " Años faltantes" );



   

    

    
 


   



}    

     
}
