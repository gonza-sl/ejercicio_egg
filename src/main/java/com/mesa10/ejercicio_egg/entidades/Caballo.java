package com.mesa10.ejercicio_egg.entidades;

import java.util.ArrayList;

        
/* @author P_Arabel_C */
public class Caballo {

    private long id;
    private String nombre;
    private String raza;
    private int edad;
    private String pelaje;
    private ArrayList<carrera> carreras;

    public Caballo() {
    }

    public Caballo(long id, String nombre, String raza, int edad, String pelaje, ArrayList<carrera> carreras) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.pelaje = pelaje;
        this.carreras = carreras;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public ArrayList<carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return "Caballo{" + "id=" + id + ", nombre=" + nombre + ", raza=" + raza + ","+ 
                "\n edad=" + edad + ", pelaje=" + pelaje + ", carreras=" + carreras + '}';
    }
   
    
            
}
