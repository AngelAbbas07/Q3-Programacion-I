/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificación_de_descuentos_en_tienda_de_software_enunciado;

import java.util.Scanner;

/**
 *Una tienda de software ofrece descuentos basados en la edad del cliente y si tiene una membresía
premium. Se tiene que solicitar la edad y si tiene membresía ('S' para sí, 'N' para no).
• Primero, se tiene que verificar si el cliente es mayor de edad (Arriba o igual a 18 años).
o Si es mayor de edad: Se verifica si tiene más de 65 años o si tiene membresía. Si
cumple alguna de las condiciones, recibe un 20% de descuento. Si no, recibe un
10%.
o Si es menor de edad: Verificar si tiene membresía 'S' y tiene más de 12 años. Si es
así, recibe un 15% de descuento. De lo contrario, no tiene descuento (0%)
 * @author drmen
 */
public class Clasificación_de_Descuentos_en_Tienda_de_Software_Enunciado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int edad =0; 
        char membresia = '@';
        char respuesta = '@'; 
        
        System.out.println("Ingrese su edad");
        edad= sc.nextInt();
        System.out.println("Tiene membresia SI/NO,'S' para si, 'N' para no");
        membresia= sc.next().charAt(0);
        
        if(edad>=18)
            if(edad >=65 || membresia =='S'){
        System.out.println("Recibes un 20% de descuento");
        }//fin del if interno
        
        else{
            System.out.println("Solo recibes un 10% de descuentosS");
        }
        else{
        if(edad>=12 && membresia == 'S'){
            System.out.println("Recibes un 15% de descuento");
        }
        else{
            System.out.println("Lo sentimos no tienes descuento");
        }
        }
        
        
        
    }
    
}
