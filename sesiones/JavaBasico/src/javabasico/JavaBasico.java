/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.lang.*;
// VIENE STRING , LO QUE USAMOS, SIEMPRE ESTA POR DEFECTO
/**
 *
 * @author abner
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad=22;
        Integer edad2 = new Integer (2);
        float x = edad2.floatValue();
        System.out.println(x);
        String dias = "23";
        System.out.println((dias +3 ));
        int temp = Integer.parseInt(dias); //convierte cadena de datos a tipo entero
        
        edad2.parseInt("33");
        
        System.out.println("Dias = " + (temp +3));
        
        Perro dog1 = new Perro("Labrador", 1);
        Perro dog2 = new Perro("Labrador", 1);
        Perro dog3 = new Perro("Labrador", 1);
        System.out.println(dog1 );
        System.out.println(Perro.cola );
        System.out.println(dog1.cola);
        
        Perro.ladrar();
        dog1.ladrar();
        
        String cad1 = "Hola ";
        String cad2 = "Mund0 ";
        String cad3 = cad1 + cad2; 
        System.out.println(cad3);
        System.out.println("Edad: " + edad + " años");
        
        String res = "";
        edad = 15;
        if (edad >= 18){
            res = "Mayor de Edad";
        }else{
            res = "Menor de edad, a mimir";
        }
            System.out.println("Eres : " + res);
            
            System.out.println("---------- TERNARIO ");
            res = (edad>=18)?"Mayor de edad":"Menor de edad bro, haga la tarea";
            System.out.println("Eres : " + res);
            
             int  val1 = 7;
             int  val2 = 2;
             System.out.println( val1 | val2);
             System.out.println( val1 & val2);
        /*
        val1 = 000...0001
        val2 = 000...0010
       ------------------
               000...0010 - 2 DECIMALES
             
             // Desplazamientoa nivel de bits
        */
            int val3 = 1; // 000...0001
            int val4 = val3<<1; // DESPLAZAR LOS BITS UNA POSICION A LA IZQ
                                // 000...0010
            System.out.println(val4);
            val4 = val4<<1;
            System.out.println(val4);
            
            
            System.out.println("-----ARREGLOS----");
            int [] edades ; // Aqui se declara
            int [] edades2 = new int [5]; // se declara y reserva memoria
            int [] edades3 = {22,21,18,19,18}; // Se declara, reserva e inicializa
            
            edades2[0]=33;
            System.out.println( edades2[0]); // 33
            System.out.println( edades2[1]); // 0
            // IMPRIMIR EDADES ACA
            System.out.println("Edades 3 a mano ajsjajsjjas");
            System.out.println(edades3[0]);
            System.out.println(edades3[1]);
            System.out.println(edades3[2]);
            System.out.println(edades3[3]);
            System.out.println(edades3[4]);
            //AHORA CONVINADO CON FOR
            System.out.println("Automatizado , te amo charles leclerc");
            for (int i = 0; i < edades3.length; i++) {
                System.out.println(edades3[i]);
                /*
           System.out.println("orden inverso ");
            for (int i = edades3.length-1; i >= 0; i--) {
            System.out.println(edades3[i]);
        }
        
        System.out.println("eades a 18");
        for (int i = 0; i < edades3.length; i++) {
            edades3[i] = edades3[2];
            System.out.println(edades3[i]);**/
                
        // FOR each es un for especial, introducido en la version 2
        // el objetivo del For Each es simplificar la forma de recorrer arreglos
        // fore + TAB
        
                System.out.println("C   on FOR EACH");  
                for (int ed : edades3) {
                    System.out.println(ed);
                    
                }
                
                // lo comparamos vs el original
                 System.out.println("Automatizado , te amo charles leclerc");
                 //ERORRRRR//for (int i = 0; edades3.length ; i++) {
                System.out.println(edades3[i]);
                 }
                 /*
                 El for each lo seguiremos usando
                 
                 */
                 
                 System.out.println("Arreglo de la clase perro");
                 
                 Perro [] lista = new Perro [3];
                 lista [0] = new Perro("Poddle", 1 );
                 lista [1] = new Perro("Labrador", 3 );
                 lista [2] = new Perro("Akita", 2 );
                 // fore + TAB
                 for (Perro perro : lista) {
                      perro.comer();
                 }
                     System.out.println("Todos los perros a Doverman");
                     for (Perro perro : lista) {
                         perro.setRaza("Doverman"); 
                     }
                     
                     //Volvamos a imprimir la lista
                     for (Perro perro : lista) {
                          System.out.println(perro);
            }
          }
        
        
    
    
}
