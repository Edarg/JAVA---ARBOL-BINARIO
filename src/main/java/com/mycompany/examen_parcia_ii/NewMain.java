/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen_parcia_ii;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eddy Argueta
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Identificación 
        try {
            System.out.println("==========================================================");
            System.out.println("5190-20-522,Eddy Jehovany Argueta Ramirez, Seccion D");
            System.out.println("" + InetAddress.getLocalHost());
            System.out.println("==========================================================");

        } catch (UnknownHostException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Carga de Datos
        arbol a = new arbol();

        try {
            
            //carga de datos 
            a.insertar(65, "Uso del manejador de bases de datos ACCESS  ", false);
            a.insertar(80, "Introducción al diseño de bases de datos  ", false);
            a.insertar(81, "Creacion de paginas web con HTML  ", true);
            a.insertar(51, "Introducción a HTML5", false);
            a.insertar(23, "Leguaje de programacion PHP", true);
            a.insertar(71, "Hoja de calculo Excel", false);
            a.insertar(72, "Macros en Excel", true);
            a.insertar(53, "Programacion con Java principiantes", false);
            a.insertar(38, "Programacion con Java intermedio", false);
            a.insertar(35, "Programacion con Java avanzado", true);
            
            //Mostrar el arbol en preorden
            System.out.println("\nLista En Preorden");
            System.out.println("==========================================================");
            System.out.println("Codigo de Curso |  Descripcion  | Avanzado\n");
            a.preorden(a.Raiz);

            //eliminación del nodo 65
            System.out.println("\n==========================================================");
            System.out.println("Eliminando Nodo 65...");
            a.eliminar(65);
            System.out.println("==========================================================");
            
            //Mostar el arbol en Inorden            
            System.out.println("\nLista En Inorden");
            System.out.println("==========================================================");
            System.out.println("Codigo de Curso |  Descripcion  | Avanzado\n");
            a.inorden(a.Raiz);

        } catch (Exception ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
