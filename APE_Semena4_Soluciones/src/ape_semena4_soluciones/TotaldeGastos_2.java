/*
Algoritmo-2
Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; calcular y mostrar el total de gastos de los hijos del padre de familia.
*/
package ape_semena4_soluciones;
import java.util.Scanner;
public class TotaldeGastos_2 {
    public static void main(String[] args) {
        double Gastos1;
        double Gastos2;
        double Gastos3;
        double GastosTotal;
        
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese los gastos del primer hijo: ");
        Gastos1 = teclado.nextDouble();
        
        System.out.println("Ingrese los gastos del segundo hijo: ");
        Gastos2 = teclado.nextDouble();
        
        System.out.println("Ingrese los gastos del terceer hijo: ");
        Gastos3 = teclado.nextDouble();
        
        System.out.println("-----La solucion del problema-----");
        
        GastosTotal = (Gastos1 + Gastos2 + Gastos3);
        
        System.out.println("El total de gastos de los hijos es: " + GastosTotal);
    }
    
}