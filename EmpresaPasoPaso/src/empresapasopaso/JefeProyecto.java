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
public class JefeProyecto extends Trabajador {
    protected int personas;

    public JefeProyecto() {
        super();
        this.personas= 5;
    }

    public JefeProyecto(int personas, String nombre, String departamento, Fecha fecha, double sueldoBase) {
        super(nombre, departamento, fecha, sueldoBase);
        this.personas= personas;
    }
    
    public JefeProyecto(int personas, String NIF, String nombre, String departamento, Fecha fecha, double sueldoBase) {
        super(nombre, NIF, departamento, fecha, sueldoBase);
        this.personas= personas;
    }
    @Override
    public double calcularSalario() {
        return sueldoBase*(1+personas*0.05);
    }

    @Override
    public String toString() {
        return super.toString()+"personas=" + personas + '}';
    }
    
}
