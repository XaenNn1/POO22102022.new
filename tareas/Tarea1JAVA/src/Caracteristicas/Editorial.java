/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caracteristicas;

/**
 *
 * @author abner
 */
public class Editorial {
    private String Nombre;
    private String Color;

    public Editorial() {
    }

    public Editorial(String Nombre, String Color) {
        this.Nombre = Nombre;
        this.Color = Color;
        
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
        
        
        
       
    }

    @Override
    public String toString() {
        return "Editorial{" + "Nombre=" + Nombre + ", Color=" + Color + '}';
    }
    
    
  }
    

