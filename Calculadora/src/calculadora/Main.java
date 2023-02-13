
package calculadora;

/**
 *
 * @author ibiet
 */
public class Main {
   public static void main(String [] args){
       Calculadora op = new Calculadora();
       
       op.leerNumeros();
       op.sumar();
       op.restar();
       op.multiplicar();
       op.dividir();
       op.mostrarResultados();
   } 
}
