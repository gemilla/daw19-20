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
public class Programador extends Trabajador{
    protected boolean experienciaPOO;
    protected StringBuilder lenguajes;

    public Programador() {
        super();
        this.experienciaPOO = true;
        this.lenguajes = new StringBuilder("Java;C##");
    }

    public Programador(boolean experienciaPOO, StringBuilder lenguajes, String nombre, String departamento, Fecha fecha, double sueldoBase) {
        super(nombre, departamento, fecha, sueldoBase);
        this.experienciaPOO = experienciaPOO;
        this.lenguajes = lenguajes;
    }
    
    public Programador(boolean experienciaPOO, String NIF, StringBuilder lenguajes, String nombre, String departamento, Fecha fecha, double sueldoBase) {
        super(nombre, NIF,departamento, fecha, sueldoBase);
        this.experienciaPOO = experienciaPOO;
        this.lenguajes = lenguajes;
    }
    
    public String mostrarExperiencia(){
        return (experienciaPOO == true) ? "SI" : "NO";
    }
    
    @Override
    public double calcularSalario() {
        return (experienciaPOO == true) ? sueldoBase + (sueldoBase * 0.20) : sueldoBase;
    }
    @Override
    public String toString() {
        return super.toString()+"Experiencia en POO:"+ mostrarExperiencia()+ lenguajes.toString();
    }
}
