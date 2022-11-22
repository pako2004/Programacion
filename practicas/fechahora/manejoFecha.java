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

import javax.net.ssl.HostnameVerifier;

public class manejoFecha {

public static void main(String[] args) {
    
System.out.println(LocalDate.now());

System.out.println(LocalTime.now());

System.out.println(LocalDateTime.now());

//Crear fecha concreto

DateTimeFormatter miFormatoDeFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

LocalDateTime fechaActual = LocalDateTime.now();

System.out.println(fechaActual.format(miFormatoDeFecha) + " Pako");

LocalDate miFecha = LocalDate.of(2023,3,28);

LocalTime miHora = LocalTime.of(1, 20, 30);

LocalDateTime miFechaHora = LocalDateTime.of(miFecha, miHora);

System.out.println(miFechaHora.format(miFormatoDeFecha));

//Modificar una Fecha

miHora= miHora.withHour(23);

miHora = miHora.withMinute(34);
System.out.println(miHora);

miFecha = miFecha.withMonth(5);
miFecha = miFecha.withYear(2023);
miFecha = miFecha.withDayOfMonth(10);

System.out.println(miFecha);

LocalDate diaSiguiente = miFecha.plusDays(1);
System.out.println(diaSiguiente);
LocalDate diaAnterior = miFecha.minusDays(1);
System.out.println(diaAnterior);


System.out.println("Actual: " + miFechaHora);
miFechaHora.plusHours(12);
System.out.println(miFechaHora);

//Clase period busca el periodo entre dos Fechas // restar fechas


LocalDate finDeAño = LocalDate.of(2022, 12, 21);

Period deHoyAFinDeAño = Period.between(LocalDate.now(), finDeAño);

int numeroDias = deHoyAFinDeAño.getDays();

System.out.println("Quedan para fin de año: " + numeroDias + "dias" );


//pide al usuario que introduzca su fecha de nacimiento
//muestrala en el formato dd-MM-yy
//Indica cuantos dias queda para cumplir otro año
//muestra la edad que tiene 

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

Int añoActual = fechaActual.getYear();

LocalDate cumpleaños = LocalDate.of(diaNac1, mesNac, año);
cumpleaños = cumpleaños.withMonth();


Period cumple = Period.between(LocalDate.now(), cumpleaños);

int diasCumple = cumple.getDays();
int mesesCumple = cumple.getMonths();
int añoCumple = cumple.getYears();



System.out.println("Faltan "+diasCumple+" dias "+ mesesCumple + " meses " + añoCumple +" para su cumpleaños");


System.out.println(LocalDate.now()+" Fecha de hoy");











}


    
}
