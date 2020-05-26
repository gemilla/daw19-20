/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author GEMA
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {//Encapsulación, Etiqueta-static, estándar
        // TODO code application logic here
        
        /*Vaca vacaNicolas = new Vaca("Laura", 350, 5, 1.30);
        Vaca vacaRober = new Vaca ("03","María", 600,10,1.5);
        Vaca vacaIván = new Vaca ("Flora", 400, 20,1.4);
        Vaca vacaAlvaro = new Vaca("Luz", 500, 15,1.8);
        Vaca vacaGema = new Vaca();
        System.out.println(vacaIván.getEtiqueta());
        System.out.println(vacaNicolas.getEtiqueta());
        System.out.println(vacaRober.getEtiqueta());
        vacaNicolas.setKg(400);
        System.out.println("La vaca "+ vacaNicolas.nombre+ " ahora pesa "+vacaNicolas.getKg());
        */
        
       /* Vaca [] vacas = new Vaca[10];
        
        for (int i = 0; i < 10; i++) {
            
            vacas [i]= new Vaca("vaca"+i, Math.random()*300+300,Math.random()*16+5,Math.random()*100+100);
            System.out.println(vacas[i].nombre);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(vacas[i].toString());
        }*/
       
       Granja miGranja = new Granja();
       System.out.println(Arrays.toString(miGranja.rebaño));
       
       Granja miGranjaPersonalizada = new Granja(2);
       System.out.println(Arrays.toString(miGranjaPersonalizada.rebaño));
       
    }
    
}
