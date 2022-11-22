public class clase1 {
public static void main(String[] args) {
    
int numero = 13;
int aleatorio = 0;// LAS VARIABLES DENTRO DEL IF NO VAN A TENER VALOR FUERA DE ESTE, HAY QUE DECLARARLAS ANTES.


if  (numero>11 && numero%2 == 0);{

System.out.println("hola, estoy dentro del if");


int aleatorio = (int)(Math.random()*100);
numero = numero+aleatorio;



}

    
if (numero>11 && numero%2 == 0) {
    
    aleatorio = (int)(Math.random()*100);
    numero = numero+aleatorio;
    

} else {
    
    System.out.println("hola estoy en el else");

    numero = numero-1;

}

System.out.println("numero: "+numero+ " ("+ aleatorio +")" );


















}
 





}





}



