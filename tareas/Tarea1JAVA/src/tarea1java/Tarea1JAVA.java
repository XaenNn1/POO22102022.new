/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1java;

import Caracteristicas.Autor;
import Caracteristicas.Editorial;
import Libro.Libro;

/**
 *
 * @author abner
 */
public class Tarea1JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro Lib = new Libro ();
        Lib.setPortada("\tSi tiene");
        Lib.setColor("Rojo");
        Lib.setPeso(12);
        Lib.setHojas("139 Hojas");
        Lib.setAnchura(15);
       // Lib.setNombre("Aventuras");
        //Lib.setInforma(Informa);
        
        
        Autor AU= new Autor();
        AU.setNombre("Abner");
        AU.setEdad(18);
        AU.setSexo("Maculino");
        
        
        Editorial ED = new Editorial();
        ED.setNombre("UMAM");
        ED.setColor("AZUL Y DORADO");
        
        System.out.println(ED);
        System.out.println(Lib);
        System.out.println(AU);
        
    }
    
}
