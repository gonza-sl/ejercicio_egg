/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mesa10.ejercicio_egg.entidades;

/**
 *
 * @author gonza
 */
public class Gato {
    private long id;
    private String nombre;
    private String raza;
    private String duenio;

    public Gato() {
    }

    public Gato(long id, String nombre, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    @Override
    public String toString() {
        return "Gato{" + "id=" + id + ", nombre=" + nombre + ", raza=" + raza + '}';
    }
    
    
}
