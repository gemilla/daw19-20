/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresafcts;



/**
 *
 * @author GEMA
 */
public abstract class Trabajador {
    protected String nombre;
    protected String NIF;
    protected String departamento;
    protected double sueldoBase;
    protected Fecha fecha;

    public Trabajador(String nombre, String NIF, String departamento, double sueldoBase, Fecha fecha) {
        this.nombre = nombre;
        this.NIF = NIF;
        this.departamento = departamento;
        this.sueldoBase = sueldoBase;
        this.fecha = fecha;
    }

    public Trabajador() {
        this.nombre = "nadie";
        this.NIF = "66662636";
        this.departamento = "ninguno";
        this.sueldoBase = 1400;
        this.fecha = new Fecha();
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public abstract double calcularSalario();
   
    
    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" + "nombre=" + nombre + ", NIF=" + NIF + ", departamento=" + departamento + ", sueldoBase=" + sueldoBase + ", fecha=" + fecha + '}';
    }
    
}
