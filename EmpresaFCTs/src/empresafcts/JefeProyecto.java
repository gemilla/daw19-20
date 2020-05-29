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
public class JefeProyecto extends Trabajador {
    protected int personas;

    public JefeProyecto(int personas, String nombre, String NIF, String departamento, double sueldoBase, Fecha fecha) {
        super(nombre, NIF, departamento, sueldoBase, fecha);
        this.personas = personas;
    }
    public JefeProyecto() {
        super();
        this.personas = 5;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return super.toString() + "personas=" + personas + '}';
    }

    @Override
    public double calcularSalario() {
        return sueldoBase*(1+personas*0.01);
    }

}
    