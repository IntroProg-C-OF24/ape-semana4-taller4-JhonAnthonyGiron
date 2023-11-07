/*
Algoritmo-6
Generar un solución que permita calcular y mostrar el pago mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del préstamo y el interés mensual a cobrar.
*/
package ape_semena4_soluciones;
import java.util.Scanner;
public class Pagomensual_6 {
    public static void main(String[] args) {
        double Prestamo;
        double InteresMensual;
        double CostoMensual;
        
        
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese el valor del prestamo: ");
        Prestamo = teclado.nextDouble();
        
        System.out.println("Ingrese el valor del interes: ");
        InteresMensual = teclado.nextDouble();
        
        InteresMensual = (Prestamo*(InteresMensual/100));
                    
        System.out.println("-----La solucion del problema-----");
        
        CostoMensual = ((Prestamo+InteresMensual)/12);      
                
        System.out.println("El valor a pagar mensualmente es " + CostoMensual);
    }
    
}
