/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclofor;

import java.util.Scanner;

/**
 *Objetivos
 * 1.Usar la estructura de repeticion del ciclo For
 * 2.Emplear ls constantes en programacion
 * @author drmen
 */
public class CicloFor {

    /**Desarrollar un algoritmo que permita calcular el
     * porcentaje de votantes (varones y mujeres)
     * que hay en una cabina. indicar quienes fueron los que mas votaron
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        /*
      *   1. variable de control  -> valor inicia;
             2. condicion -> limite
             3. modificador de la v.c -> incremento/decremento
        
        */
        /*System.out.println("Ciclo for 1");
        for (int i = 0; i <=10; i++) {
        System.out.printf("Ciclo %d\n",i);
        
    }//fin ciclo for 1
        
        System.out.println("Ciclo for 2");
        for (int i = 0; i <=10; i+=2) {
         System.out.printf("Ciclo %d\n",i);
    }// fin del ciclo for 2
     */
        
      final int NUMEROVOTANTES =20;
      int numVarones = 0;
      int numMujeres = 0;
      char seleccion = '1';
      
      for (int i =0; i<NUMEROVOTANTES;  i++){
          System.out.println("Genero de votante");
          System.out.print("V: Varon / M: Mujer");
          seleccion = sc.next().toUpperCase().charAt(0);
          
        switch (seleccion) {// aqui combiene mas el switch porque son valores puntuales
            case 'V':
                System.out.println("Varon entrado a la cabina");
                numVarones++;
            break;
            
            case 'M':
                System.out.println("Mujer entrando a la cabina");
                numMujeres++;
                break;
            default:
                System.out.println("Error de Ingreso");
                
        } 
      } 
        
        
    }//fin del main 
    
}//fin del main