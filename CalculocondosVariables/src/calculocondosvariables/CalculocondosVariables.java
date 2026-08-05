/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculocondosvariables;

import java.util.Scanner;

/**
 *Escribir un programa que solicite al usuario la base y la altura de un
rectángulo. Utilice estas dos variables para calcular el área del rectángulo (Base X Altura) y el
perímetro (suma de todos sus lados). Imprimir ambos resultados en pantalla.
 * @author drmen
 */
public class CalculocondosVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner teclado= new Scanner(System.in);
       
       double baserectangulo=0;
       double alturarectangulo=0;
       
       double arearectangulo =0;
       double perimetrorectangulo=0;
       
       
       
        System.out.println("Ingrese la base de su rectangulo");
        baserectangulo = teclado.nextDouble();
        
        System.out.println("Ingrese la altura de su rectangulo");
        alturarectangulo= teclado.nextDouble();
        
         arearectangulo = baserectangulo * alturarectangulo;
         perimetrorectangulo= 2*(baserectangulo + alturarectangulo);
        
        System.out.printf("El area de su rectangulo es igual a: %.2f%n",arearectangulo);
        System.out.printf("El perimetro de su rectangulo es igual a: %.2f%n",perimetrorectangulo);
        
      
        
 
    }//Fin del main 
    
}
