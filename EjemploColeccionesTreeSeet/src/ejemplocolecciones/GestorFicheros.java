/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocolecciones;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Profesor
 */
public class GestorFicheros {

    public static final String FICHERO = "Individuos";
    public static final String FICHERO_BINARIO = "IndividuosBinario";

    public static void crearFicheros() {
        File f = new File(FICHERO);
        File f2 = new File(FICHERO_BINARIO);
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            if (!f2.exists()) {
                f2.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void escribirFicheroPW(String fichero, TreeSet<Individuo> lista) {
        try {
            PrintWriter pw = new PrintWriter(fichero);
            Iterator<Individuo> it = lista.iterator();
            while (it.hasNext())
                pw.println(it.next().toStringFichero());
            
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(GestorFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //no hace falta
    public static int lineasFichero(String fichero) {
        int cont = 0;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(fichero)));
            String cadena;
            do {
                cadena = bf.readLine();
                if (cadena != null) {
                    cont++;
                }
            } while (cadena != null);
            bf.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado" + ex.getMessage());
            Logger.getLogger(GestorFicheros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestorFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cont;
    }

    public static TreeSet<Individuo> leerFichero(String fichero) {
        System.out.println("leyedo fichero....");
        TreeSet<Individuo> lista = new TreeSet();
        int i = 0;
        try {
            Scanner lf = new Scanner(new File(fichero));
            String cadena;

            while (lf.hasNextLine()) {
                cadena = lf.nextLine();
                String trozos[] = cadena.split(";");
                System.out.println(cadena);
                lista.add(new Individuo(Integer.parseInt(trozos[0]), trozos[1], trozos[2]));
            }

            lf.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    //Escribir y Leer Ficheros Binario, el array completo de una vez

    public static void escribirFicheroBinario(String fichero, Censo censo) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fichero));
            os.writeObject(censo);
            os.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Censo leerFicheroBinario(String fichero) {
        Censo censoE = null;
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(fichero));
            censoE = (Censo) os.readObject();
            os.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + "Clase Individuo [] no encontrada");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return censoE;
    }
//Escribir y Leer Ficheros Binario, elemento por elemento

    public static void escribirFicheroBinarioUnoPorUno(String fichero, TreeSet<Individuo> lista) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fichero));
            Iterator<Individuo> it = lista.iterator();
            while (it.hasNext())
                os.writeObject(it.next());
            os.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static TreeSet<Individuo> leerFicheroBinarioUnoPorUno(String fichero) {
        TreeSet<Individuo> lista = new TreeSet(); //podéis contar número de líneas?
        boolean EOF = false; //end of file
        int i = 0;
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(fichero));
            while (!EOF) {
                try {
                    lista.add((Individuo) os.readObject());
                } catch (EOFException e) {
                    System.out.println("Se ha alcanzado el final del fichero");
                    EOF = true;
                }
            }
            os.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + "Clase Individuo [] no encontrada");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

}