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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Empresa empresa= new Empresa();
    empresa.listarTrabajadores();
    empresa.insertarEmpresa(Empresa.crearTrabajador());
    empresa.listarTrabajadores();
    empresa.consultaPorDepartamento("dpto");
    }
    
}
