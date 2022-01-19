/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principial;
import static java.lang.Double.parseDouble;
import java.util.Scanner;

public class principal {

   public static void main(String[] args) {
       
      Scanner capturaPantalla= new Scanner(System.in);
      
      System.out.println("Escriba el nombre del alumno");
      String n_alumno= capturaPantalla.nextLine();
      
      
      
      double n1= cargarNumero("1");
      
      
      double n2=cargarNumero("2");
      
      
      double n3=cargarNumero("3");
      
     
      double n4=cargarNumero("4");
      
      
      double n5=cargarNumero("5");
     
   double muestra=promediar(n1, n2, n3, n4, n5);
       System.out.println("El resultados es:" +muestra);
    }
   
   
   
    //si no hay retorno void
    public static double promediar(double n1, double n2, double n3, double n4, double n5){
     
   
      //
      /*
      Dada 5 calificaciones de un alumno obtenidas a lo largo del 
      semestre, construya un programa que imprima el 
        promedio de sus calificaciones.
      */
      

      double resultado= n1+n2+n3+n4+n5;
      
      
      double promedio =resultado/5;
      return promedio;
               }
      
    public static double cargarNumero(String valor){
    Scanner leer = new Scanner(System.in);
    System.out.println("Indique la nota" +valor);
    String nota= leer.nextLine();
    double nta= Double.parseDouble(nota);
    
    return nta;
    }
    
}
