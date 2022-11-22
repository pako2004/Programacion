package fechahora;


import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ejercicio1Fecha {


    public static void main(String[] args) {
        
//pide al usuario que introduzca su fecha de nacimiento
//muestrala en el formato dd-MM-yy
//Indica cuantos dias queda para cumplir otro año
//muestra la edad que tiene 

LocalDateTime fechaActual = LocalDateTime.now();

System.out.println("En que dia nació?");

Scanner sc = new Scanner(System.in);

int diaNac1= sc.nextInt();

System.out.println("En que mes nació?");

Scanner sc2 = new Scanner(System.in);

int mesNac= sc2.nextInt();

System.out.println("En que año nació?");

Scanner sc3 = new Scanner(System.in);

int añoNac= sc3.nextInt();




LocalDate fechaNac = LocalDate.of(añoNac,mesNac,diaNac1);
fechaNac = fechaNac.withMonth(mesNac);
fechaNac = fechaNac.withDayOfMonth(diaNac1);
fechaNac = fechaNac.withYear(añoNac);

System.out.println(fechaNac);;

Period edad1 = Period.between(LocalDate.now(), fechaNac);

int edad2 = edad1.getYears();



System.out.println("La edad del usuario es: "+edad2 );


int añoActual = fechaActual.getYear();

LocalDate cumpleaños = LocalDate.of(diaNac1, mesNac, añoActual+1);



Period cumple = Period.between(LocalDate.now(), cumpleaños);

int diasCumple = cumple.getDays();
int mesesCumple = cumple.getMonths();
int añoCumple = cumple.getYears();



System.out.println("Faltan "+diasCumple+" dias "+ mesesCumple + " meses " + añoCumple+1 +" para su cumpleaños");


System.out.println(LocalDate.now()+" Fecha de hoy");



    }
    
}
