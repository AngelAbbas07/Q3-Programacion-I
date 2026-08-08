/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author drmen
 */
public class Calculadora {

    /**Crear un programa que actúe como una calculadora básica. Debe solicitar al usuario dos números
enteros y un carácter (char) que represente la operación a realizar:
• Suma
• Resta
• División
• Multiplicación
• Módulo ‘%.
Dependiendo del carácter ingresado, el programa debe usar una estructura de selección para
realizar la operación aritmética correspondiente y mostrar el resultado en formato decimal (cuidar
las divisiones entre cero). Si el usuario ingresa un carácter no válido, se debe mostrar "Operador
no reconocido".
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc=new Scanner(System.in);
            
            int numero1 =0;
            int numero2 =0; 
            char operacion = 'o';
            double resultado = 0;
            
            System.out.println("Ingrese el primer valor");
            numero1= sc.nextInt();
            System.out.println("ingrese el segundo valor");
            numero2= sc.nextInt();
            
            System.out.println("ingrese la operacion que desea realizar");
            operacion = sc.next().charAt(0);
            
           
           switch(operacion){
               case '+':
                   resultado= (numero1 + numero2);
                   System.out.printf("Resultado es: %.2f",resultado);
                   break;
                   
               case '-':
                   resultado = (numero1 - numero2);
                   System.out.printf("Resultado es: %.2f",resultado);
                   break;
                   
               case '*':
                   resultado =(numero1 * numero2);
                   System.out.printf("Resultado es: %.2f",resultado);
                   break;
                 
               case '/':
                   if(numero2 ==0){
                       System.out.println("Error, no se puede dividir");
                   }else{
                   resultado=(numero1 / numero2);
                   System.out.printf("Resultado es: %.2f",resultado);
                   }
                   break;
                   
                   
               case '%':
                   if(numero2 ==0){
                       System.out.println("Eror no se puede dividir entre 0");
                   }else{
                   resultado= (numero1 % numero2);
                   System.out.printf("Resultado es: %.2f",resultado);
                   }
                   break;
                   
               default:
                   System.out.println("Operador no reconocido");
            }
                
               
                
            
        
    }
    
}
