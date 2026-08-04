/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donacionsangre;

import java.util.Scanner;

/**
 *
 * @author oscar
 * Objetivos
 * 1. Estructura de Seleccion Anidadas
 * 2. Operadores Booleanos
 *      a. AND  &&
 *      b. OR   ||
 *      c. NOT  !
 * 3. Operacion Ternaria 
 */
public class DonacionSangre {

    /**
     * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
     * y peso (Mas de 110 lbs). 
     * Si se llega a cumplir los criterios antes expuestos, solo
     * se podra donar sangre si ha comido.
     * 
     * Otro elemento que se tiene que considerar para poder donar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los 
     * niveles adecuados.
     * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int edad = 0;
        int peso = 0;
        boolean haDesayunado = true;
        char respuesta = '@';
        int nivelHierro = 0;
        String genero = "John Doe";
        
        System.out.print("Cual es su edad: ");
        edad = input.nextInt();
        System.out.print("Cual es su peso: ");
        peso = input.nextInt();
        
        if(edad>=18 && edad<=65 && peso>=110){
            System.out.println("Tienes los parametros fisicos");
            System.out.print("Has desayunado? Si/No");
            respuesta = input.next().charAt(0);
            
            if(respuesta == 'S' || respuesta =='s'){
                System.out.println("Si puedes donar sangre");
                haDesayunado = true;
            }
            else{
                System.out.println("Tienes que comer antes");
                haDesayunado = false;
            }
        }//Fin del IF EDAD
        else{
            System.out.println("No se puede donar sangre");
        }
        
        System.out.println("");
        System.out.print("Dime tu nivel de hierro: ");
        nivelHierro = input.nextInt();
        input.nextLine();
        System.out.print("Masculino o Femenino: ");
        genero = input.nextLine().toUpperCase();
        
        if((nivelHierro>=14 && genero.equals("MASCULINO"))){
            System.out.println("Si se puede donar sangre");
        }
        else{
            System.out.println("no se puede donar sangre");
        }
        
        //AND && (Y)
        /*
            Semana Morazanica
           
              Dinero      Tiempo      Resultado
                SI(V)       SI (V)      SALES       (V)
                SI(V)       NO (F)      NO SE SALE  (F)
                NO(F)       SI (V)      NO SE SALE  (F)
                NO(F)       NO (F)      NO SE SALE  (F)
        */
        
        //OR    || (O)
        /*
            Comida del FoodCourt del Molote
        
            Hamburguesa     Pasta       Resultado
                Si(V)       Si(V)       LOGRA COMER (V)
                Si(V)       No(F)       LOGRA COMER (V)
                No(F)       Si(V)       LOGRA COMER (V)
                No(F)       No(F)       NO LOGRA COMER (F)
        */
        
        //NOT ! (Negacion / Opuesto)
        
        /*
            SI TE GUSTA LA CLASE        RESULTADO
            SI(V)                       No(F)
            No(F)                       Si(V)
        */
    
    }
    
}
