/*
Algoritmo-8
Se debe generar un algoritmo que permite calcular y mostrar el valor total a pagar mensual de servicios digitales de una persona.
*/
package ape_semena4_soluciones;
import java.util.Scanner;
public class ServiciosDigitales_8 {
    public static void main(String[] args) {
        double Edad;
        double Netflix;
        double YoutubeP;    
        double Dropbox;
        double Spotify;
        double ValorTotal;
        
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese la edad del cliente:");
        Edad = teclado.nextDouble();
        
        System.out.println("Ingrese el valor mensual de Netflix:");
        Netflix = teclado.nextDouble();
        
        System.out.println("Ingrese el valor mensual de Youtube Premium:");
        YoutubeP = teclado.nextDouble();
        
        System.out.println("Ingrese el valor mensual de Dropbox:");
        Dropbox = teclado.nextDouble();
        
        System.out.println("Ingrese el valor mensual de Spotify:");
        Spotify = teclado.nextDouble();
              
        ValorTotal = (Netflix+YoutubeP+Dropbox+Spotify);
                
        if (Edad<30){
            System.out.println("-----La solucion del problema-----");
            System.out.println("Se aplica un descuento del 20%:");
            ValorTotal = (ValorTotal-(ValorTotal*20/100));
            System.out.println("El valor total mensual es: " + ValorTotal);
        }
        else{
            System.out.println("-----La solucion del problema-----");
            System.out.println("El valor total mensual es: " + ValorTotal);
            
        }
    }
    
}