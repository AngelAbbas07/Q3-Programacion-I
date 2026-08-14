/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensoresdetemperatura;

import java.util.Scanner;

/**
 *
 * @author drmen
 */
public class SensoresdeTemperatura {

    /**Análisis de Sensores de Temperatura (Uso While)
     * 
Desarrolla un programa que lea repetidamente las temperaturas (en grados centígrados)
registradas por un sensor industrial. El programa debe detenerse cuando el usuario ingrese el valor
centinela −999.
* 
• Validación: La temperatura absoluta más baja posible es el cero absoluto (−273.15 °𝐶). Si
el usuario ingresa un valor menor a este (que no sea el centinela), el programa debe
mostrar un error usando una estructura if-else y no tomarlo en cuenta para los cálculos.
* 
• Operación: Al finalizar, el programa debe imprimir el promedio de las temperaturas válidas
ingresadas y la diferencia térmica entre la temperatura más alta y la más baja leída.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        final double CENTINELA = -999;
        final double CEROABSOLUTO = -273.15;
        double gradosCentigrados = 0;
        double tempMax = -9999;
        double tempMin = 9999;
        double suma =0;
        double contador =0;
        double promedio=0;
        double diferenciaTermica =0;
        
        System.out.println("Ingrese el centinela para salir con valor -999");
        System.out.println("Ingrese la temperatura");
        gradosCentigrados = sc.nextDouble();
        while(gradosCentigrados != CENTINELA){
            
            
            if(gradosCentigrados< CEROABSOLUTO ){
                System.out.println("Error de temperatura");
                
            }else{
              suma += gradosCentigrados;
              contador++;
                      
             if(gradosCentigrados> tempMax ){
                tempMax = gradosCentigrados;
             }
             if(gradosCentigrados < tempMin){
               tempMin = gradosCentigrados;
             }
            }
            System.out.println("Ingrese la temperatura");
            gradosCentigrados= sc.nextDouble();
            
        }
        
        if(contador== 0){
            System.out.println("Temperatura no valida");
        }
        else{
        promedio = (suma / contador);
        System.out.printf("El promedio de las temperaturas ingresadas es de: %.2f",promedio);
        
        diferenciaTermica = (tempMax - tempMin);
            System.out.printf("\nLa diferencia termica que existe es de: %.2f",diferenciaTermica);
              }
    }//FIN DEL MAIN
    
}
