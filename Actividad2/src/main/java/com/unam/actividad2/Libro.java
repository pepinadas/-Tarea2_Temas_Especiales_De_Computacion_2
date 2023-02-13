/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unam.actividad2;

/**
 *
 * @author angel
 */
public class Libro {

    private int id;
    private String nombre;
    private String editorial;
    private int numPag;
    private String autor;
    
    
    
    public Libro(int id, String nombre, String editorial, int numPag, String autor) {
        this.id = id;
        this.nombre = nombre;
        this.editorial = editorial;
        this.numPag = numPag;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", nombre=" + nombre + ", editorial=" + editorial + ", numPag=" + numPag + ", autor=" + autor + '}';
    }
    
    
    
    
}
