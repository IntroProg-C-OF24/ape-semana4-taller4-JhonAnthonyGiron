/*
Algoritmo-1
El programa debe calcular el área del polígono.
*/
package ape_semena4_soluciones;
import java.util.Scanner;
public class CalcularElArea_9 {
    public static void main(String[] args) {
        double LadoCuadrado;
        double AlturaTriangulo;
        double AreaTotal;
        
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese el lado del cuadrado: ");
        LadoCuadrado = teclado.nextDouble();
        
        System.out.println("Ingrese la altura del triangulo: ");
        AlturaTriangulo = teclado.nextDouble();
        
        
        System.out.println("-----La solucion del problema-----");
        
        AreaTotal = (Math.pow(LadoCuadrado, 2))+(LadoCuadrado*AlturaTriangulo)+((LadoCuadrado*AlturaTriangulo)/2);
        
        System.out.println("El area total del poligono es: " + AreaTotal);
    }
    
}