
package calculadora;

import java.util.Scanner;

/**
 *
 * @author ibiet
 */
public class Calculadora {
//Atributos
    private int numero1;
    private int numero2;
    private int suma;
    private int resta;
    private int multiplicacion;
    private int division;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(int multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }
    
   //Método para ingresar valores
    
    public void leerNumeros(){
       Scanner sc = new Scanner (System.in);
       System.out.println("Digite un numero ");
       numero1 = sc.nextInt();
       
       System.out.println("Digite un numero ");
       numero2 = sc.nextInt();
    }
    
    //Métdo para sumar ambos numeros
    public void sumar(){
        suma = numero1 + numero2;
    }
    
     public void restar(){
        resta = numero1 - numero2;
    }
     
     public void multiplicar(){
        multiplicacion = numero1*numero2;
    }
     
     public void dividir(){
        division = numero1/numero2;
    }
     //Método para mostrar resultados
     
     public void mostrarResultados(){
         System.out.println("La suma es "+suma);
         System.out.println("La resta es "+resta);
         System.out.println("La multiplicación es "+ multiplicacion);
         System.out.println("La division es "+division);
     }
    
}
