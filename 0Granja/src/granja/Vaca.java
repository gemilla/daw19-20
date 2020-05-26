/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

/**
 *
 * @author GEMA
 */
public class Vaca {
    //atributos->definen el estado, las características
    //Encapsulación de datos->proteger los datos. Privado->getter o setter
    //Clase, atributos, constructores, getter/setter, métodos, toString
    private String etiqueta; //identificador
    protected static int id; //de clase!!!!!!!!!!!!!!!!!
    protected String nombre;
    private double kg; //Encapsulación de datos a nivel de atributos (private o protected)
    protected double litros; //producción día
    protected double altura; //(metros)
    
    //constructores 
    public Vaca(){
        id++;
        etiqueta = "v"+id;
        nombre = "Lola";
        kg = 400;
        litros = 20;
        altura = 1.5;
     }
    
    public Vaca(String etiqueta, String nombre, double kg, double litros, double altura){
        this.etiqueta = etiqueta;
        this.nombre = nombre;
        this.kg = kg;
        this.litros = litros;
        this.altura = 1.5;
    }
    
    public Vaca (String nombre, double kg, double litros, double altura){
        id++;
        etiqueta = "v"+id;    
        this.nombre = nombre;
        this.kg = kg;
        this.litros = litros;
        this.altura = altura;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    

    public  String getNombre() {
        return nombre;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        //String.format
        return "Vaca{" + "etiqueta=" + etiqueta + ", nombre=" + nombre + ", kg=" + kg + ", litros=" + litros + ", altura=" + altura + '}';
    }
    
    
    
    
}
