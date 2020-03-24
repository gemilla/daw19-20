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
public class Empresa {

    protected Trabajador[] trabajadores;

    public Empresa() {
        trabajadores = new Trabajador[10];
        for (int i = 0; i < trabajadores.length; i++) {
            StringBuilder sb = new StringBuilder("JAVA;PHYTON");
            if (i < 5) {
                trabajadores[i] = new Programador(true, sb, "TESTER", "IT", new Fecha(),Math.random()*500+1000);
            } else {
                trabajadores[i] = new JefeProyecto(i*5,"TESTER_JEFE", "dpto", new Fecha(),Math.random()*500+1500);
            }
        }
    }

    public Empresa(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }

    /*
2 Añadir trabajador. Permitir añadir tanto programador como jefe de proyecto. Los datos se cargarán mediante E/S. dentro del método. El método devolverá el trabajador construido que será introducido en la empresa siempre que haya hueco, mediante otro método que recibirá el animal como argumento de entrada. (1p)
3 Consulta de trabajadores. Listar, a partir del departamento, los trabajadores que haya en la empresa. El dpto. será introducido como argumento de entrada al método. (0,5p)
4 Actualizar salario de un trabajador a partir de su NIF que será introducido como argumento de entrada al método. (0,75p)
5 Actualizar las personas que tiene a su cargo un jefe de proyecto identificado por su por nombre y recibido como argumento de entrada. El método devolverá un booleano informando de si se ha realizado la actualización o no. (0,75p)
6 Eliminar trabajador con determinado nombre y departamento. . El método, dentro de su implementación, preguntará el nombre y el departamento al que pertenece el trabajador a eliminar.(0,75p)
7 Calcular y mostrar el listado del salario real de los trabajadores de un determinado departamento así como el salario total percibido por todos los integrantes del dtpo. (1p)
8 Mostrar los empleados de la empresa ordenados por salario base (1p)*/
    public void listarTrabajadores() {
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println(trabajadores[i]);
        }
    }

    public static Trabajador crearTrabajador() {
        Trabajador trabajador = null;
        return trabajador;
    }

    public void insertarEmpresa(Trabajador trabajador) {
        boolean introducido = false;
        for (int i = 0; i < trabajadores.length && introducido == false; i++) {
            if (trabajadores[i] != null) {
                trabajadores[i] = trabajador;
                introducido = true;
            }
            if (introducido) {
                System.out.println("El trabajador ha sido contratado por la empresa");
            } else {
                System.out.println("No hay sitio");
            }

        }
    }

    @Override
    public String toString() {
        return "Empresa{" + "trabajadores=" + trabajadores + '}';
    }

    public void consultaPorDepartamento(String dpto) {
        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null && trabajadores[i].departamento.equalsIgnoreCase(dpto)) {
                System.out.println(trabajadores[i]);
            }
        }
    }

}
