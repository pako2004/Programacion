package funciones.ejercicios;

import java.rmi.server.RemoteStub;
import java.security.cert.TrustAnchor;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class SolucionBaloncesto {
    
        
         //Variables de los equipos
    final static int E1_ACIERTO_2 = 70;
    final static int E2_ACIERTO_2= 75;

    final static int E1_ACIERTO_3 = 45;
    final static int E2_ACIERTO_3 = 35;

    final static int E1_JUEGA_DE_2 = 60;
    final static int E2_JUEGA_DE_2 = 70;

    final static int E1_REBOTE_DEF = 60;
    final static int E1_REBOTE_ATA = 30;

    final static int E2_REBOTE_DEF = 70;
    final static int E2_REBOTE_ATA = 40;

    public static void main(String[] args) {
    
        int puntosE1;
        int puntosE2;

        System.out.println("Empieza la simulación del partido de baloncesto");

        //salto Inicial
        String turno  = salto();
        System.out.println("Ataca el equipo: " + turno);

        //Un partido de baloncesto hay unas 150 posesiones de media.
        for(int posesion = 0; posesion < 150; posesion++)
        {
            int valorAtaque = canasta(turno);
            

            //Si hay canasta entonces el turno es del equipo que estaba defendiendo
            if (valorAtaque>0)
            {
                if  (turno.equals("E1")){
                actualizarPuntos(puntosE1, valorAtaque);
            }else{
                actualizarPuntos(puntosE2, valorAtaque);
            }
                System.out.println("Canasta de " + turno + " - de " + valorAtaque + " puntos");
                imprimirResultado(puntosE1, puntosE2);
                turno = siguienteTurno(turno);
                System.out.println("Ataca el equipo: " + turno);
            }
            else 
            {
                //no hay canasta, se  produce un rebote
                turno = rebote(turno);
                System.out.println("Rebote del equipo: " + turno);
            }
        }
        System.out.println("-------------------------");
        System.out.println("FIN de partido");
        imprimirResultado(puntosE1, puntosE2);


    }



        //Funciones que necesito programar
        /*
        xx salto() --> devuelve E1 si el salto lo gana E1 y E2 si el salto lo gana E2
        canasta(turno) --> devuelve el valor de la canasta realizada (0, 2 o 3) 
        actualizarPuntos(valorAcumulado, valorAIncrementar)  
        canasta(tipoTiro, porcentaje) ---> dado un tipo de tiro y el % de acierto devuelve true si hay canasta y false si no     
        xx tipoTiro() --> devuelve el tipo de tiro que va a realizar el equipo (tiro2 o tiro3)
        xx tipoTiro(int porcentaje2, int porcentaje3) -> devuelve el tipo de tiro que se produce según los porcentajes indicados
        rebote(String equipoAtaque) ---> devuelve E1 si el rebote lo gana E1 y E2 si el rebote lo gana E2
        rebote(int reboteAtaque, int reboteDefensa) ---> indica true si el rebote es de ataque y false si el rebote es de defensa
              El rebote del equipo atacante es de 0 a maximo y el rebote del equipo que defiende es de 30 al maximo.
        aleatorio(maximo)--> devuelve un numero aleatorio entre 0 y maximo
        aleatorio(minimo, maximo) ---> devuelve un número entre mínimo y máximo
        imprimirResultado(int valor1, int valor2) ---> imprime el resultado actual del partido.
        */

    static boolean rebote(int porcentajeAtaque, int porcentajeDefensa){
        int reboteAtaque = aleatorio(porcentajeAtaque);
        int reboteDefensa =aleatorio(30, porcentajeDefensa);

        return (reboteAtaque > reboteDefensa);
    }
    
    static String rebote( String turno){

        Boolean rebAtaque = false;
        String resultado = turno;
        if (turno.equals("E1")){
            rebAtaque = rebote(E1_REBOTE_ATA,E2_REBOTE_DEF);
            
        }else  //turno deataque es de E2
        {
            rebAtaque = rebote(E2_REBOTE_ATA,E1_REBOTE_DEF);
            
        }
        if (!rebAtaque){
            resultado = siguienteTurno(turno);
        }
        return resultado;
    }

    static String siguienteTurno(String turnoAnterior){
        String turnoSiguiente = "E1";

        if (turnoAnterior.equals("E1")){
            turnoSiguiente ="E2";
        }else{
            turnoSiguiente="E1";
        }
        return turnoSiguiente;
    }

    static void imprimirResultado(int valor1, int valor2){
        System.out.println("-------------");
        System.out.println(" E1 = "+valor1+" E2= "+valor2);
        System.out.println();
    }

    static int actualizarPuntos(int valorIncial, int incremento){
        return valorIncial+incremento;
    }

    static String salto(){

        String resultado = "E1";
        int numero =  aleatorio(100);
        if (numero >=50){
            resultado ="E2";
        }
        return resultado;

    }
    static int aleatorio(int maximo){

        return (int)(Math.random()*maximo);
    }

    static int aleatorio(int minimo,int maximo){

        return (int)(Math.random()*(maximo-minimo)+maximo);
    }
    /**
     * Devuelve el valor de la canasta realizada
     * @param turno
     * @return
     */
    static int canasta(String turno){
        int tipoTiro =2;
        int resultado = 0;
        if (turno.equals("E1")){

             tipoTiro = tipoTiro(turno);

             if (tipoTiro ==2){
                resultado = canasta(2,E1_ACIERTO_2);
             }else if (tipoTiro == 3){
                resultado =canasta(3,E1_ACIERTO_3);
             }
        }else //TURNO ES E2
        {
            tipoTiro = tipoTiro(turno);

             if (tipoTiro ==2){
                resultado = canasta(2,E2_ACIERTO_2);
             }else if (tipoTiro == 3){
                resultado =canasta(3,E2_ACIERTO_3);
             }
        }

        return resultado;
    }
    /**
     * Devuelve el valor si el aleatorio esta dentro del porcentaje y devuelve 0 si el aleatorio no esta adentro
     * @param valor
     * @param porcentajeAcierto
     * @return
     */
    static int canasta(int valor, int porcentajeAcierto){

        int resultado = valor;
        
        int random = aleatorio(100);

        if (random >porcentajeAcierto){
            resultado = random;
        }
        return resultado;
    }
/**
 * Devuelve el tipo detiro sgun el equipo que tiene le turno
 * @param turno
 * @return
 */
    static int tipoTiro (String turno){

        int tipoTiro = 2;

        if (turno.equals("E1")){

            tipoTiro = tipoTiro(E1_JUEGA_DE_2);

        }else{
            tipoTiro =tipoTiro(E2_JUEGA_DE_2);
        }
        return tipoTiro;
        
    }
/**
 * devuelve el tipo de tiro segun el porcentaje de la eleccion de tiro del equipo 
 * @param porcentaje2
 * @return
 */
    static int tipoTiro(int porcentaje2){

        int tipoTiro = 2;

        int random =aleatorio(100);

        if (random >= porcentaje2){
            tipoTiro = 3;
        }
        return tipoTiro;
    }

}
    

