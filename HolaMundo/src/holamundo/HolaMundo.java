/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;
       
/**
 *
 * @author drmen
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Sensible a Mayusculas - Minisculas
        /*
        Objetiivo
        1.Imprimir pantalla 
        a.Diferentes formas parra imprimir en pantalla
        b.Caracteres de escape
        2. Captura de datos por parte del usuario
        */
        System.out.println("Holaa...Como estas?");
        System.out.println("Este es mi primer programa");                               
        System.out.println("Yujuuu...estoy con Java");  
        
        System.out.print("Angel Abbas");
        System.out.print(" Soy Estudiante de Ingenieria en informatica");
        System.out.print(" mucho gusto");
        
        System.out.printf("Esto es la clase de %s\n","programacion");
        //System.out.println("");
        
        System.out.printf("Esto es %s la clase de\n","programacion");
        //System.out.println("");
        
        System.out.printf("%s Esto es la clase de\n","programacion");
        
        System.out.printf("Hola\n como \n estas? \n en la clase  %s\n","Programacion");
        
         
         System.out.println("Estas aprendiendo?");
         
         //Variables
         int tiempo ; //Tipo Entero 
         double promedio;// tipo decimal 
         String nombre;// Tipo Cadena -> varios caracteres
         char inicial;// Tipo caracter -> letra, digitonumrico, simbolos especiales
         boolean estado;// tipo Booleano -> true, false
    
      tiempo = -3;
      nombre = "Angel";
      inicial= 'A';
      
        System.out.printf("Tu nombre es: %s\n",nombre);
        System.out.printf("%d veces a la semana recibes la clase \n",tiempo);
        System.out.printf("Te llamare %c incial",inicial);
             
    }// Fin de la funcion Main   
   
        
}// Fin de la clase hola mundo

