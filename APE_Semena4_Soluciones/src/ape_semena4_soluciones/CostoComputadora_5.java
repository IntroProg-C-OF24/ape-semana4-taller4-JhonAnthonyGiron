/*
Algoritmo-5
Generar un algoritmo que permita calcular y mostrar el costos de una computadora de escritorio. La misma es comprada por partes; CPU, teclado, pantalla, ratón.
*/
package ape_semena4_soluciones;
import java.util.Scanner;
public class CostoComputadora_5 {
    public static void main(String[] args) {
        double CPU;
        double Teclado;
        double Pantalla;
        double Raton;
        double CosComputadora;
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese el valor del CPU: ");
        CPU = teclado.nextDouble();
        
        
        System.out.println("Ingrese el valor del teclado");
        Teclado = teclado.nextDouble();
        
        System.out.println("Ingrese el calor de la pantalla");
        Pantalla = teclado.nextDouble();
        
        System.out.println("Ingrese el valor del raton");
        Raton = teclado.nextDouble();
        
        System.out.println("-----La solucion del problema-----");
        
        CosComputadora = (CPU+Teclado+Pantalla+Raton);
        
        System.out.println("El costo de la computadora es " + CosComputadora);
    }
    
}
