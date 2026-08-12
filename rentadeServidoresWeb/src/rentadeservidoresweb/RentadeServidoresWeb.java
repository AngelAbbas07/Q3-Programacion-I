/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentadeservidoresweb;

import java.util.Scanner;

/**
 *Renta de Servidores Web (Mezcla de switch e if/else con booleanos)
Una empresa de hosting renta servidores. El costo base por día es de $10.0. Se le pide al usuario la
cantidad de días y el tipo de plan (“A” Básico, “B” Pro, “C” Empresarial). Usando un switch para
añadir un costo extra diario:
• Plan Básico se suma $0,
• Plan Pro se suma $5,
• Plan Empresarial se suma $15.
Después de calcular el subtotal, usar una estructura de selección simple para aplicar una
promoción:
• Si el cliente renta el servidor por más de 15 días y el plan es 'B'o 'C', se le aplica un 15% de
descuento al total.
Se tiene que mostrar el total a pagar, la cantidad de días de renta y el plan seleccionado.
 * @author drmen
 */
public class RentadeServidoresWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
                
        double costoBase = 10.0;
        int cantidadDias = 0;
        char plan = 'A';
        double subTotal= 0;
        int costoExtra = 0;
        double  total =0;
        
        System.out.println("Bienvenido a la venta de servidores");
        System.out.println("El costo base por dia es de 10.0");
        System.out.println("Ingrese la cantidad de dias");
        cantidadDias = sc.nextInt();
        
        
        
        System.out.println("Ingrese el plan que desea adquirir que tiene un costo extra");
        System.out.print("""
                         A. Plan Basico: 0
                         B. Plan Pro : 5
                         C. Pan Empresarial: 15 
                         """);
        plan= sc.next().toUpperCase().charAt(0);
            
        
        
       switch(plan){
           case 'A':
               costoExtra = 0;
               subTotal=  (costoBase + costoExtra)* cantidadDias;
               System.out.printf("Su subtotal con el plan A es de: %.2f",subTotal);
           break;
                
           case 'B':
               costoExtra = 5;
               subTotal = (costoBase + costoExtra)* cantidadDias;
               System.out.printf("Su subtotal con el plan  B es de: %.2f",subTotal);
           break;
           
           case 'C':
               costoExtra = 15;
               subTotal = (costoBase + costoExtra)* cantidadDias;
               System.out.printf("Su subtotal con el plan C es de: %.2f",subTotal);
               
           break;   
           default:
               System.out.println("Error no se reconoce el plan ");     
       }//fin del switch
             
       if(cantidadDias>15 && (plan== 'B'|| plan== 'C')){
           System.out.println("\n Se le aplicara un 15% de descuento");
          double descuento= (0.15 *  subTotal);
         total= (subTotal - descuento);
           
                 
       }
        System.out.printf("\nSu total sin descuento es: %.2f",subTotal);
        System.out.printf("\nSu total es de: %.2f",total);
        System.out.printf("\nLos cantidad de dias rentados son: %d",cantidadDias);
        System.out.printf("\nEl plan que selecciono es:%c ",plan);
        
           
    }//fin del main
    
}
