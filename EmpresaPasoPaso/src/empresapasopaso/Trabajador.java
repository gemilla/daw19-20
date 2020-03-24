/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresapasopaso;

/**
 *
 * @author GEMA
 */
public abstract class Trabajador {
    protected String nombre;
    protected String NIF;
    protected static int contNIF;
    protected String departamento;
    protected Fecha fecha;
    protected double sueldoBase;

    public Trabajador() {
        Trabajador.contNIF++;
        this.NIF = Trabajador.contNIF+String.valueOf((char)((int)(Math.random()*26)+65));
        //this.NIF = Trabajador.contNIF+"t";
        this.nombre = "Trabajador";
        this.departamento = "dpto";
        this.fecha = new Fecha();
        //el salario para los hijos pues son diferentes random
    }

    public Trabajador(String nombre, String departamento, Fecha fecha, double sueldoBase) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.fecha = fecha;
        this.sueldoBase = sueldoBase;
        Trabajador.contNIF++;
        this.NIF = Trabajador.contNIF+String.valueOf((char)((int)(Math.random()*26)+65));
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public static int getContNIF() {
        return contNIF;
    }

    public static void setContNIF(int contNIF) {
        Trabajador.contNIF = contNIF;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSalario();
    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", NIF=" + NIF + ", departamento=" + departamento + ", fecha=" + fecha + ", sueldoBase=" + sueldoBase + '}';
    }
    
}