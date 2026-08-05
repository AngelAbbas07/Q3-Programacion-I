/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriamath;

import java.util.Scanner;

/**
 *
 * @author drmen
 */
public class LibreriaMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        double radio=0;
        double pi=Math.PI;
        
        double area=0;
        double circumferencia =0;
        
       
        System.out.println("Ingrese el radio de un circulo");
       radio= sc.nextDouble();
        
        
        area=Math.PI * Math.pow(radio, 2);
        circumferencia= 2* Math.PI * radio;
        System.out.printf("El area de su circulo es de: %.2f",area);
        System.out.printf("\nLa circumferencia de su circulo es de: %.2f",circumferencia);
        
      
                
        // TODO code application logic here
    }
    
}
