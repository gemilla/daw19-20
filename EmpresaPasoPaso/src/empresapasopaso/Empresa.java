/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresapasopaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

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
                trabajadores[i] = new Programador(true, sb, "TESTER", "IT", new Fecha(), Math.random() * 500 + 1000);
            } else {
                trabajadores[i] = new JefeProyecto(i * 5, "TESTER_JEFE", "dpto", new Fecha(), Math.random() * 500 + 1500);
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
        Scanner sc = new Scanner(System.in);
        System.out.println("¿PROGRAMADOR O JEFE DE PROYECTO?");
        String op = sc.nextLine().toUpperCase();
        if (op.equals("PROGRAMADOR") || op.equals("JEFE DE PROYECTO")) {
            System.out.print("NOMBRE: ");
            String nombre = sc.nextLine().toUpperCase();
            System.out.print("NIF: ");
            String nif = sc.nextLine().toUpperCase();
            System.out.print("DEPARTAMENTO: ");
            String departamento = sc.nextLine().toUpperCase();
            System.out.println("Introduzca fecha(dia mes año)");
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            int anyo = sc.nextInt();
            System.out.println("Introduzca sueldo");
            double sueldo = sc.nextDouble();
            sc.nextLine();
            if (op.equals("PROGRAMADOR")) {
                String choose;
                boolean poo;
                do {
                    System.out.print("¿Tiene concomientos de POO?: ");
                    choose = sc.nextLine().toUpperCase();
                    if (!choose.equals("SI") && !choose.equals("NO")) {
                        System.out.println("ERROR | VUELVE A INTRODUCIR");
                    }
                    poo = (choose.equals("SI"));
                } while (!choose.equals("SI") && !choose.equals("NO"));
                StringBuilder lenguajes = new StringBuilder();
                System.out.println("Lenguajes de Programación (MAX. 5) [** para terminar] ");
                String lenguaje;
                do {
                    lenguaje = sc.nextLine();
                    if (!lenguaje.equals("**")) {
                        lenguajes = lenguajes.append(";").append(lenguaje);
                    }
                } while (!lenguaje.equals("**"));

                trabajador = new Programador(poo, lenguajes, nombre, departamento, new Fecha(dia, mes, anyo), sueldo);
            } else {
                System.out.print("¿Cuantas personas dirige?: ");
                int numP = sc.nextInt();
                trabajador = new JefeProyecto(numP, nombre, departamento, new Fecha(dia, mes, anyo), sueldo);

            }
        } else {
            System.out.println("ERROR | VUELVE A INTRODUCIR");
        }
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

    //4 Actualizar salario de un trabajador a partir de su NIF que será introducido como argumento de entrada al método. (0,75p)
    public void actualizarSalario(String NIF) {
        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null && trabajadores[i].NIF.equalsIgnoreCase(NIF)) {
                System.out.println(trabajadores[i]);
                System.out.println("Introduce el salario nuevo");
                trabajadores[i].setSueldoBase(lector.nextDouble());
            }
        }
    }

}
