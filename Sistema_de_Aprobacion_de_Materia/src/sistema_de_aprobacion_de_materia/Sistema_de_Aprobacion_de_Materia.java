/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_de_aprobacion_de_materia;

import java.util.Scanner;

/**
 *Se tiene que escribir un programa que solicite al usuario el nombre del estudiante (tipo string) y las
calificaciones obtenidas en dos exámenes parciales (tipo double). El programa debe calcular el
promedio final. Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando que el
estudiante está "Aprobado". De lo contrario, debe mostrar "Reprobado".
Requisito estricto: Solo puedes usar una estructura if/else simple.
 * @author drmen
 */
public class Sistema_de_Aprobacion_de_Materia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String nombreEstudiante = "";
        double calificacion1 = 0;
        double calificacion2 = 0;
        int resultado = 0;
        
        System.out.println("Ingrese su nombre completo");
        nombreEstudiante = sc.nextLine();
        System.out.printf("Ingrese la calificacion del primer parcial");
        calificacion1 = sc.nextDouble();
        System.out.printf("Ingrese la calificacion del segundo parcial");
        calificacion2 = sc.nextDouble();
        
       resultado = (int) (calificacion1 + calificacion2  /2);
        
        if(resultado>=65.0)
            System.out.println("APROBADO");
        
        else{
            System.out.println("REPROBADO");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
