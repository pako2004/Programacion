package tema1;

import java.util.Scanner;

import javax.lang.model.element.ModuleElement.ExportsDirective;

public class Ejer11 {
    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in);

        System.out.println("Dime un numero del 0 al 9")
        char posicionChar = sc.nextLine().charAt(0)

        boolean esDigito =Character.isDigit(posicionChar)

        int posicionInt = Character.getNumericValue(posicionChar)
        System.out.println((esDigito)? "Posicion leida "+ posicionInt : "ERROR - no es un numero")

        boolean dentroLimites = (posicionInt >= 0 && posicionInt < frase.lenght())

         final char caracterEnPosicion = (esDigito && dentroLimites) ? frase.charAt(posicionint)
        boolean esEspacion = (esDigito && dentroLimites) ? Character.isSpaceChar(caracterEnPosicion);

        String mensajeResultado = (esEspacio) ? "-ESPACIO-" : caracterEnPosicion+""
       
        String  mensajeTotal = (esDigito && dentroLimites) ? "El digito en la posicion: " + posicionInt "es" + caracterEnPosicion+""; 
     

        System.out.println("El digito en la posicion"+ posicionInt+ "es" + caracterEnPosicion);

        sc.close();
    }
}
