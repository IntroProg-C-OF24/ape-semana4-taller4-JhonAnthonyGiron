/*
Algoritmo-7
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz.
*/
package ape_semena4_soluciones;
import java.util.Scanner;
public class ValorPlanillaLuz_7 {
    public static void main(String[] args) {
        double Edad;
        double ValorKWxH;
        double NumeroKW;
        double ValorPlanilla;
        
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese la edad del cliente:");
        Edad = teclado.nextDouble();
        
        System.out.println("Ingrese el valor de KW/H:");
        ValorKWxH = teclado.nextDouble();
        
        System.out.println("Ingrese el consumo total de kilovatios en el mes:");
        NumeroKW = teclado.nextDouble();
        
        ValorPlanilla = (ValorKWxH*NumeroKW);
                
        if (Edad>65){
            System.out.println("-----La solucion del problema-----");
            System.out.println("Se aplica un descuento del 10%:");
            ValorPlanilla = (ValorPlanilla-(ValorPlanilla*10/100));
            System.out.println("Valor Planilla " + ValorPlanilla);
        }
        else{
            System.out.println("-----La solucion del problema-----");
            System.out.println("Valor Planilla " + ValorPlanilla);
            
        }
    }
    
}