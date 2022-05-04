/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2210parte2;

import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.Figura;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author abner
 */
public class JavaBasico2210Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado c= new Cuadrado(4.0f,4.0f);
        Circulo cir = new Circulo(5.0f);
        System.out.println(c.calcularArea());
        System.out.println(cir.calcularArea());
        
        Scanner teclado = new Scanner(System.in  );
        System.out.println("1. Cuadrado, 2. Circulo, 3. Triangulo, 4. Rectangulo  ");
        int opcion = teclado.nextInt();
        switch (opcion) {
            //Aquiu para no poner 1, 2, 3, 4 se sustitutye por la figura
            case Figura.CUADRADO:
                System.out.println(c.calcularArea());
                break;
            case Figura.CIRCULO:
                System.out.println(cir.calcularArea());
                break;
            case Figura.TRIANGULO: 
               //AREA TRIANGULO
                break;
            case Figura.RECTANGULO:
                //AREA RECTANGULO
                break;
            default:
                System.out.println("Opcion No valida");
        }
        
        JOptionPane.showMessageDialog(null, "Hola", "El Titulo", JOptionPane.INFORMATION_MESSAGE);
        EstudianteDeportistaArtista eda= new EstudianteDeportistaArtista();
        eda.setNombre("Daniela");
        eda.entrenar();
        eda.ensayar();
        eda.comer();
        //Color color = new Color(Color.GREEN);
       // Color miColor = new Color()
        
    }
    
}
