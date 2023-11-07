/*
Algoritmo-3
Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar de un número ingresado por el usuario; solo en el caso que el valor del número esté entre 2 y 6.
*/
package ape_semena4_soluciones;
import java.util.Scanner;
public class TabladeMultiplicar_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Ingrese un numero entre el 2 y el 6 para generar la tabla:");
        
        int numero=scanner.nextInt();
       
        if (2<=numero && numero<=6){
        System.out.println("Tabla de Multiplicar del "+numero);
        for(int i=1; i<=12; i++)
        System.out.println(numero+"*"+i+"="+(numero*i));
      
        }else{
        
        System.out.println("El numero no cumple con las condiciones");
            }
        }
   
    }
    


