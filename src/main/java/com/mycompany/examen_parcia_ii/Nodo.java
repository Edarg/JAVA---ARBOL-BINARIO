/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen_parcia_ii;

/**
 *
 * @author Eddy Argueta
 */
public class Nodo {
    
    int codigo;
    String descripcion;
    boolean avanzado;  
    Nodo hijoI;
    Nodo hijoD;
    
    public Nodo(int _codigo, String _descripcion, boolean _avanzado){
        
        this.codigo = _codigo;  
        this.descripcion = _descripcion;
        this.avanzado = _avanzado;
    }
    
    public int valorNodo(){
        return this.codigo;
    }

    public Nodo getHijoI() {
        return hijoI;
    }

    public Nodo getHijoD() {
        return hijoD;
    }
    
    public void visitar(){
        System.out.println(this.codigo+",  "+this.descripcion+",  "+this.avanzado);
    }    

    public void setHijoI(Nodo hijoI) {
        this.hijoI = hijoI;
    }

    public void setHijoD(Nodo hijoD) {
        this.hijoD = hijoD;
    }
    
    public void nuevoNodo(int cod){
        this.codigo = cod;
    }
    
    
    
    
   
    
    
}
