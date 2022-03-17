/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caracteristicas;

/**
 *
 * @author abner
 */
public class Autor {
    private String Nombre;
    private String Sexo;
    private int Edad;

    public Autor() {
    }

    public Autor(String Nombre, String Sexo, int Edad) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Edad = Edad;
        
        
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
        
        
        
    }

    @Override
    public String toString() {
        return "Autor{" + "Nombre=" + Nombre + ", Sexo=" + Sexo + ", Edad=" + Edad + '}';
    }
    
    
}
