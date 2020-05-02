/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocolecciones;

import java.io.Serializable;

/**
 *
 * @author GEMA
 */
public class Individuo implements Serializable,Comparable<Individuo>{
    protected int edad;
    protected String nombre;
    protected String poblacion;

    public Individuo(int edad, String nombre, String poblacion) {
        this.edad = edad;
        this.nombre = nombre;
        this.poblacion = poblacion;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return String.format("%15s %4d %15s\n",nombre, edad, poblacion);
    }

     public String toStringFichero() {
        return edad + ";" + nombre + ";" + poblacion;
    }

    @Override
    public int compareTo(Individuo t) {
        return this.nombre.compareToIgnoreCase(t.nombre);
    }
    
}
