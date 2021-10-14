package com.mesa10.ejercicio_egg.entidades;

/**
 *
 * @author Peral
 */
public class Perro {

    private String raza;
    private String nombre;
    private int edad;
    private String tamanio;

    public Perro() {
    }

    public Perro(String raza, String nombre, int edad, String tamanio) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }

    
}
