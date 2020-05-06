/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3binarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author GEMA
 */
public class Censo implements Serializable {

    protected Individuo[] censo;

    public Censo(Individuo[] censo) {
        this.censo = censo;
    }

    public Censo() {
        //primera ejecución
        censo = new Individuo[10];
        for (int i = 0; i < censo.length - 3; i++) {//huecos para altas
            censo[i] = new Individuo((int) (Math.random() * 100), "individuo" + (i + 1), "provincia" + (i % 3));
        }
        //sucesivas, carga de fichero
        //censo =GestorFicheros.leerFicheroBinario(GestorFicheros.FICHERO_BINARIO);
    }

    public Individuo[] getCenso() {
        return censo;
    }

    public void setCenso(Individuo[] censo) {
        this.censo = censo;
    }

    public void listar() {
        for (int i = 0; i < censo.length; i++) {
            if (censo[i]!= null)
                System.out.printf(censo[i].toString());
        }
    }

    public void alta() throws IOException {
        boolean alta=false;
        for (int i = 0; i < censo.length&&!alta; i++) {
            if (censo[i] == null) {
                censo[i] = Alta();
                alta=true;
            }
        }
    }

    public static Individuo Alta() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce edad, nombre,poblacion");
        return new Individuo(Integer.parseInt(br.readLine()), br.readLine(), br.readLine());

    }
    public void mostrar(String nombre){
        for (int i = 0; i < censo.length; i++) {
            if ((censo[i]!= null)&&(censo[i].nombre.equalsIgnoreCase(nombre)))
                System.out.println(censo[i]);
            
        }
    }
    public void mostrarPoblacion(String poblacion){
       for (int i = 0; i < censo.length; i++) {
            if ((censo[i]!= null)&&(censo[i].poblacion.equalsIgnoreCase(poblacion)))
                System.out.println(censo[i]);
            
        }
    }
    public void mostrarMayores(int edad){
       for (int i = 0; i < censo.length; i++) {
            if ((censo[i]!= null)&&(censo[i].edad>edad))
                System.out.println(censo[i]);
            
        }
    }
    public void actualizarPoblacion (String nombre, String poblacion) throws IOException{
       for (int i = 0; i < censo.length; i++) {
            if ((censo[i]!= null)&&(censo[i].nombre.equalsIgnoreCase(nombre))){
                System.out.println(censo[i]); 
                censo[i].poblacion=poblacion;
            }
            
        }
    
    
    }
            
    @Override
    public String toString() {
        return "Censo{" + "censo=" + Arrays.toString(censo) + '}';
    }

}
