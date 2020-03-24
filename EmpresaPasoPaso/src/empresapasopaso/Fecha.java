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
public class Fecha {
    protected int dia;
    protected int mes;
    protected int anyo;
    
    public Fecha() { 
        this.dia = (int) ((Math.random() * 30) + 1);
        this.mes = (int) ((Math.random() * 12) + 1);
        this.anyo = (int) ((Math.random() * 100) + 1950);
    }
    
    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anyo=" + anyo + '}';
    }
    public String convertidorFormato(){
        return String.format("%02d/%02d/%02d", dia,mes,anyo );
    }
}
