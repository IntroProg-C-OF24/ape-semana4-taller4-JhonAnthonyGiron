/*
Algoritmo-1
Generar un algoritmo que permite calcular y presentar el área de un triángulo. Los datos deben ser pedidos al usuario.
Los datos deben ser pedidos al usuario.
*/
package ape_semena4_soluciones;
import java.util.Scanner;
public class AreaTriangulo_1 {
    public static void main(String[] args) {
        double Base;
        double Altura;
        double AreaTriangulo;
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese la base del triangulo: ");
        Base = teclado.nextDouble();
        
        
        System.out.println("Ingrese la altura del triangulo");
        Altura = teclado.nextDouble();
        
        System.out.println("-----La solucion del problema-----");
        
        AreaTriangulo = ((Base*Altura)/2);
        
        System.out.println("La area del triangulo es " + AreaTriangulo);
    }
    
}
