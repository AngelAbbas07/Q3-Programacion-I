/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulaciondetrayectoriabalistica;

import java.util.Scanner;

/**
 *Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la
velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula
correspondiente a la trayectoria.
* 
• Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente
entre 1 y 89 grados.
* 
• Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del
proyectil (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el
segundo 𝑡 = 10.
* 
• Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el
proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser
negativa (lo que significa que ya impactó el suelo, momento en el cual el ciclo debe
romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática.
 * @author drmen
 */
public class SimulaciondeTrayectoriaBalistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        double velocidad = 0;
        int angulo =0;
        double altura =0;
        
        
        
        System.out.println("Ingrese la velocidad inicial en m/s");
        velocidad = sc.nextDouble();
    
        
        
        System.out.println("Ingrese  el angulo en grados");
        angulo = sc.nextInt();
        
        if (velocidad >0 && angulo >1 && angulo <89){
            
        }else{
            System.out.println(" Eror! la velocidad inicial debe ser mayor a 0 y el angulo debe estar estrictamente\n" +
"entre 1 y 89 grados.");
            return;
        }
        
        double anguloRad = Math.toRadians(angulo);
        double iMax = (velocidad * Math.sin(anguloRad))/ (9.8);
        
        for (int i = 1; i <=10; i++){
        altura = velocidad *Math.sin(anguloRad) * i -(0.5)* 9.8* i * i;   
            System.out.printf("\n La altura del proyectil es de: %.2f metros",+ altura);
        if(i==Math.round(iMax)){
            System.out.println("\n En el segundo:");
            System.out.println(i);
            System.out.println(" Ha llegado a su altura maxima");
            
            
        }else if (altura <0){
            System.out.println("""
                               \n Altura negativa proyectil impactando 
                               El proyectil ha impactado!!
                               """);
           break;
        }
        
        }
        
        
        
    }//fin del main
    
}
