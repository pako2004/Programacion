package Programacion;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ejer2_LuisRodriguez {
    public static void main(String[] args) {
        

        int year = (int)(Math.random()*(2050-2023+1)+2023); //genero el año entre rango 2050 y 2023

        int dias = (int)(Math.random()*(365-1)+1); //dias aleatorios

        
        LocalDateTime diaHoy = LocalDateTime.now(); //fecha actual
        
     
        int diaActual = diaHoy.getDayOfYear(); //dia del año acutal

        diaHoy = diaHoy.plusDays(diaActual + dias); // sumo los dias

        diaHoy = diaHoy.withYear(year); //le cambio el año actual al año aleatorio


        DateTimeFormatter formato =  DateTimeFormatter.ofPattern("'te ha tocado un ' EEEE ' del año ' yyyy '- a las ' h:m ' horas del 'd 'de 'MMMM ");

        System.out.println(diaHoy.format(formato));

        LocalDateTime fechaGenerada = diaHoy;
        //Cambio la fecha al 1 de enero de ese año 
        fechaGenerada = fechaGenerada.withDayOfMonth(1);
        fechaGenerada = fechaGenerada.withMonth(1);
        
        
        // Muestro cuantos dias hay entre ellos
        // System.out.println("Han pasado "+ChronoUnit.DAYS.between(fechaGenerada, diaHoy)); //Solucion con chronoUnit

        int diasDiferencia = (int)(fechaGenerada.getDayOfYear() - (diaHoy.getDayOfYear()));

        System.out.println("Han pasado "+ Math.abs(diasDiferencia)); // Uso la funcion math abs para pasar el numero de negativo a positivo
        int diaMes = diaHoy.getDayOfMonth(); // creo una variable que contenga el dia del mes del año
        
        //Ternario del dia par o impar  
        System.out.println("Dia del mes: "+diaMes);
        System.out.println(((diaMes % 2) == 0)? "El dia es par": "El dia no es par");
    }
}
