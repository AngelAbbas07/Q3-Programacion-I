/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estado.de.clase;


import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class EstadoDeClase {

    /**
     * 1. Conocer las estructura de seleccion 
     *      a. Toma de Decision Simple
     *      b. Toma de Decision Doble
     *      c. Decisiones numericos y caracteres/cadenas
     */
    
    /*
        Se necesita desarrollar un algoritmo que determine si un bote
    de agua de 500 mL 
        a. esta arriba de la mitad. (Dato Numerico)
        b. contiene agua o no       (Dato de Caracter)
        c. Es amigable con el ambiente (Dato de Cadena)
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Conociendo la Estructura
        /*
            1. Palabra Clave "if" y/o "else"
            2. El grupo de instrucciones se encierra entre { }
            3. No se usa ";" para los bloques.
            4. La condicion es una comparacion bajo cualquiera de los siguientes 
                elementos:
                a. <        menor
                b. >        mayor
                c. <=       menor o igual
                D. >=       MAYOR O IGUAL
                e. ==       igual (uso de 2 signos iguales)
                i. !=       Distinto (signos pegados)
        */
        int cantidadAgua = 0;
        char respuesta = '@';
        String respuestaAmbiente = "John Doe";
        
        System.out.println("El bote es de 500 mL");
        System.out.print("Cuanto liquido dices que contiene? ");
        cantidadAgua = input.nextInt();
        
        if(cantidadAgua >= 250){
            //Condicion es VERDADERO
            System.out.println("Si, tiene mas de mitad");
            System.out.println("Te lo puedes beber!!!");
            System.out.println("No nos quedamos sin nada..hay suficiente");
        }
        input.nextLine();//Limpieza de Buffer
        
        System.out.println("");
        System.out.println("El liquido que contiene es H20? (a=Si, b=no)");
        respuesta = input.nextLine().charAt(0);
        System.out.printf("%c \n",respuesta);
        /*
        System.out.println("El liquido que contiene es H20? (a=Si, b=no)");
        respuesta = input.nextLine().charAt(1);
        System.out.printf("%c \n",respuesta);
        
        System.out.println("El liquido que contiene es H20? (a=Si, b=no)");
        respuesta = input.nextLine().charAt(2);
        System.out.printf("%c \n",respuesta);
        */
        if(respuesta == 'a'){
            //Condicion Verdadero
            System.out.println("""
                               Si es agua lo que contiene
                               No es otra cosa....nada embriagante.!!
                               """);
        }
        else{
            //Condicion Falsa
            System.out.println("""
                               UY uy UY
                               Que sera?...
                               """);
        }
        
        System.out.printf("\nEse bote que contiene %d mL",cantidadAgua);
        System.out.println("\nEs amigable con el ambiente?");
        respuestaAmbiente = input.nextLine();
      /*
        System.out.printf("Dato de Variable: %s",respuestaAmbiente);
        
        System.out.println("Seguro?");
        respuestaAmbiente = input.nextLine().toUpperCase();
        System.out.printf("Dato de Variable: %s",respuestaAmbiente);
        
        System.out.println("100% Seguro?");
        respuestaAmbiente = input.next().toLowerCase();
        System.out.printf("Dato de Variable: %s",respuestaAmbiente);
        */
        if(respuestaAmbiente.equals("Si")){
            System.out.println("Es amigable");
        }
        else{
            System.out.println("no es nada amigable");
        }
    
    }
    
}
