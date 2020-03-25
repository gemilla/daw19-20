/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresapasopaso;

import java.util.Scanner;

/**
 *
 * @author GEMA
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Faltaría hacer el menú
        /*StringBuilder asdf=new StringBuilder("Java");   
       asdf.append(";C##");
       System.out.println(asdf);
       String trozos[]= asdf.toString().split(";");
        System.out.println(trozos.length);
        
         */
        Scanner lector= new Scanner(System.in);
        Empresa empresa = new Empresa(20);
        empresa.listarTrabajadores();
        /*Trabajador trabajador = Empresa.crearTrabajador();
        if (trabajador != null) {
            empresa.insertarEmpresa(trabajador);
        }
        empresa.listarTrabajadores();
        System.out.println("-------------------------------------");
        empresa.consultaPorDepartamento("dpto");
        System.out.println("Dime NIF");
        empresa.actualizarSalario(lector.nextLine());*/
        empresa.listarTrabajadores();
        System.out.println("-------------------------------------");
        if (empresa.actualizarPersonas("TESTER_JEFE", 30))
            System.out.println("Cambio actualizado con éxito");
        else
            System.out.println("No se ha encontrado dicho trabajador");
         empresa.listarTrabajadores();
         empresa.calcularSalario("dpto");
    }

}
