/*
Algoritmo-1
Generar un algoritmo que permite calcular y presentar el área de un triángulo. Los datos deben ser pedidos al usuario.
Los datos deben ser pedidos al usuario.
*/
package ape_semena4_soluciones;
import java.util.Scanner;
public class ValorPlantilla_4 {
    public static void main(String[] args) {
        double CosMin;
        double Min;
        double ValorPlantilla;
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese la base del triangulo: ");
        CosMin = teclado.nextDouble();
        
        
        System.out.println("Ingrese la altura del triangulo");
        Min = teclado.nextDouble();
        
        System.out.println("-----La solucion del problema-----");
        
        ValorPlantilla = (CosMin*Min);
        
        System.out.println("El costo de la plantilla es " + ValorPlantilla);
    }
    
}
