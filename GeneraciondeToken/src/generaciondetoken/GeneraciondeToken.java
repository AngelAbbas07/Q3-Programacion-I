/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaciondetoken;

import java.util.Random;
import java.util.Scanner;

/**
 *Objetivos
 * 1.Utilizar el ciclo de repppeticion DO-While
 * 2.Uso de nuevas librerias 
 * a.random
 * 3.Uso de otras funciones de string
 * @author drmen
 */
public class GeneraciondeToken {

    /**
     * Desarrollar un algoritmo  que me permita registrar 
     * un dispositivo y generar un token para susesion
     * de validacion mientras se esta navegando con dicho dispotivo
  
     * Contexto del problema:
       Un sistema de gestión de red necesita registrar 
      nuevos enrutadores (routers) y asignarles una clave 
        de sesión única generada aleatoriamente. 
        
       Sin embargo, el canal de comunicación tiene "ruido",
       por lo que la generación de la clave no siempre 
       es constante.
     *  Parte 1: Registro de Nombre de Equipo
            a. Longitud de 8 caracteres
            b. Comenzar con RT o SW
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();//libreria para poder generar valores de manera automatica 
        Scanner sc= new Scanner(System.in);
                
       String nombredeEquipo=("");
    
        System.out.println("Ingresa el nombre de tu Equipo");
        nombredeEquipo= sc.nextLine().toUpperCase();
        
        //variables boolean
        
        boolean longitudcorrecta = true;
        boolean prefijoCorrecto = true;
        boolean isvalido = true;
        String token = "";
        int TipoCaracter = 0;
        int numerotoken = 0;
        char letratoken = '@';
        
        do{
        if(nombredeEquipo.length()==8){
            longitudcorrecta= true;
        }else{
            longitudcorrecta = false;
        }//fin del else
        
        prefijoCorrecto=(nombredeEquipo.startsWith("RT"))||nombredeEquipo.startsWith("SW");
        //System.out.println(longitudcorrecta);
        //System.out.println(prefijoCorrecto);
        
        isvalido = longitudcorrecta  && prefijoCorrecto;
        }while(!isvalido);
        System.out.println("Registro Correcto");
        
      while(token.length()<12){
          TipoCaracter = rd.nextInt(2);
          
          if(TipoCaracter==0){
              numerotoken = rd.nextInt(10);
              token = token + numerotoken;
          }//fin del if 
          else{
              letratoken = (char)(rd.nextInt(26)+65);
              token= token + letratoken;
              
          }
          
      }//Fin de while genrando token
        System.out.printf("token: %s",token);
        
        
        
    
    }//Fin del main
    
}
