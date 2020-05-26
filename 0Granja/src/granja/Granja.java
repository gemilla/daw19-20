/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.util.Scanner;

/**
 *
 * @author GEMA
 */
public class Granja {
    protected Vaca[] rebaño;//protected animal[] rancho; //animal Vaca, Oveja, Gallina
    
    public Granja(){
        rebaño = new Vaca[3];
        for (int i = 0; i < rebaño.length; i++) {
            rebaño[i] = new Vaca();
        }
        
    
    }
    
    public Granja(int tamanyo){
        rebaño = new Vaca[tamanyo];
        for (int i = 0; i < rebaño.length; i++) {
            rebaño[i] = dameVaca();
        }
        
    
    }
    
    public static Vaca dameVaca (){
        Scanner lector = new Scanner(System.in);
        //Vaca (String nombre, double kg, double litros, double altura){
        System.out.println("Introduce nombre de la vaca, peso, libros, altura");
        Vaca aux = new Vaca(lector.nextLine(),lector.nextDouble(),lector.nextDouble(),lector.nextDouble());
        return aux;
    }
    
    public void consultarVacas(){}//listado de los litros que producen las vacas
    public void ordenarVacas(){}// Arrays.sort->compareTo()->kg!!!!
    public void eliminarVaca(String etiqueta){}
    public void eliminarVaca(double litros){} //< introducida por el usuario
    public void agregarVaca(Vaca aux){}
    public void agregarVaca(){}
    public void listarVacas(){}
    //Modelo inventado (Clase ->un objeto, Clase -> [] de ese objeto, 
    //clase con menú o directamente el menú Tester
}
