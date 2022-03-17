/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import Caracteristicas.Autor;
import Caracteristicas.Editorial;

/**
 *
 * @author abner
 */
public class Libro {
    private String Portada;
    private String Color;
    private float Peso;
    private String Hojas;
    private float Anchura;   
    private Autor Nombre;
    private Editorial Informa;

    public Libro() {
    }

    public Libro(String Portada, String Color, float Peso, String Hojas, float Anchura, Autor Nombre, Editorial Informa) {
        this.Portada = Portada;
        this.Color = Color;
        this.Peso = Peso;
        this.Hojas = Hojas;
        this.Anchura = Anchura;
        this.Nombre = Nombre;
        this.Informa = Informa;
    }

    public Editorial getInforma() {
        return Informa;
    }

    public void setInforma(Editorial Informa) {
        this.Informa = Informa;
    }

    public String getPortada() {
        return Portada;
    }

    public void setPortada(String Portada) {
        this.Portada = Portada;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public String getHojas() {
        return Hojas;
    }

    public void setHojas(String Hojas) {
        this.Hojas = Hojas;
    }

    public float getAnchura() {
        return Anchura;
    }

    public void setAnchura(float Anchura) {
        this.Anchura = Anchura;
    }

    public Autor getNombre() {
        return Nombre;
    }

    public void setNombre(Autor Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Libro{" + "Portada=" + Portada + ", Color=" + Color + ", Peso=" + Peso + ", Hojas=" + Hojas + ", Anchura=" + Anchura + ", Nombre=" + Nombre + ", Informa=" + Informa + '}';
    }
    
    
}
