/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversordeunidadesfisicas;

import java.util.Scanner;

/**
 *Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso. El menú
debe mostrar las opciones: 1) Metros a Pies, 2) Kilogramos a Libras, 3) Centímetros a Pulgadas, y
4) Salir.
* 
• Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca pueden
ser negativos. Si el usuario ingresa un valor menor a cero, debe mostrarse un mensaje de
error y volver a pedir el dato.
* 
• Operación: Utiliza una estructura switch para procesar la opción elegida y realizar la
operación aritmética correspondiente. El menú debe repetirse usando do-while hasta que
el usuario elija la opción 4
 * @author drmen
 */
public class ConversordeUnidadesFisicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int seleccionMenu = 0;
        int seleccionSubMenu =0; 
        double resultado =0;
     
        double magnitud = 0;
        do{
        System.out.println("\nMenu de conversiones");
        System.out.println("Bienvenido a tu menu interactivo de conversiones fisicas!!");
        System.out.println("Que conversion deseas realizar");
        System.out.println("""
                           1. Metro a Pies
                           2. Kilogramos a Libras
                           3. Centimetros a Pulgadas
                           4. Salir
                           """);
        seleccionMenu = sc.nextInt();
        
        
        //do{
            sc.nextLine();//limpieza buffer
            System.out.println("Ingrese la magnitud que va a convertir");
            magnitud = sc.nextDouble();
            
            switch(seleccionMenu){
                case 1:
                    resultado= (magnitud * 3.28);
                    System.out.printf("El resultado de su conversion es de: %.2f",resultado);
                break;
                case 2:
                    resultado= (magnitud * 2.20);
                    System.out.printf("El resultado de su conversion es de: %.2f",resultado);
                break;
                case 3:
                    resultado = (magnitud * 0.39);
                    System.out.printf("El resultado de su conversion es de : %.2f",resultado);
                break;
                
            }
            if (magnitud<=0){
                System.out.println("\nError");
                System.out.println("Vuelva a ingresar la magnitud");
            }
            
    }while(seleccionMenu != 4);
        
    }//fin del main
    
}
