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
public class Programador extends Trabajador{
    protected boolean experienciaPOO;
    protected StringBuilder lenguajes;

    public Programador(boolean experienciaPOO, StringBuilder lenguajes, String nombre, String NIF, String departamento, double sueldoBase, Fecha fecha) {
        super(nombre, NIF, departamento, sueldoBase, fecha);
        this.experienciaPOO = experienciaPOO;
        this.lenguajes = lenguajes;
    }

    public Programador(){
        super();
        this.experienciaPOO = true;
        this.lenguajes = new StringBuilder("JavaScript");
    
    }
  
    public boolean isExperienciaPOO() {
        return experienciaPOO;
    }

    public void setExperienciaPOO(boolean experienciaPOO) {
        this.experienciaPOO = experienciaPOO;
    }

    public StringBuilder getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(StringBuilder lenguajes) {
        this.lenguajes = lenguajes;
    }
    public double calcularSalario() {
        //return (experienciaPOO == true) ? sueldoBase + (sueldoBase * 0.20) : sueldoBase;
        double salario = sueldoBase;
        if (experienciaPOO == true)
            salario+=sueldoBase * 0.20;
        return salario;
    }
    
 @Override
    public String toString() {
        return super.toString()+ "experienciaPOO=" + experienciaPOO + ", lenguajes=" + lenguajes + '}';
    }
   
}
