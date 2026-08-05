/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interes_simple;

import java.util.Scanner;

/**
 *Escriba un programa que calcule el interés simple de un préstamo. El sistema
debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo
en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
 * @author drmen
 */
public class Interes_Simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        
       
        int capital_inicial= 0;
        double tasa_interes_anual=0;
        int tiempo=0;
        double intereSimple;
        
        System.out.println("Ingrese su capital inicial");
        capital_inicial= sc.nextInt();
        
        System.out.println("Ingrese la tasa de interes anual,sin el simbolo %");
        tasa_interes_anual= sc.nextInt();
        
        System.out.println("Ingrese la cantidad de tiempo");
        tiempo= sc.nextInt();
        
        intereSimple= (capital_inicial * tasa_interes_anual * tiempo) / 100.0;
        System.out.printf("Su tasa de interes generado es de: %.2f",intereSimple);
        
                
        
        
        
    }//Fin del main
    
}
