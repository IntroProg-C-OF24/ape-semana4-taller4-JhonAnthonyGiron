/*
Algoritmo-4
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes.
*/
package ape_semena4_soluciones;
import java.util.Scanner;
public class ValorPlantilla_4 {
    public static void main(String[] args) {
        double CosMin;
        double Min;
        double ValorPlantilla;
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese el costo por minuto: ");
        CosMin = teclado.nextDouble();
        
        
        System.out.println("Ingrese los minutos");
        Min = teclado.nextDouble();
        
        System.out.println("-----La solucion del problema-----");
        
        ValorPlantilla = (CosMin*Min);
        
        System.out.println("El costo de la plantilla es " + ValorPlantilla);
    }
    
}
