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
public class arbol {

    Nodo Raiz;

    
    //Metodos para insertar Nodos de forma automatica al arbol de busqueda
    public void insertar(int _cod, String _des, boolean _av) throws Exception {
        this.Raiz = insertar(this.Raiz, _cod, _des, _av);

    }

    public Nodo insertar(Nodo Ra, int _codi, String _desc, boolean _ava) throws Exception {
        if (Ra == null) {
           Ra= new Nodo( _codi, _desc,_ava);
        }
        else if(_codi< Ra.valorNodo()){
            Nodo iz;
            iz = insertar(Ra.getHijoI(), _codi, _desc, _ava);
            Ra.setHijoI(iz);
            
        }
        else if(_codi > Ra.valorNodo()){
            Nodo dr;
            dr = insertar(Ra.getHijoD(),_codi, _desc, _ava);
            Ra.setHijoD(dr);
            
        }
        else{
            throw new Exception("nodo duplicado");
        }
        
        return Ra;

    }
    
    //metodo para Eliminar un nodo del arbol de busqueda
    public void eliminar(int valor) throws Exception {

        this.Raiz = eliminar(this.Raiz, valor);
    }    
    
    
    protected Nodo eliminar(Nodo Ra, int _codi) throws Exception {
        if (Ra == null) {
            throw new Exception("No se ha encontrado el nodo con la clave");
        } else if (_codi < (Ra.valorNodo())) {
            Nodo iz;
            iz = eliminar(Ra.getHijoI(), _codi);
            Ra.setHijoI(iz);
        } else if (_codi > (Ra.valorNodo())) {
            Nodo dr;
            dr = eliminar(Ra.getHijoD(), _codi);
            Ra.setHijoD(dr);
        } else //NODO ENCONTRADO (NUEVO)
        {
            Nodo nr;
            nr = Ra;
            if (nr.getHijoI()== null) {
                Ra = nr.getHijoD();
            } else if (nr.getHijoD()== null) {
                Ra = nr.getHijoI();
            } else { 
                nr = reemplazar(nr);
            }
            nr = null;
        }
        return Ra;
    }
    
    //Metodo que remplaza un nodo eliminado por otro nodo
    private Nodo reemplazar(Nodo aux) {
        Nodo hijo;
        Nodo padre;
        padre = aux;
        hijo = aux.getHijoI();
        while (hijo.getHijoD()!= null) {
            padre = hijo;
            hijo = hijo.getHijoD();
        }
        aux.nuevoNodo(hijo.valorNodo());
        if (padre == aux) {
            padre.setHijoI(hijo.getHijoI());
        } else {
            padre.setHijoD(hijo.getHijoI());
        }
        return hijo;
    }

    
    //metodos que reccorren el arbol binario
    public void preorden(Nodo r) {
        if (r != null) {
            r.visitar();
            preorden(r.getHijoI());
            preorden(r.getHijoD());

            }
        }

        public void inorden(Nodo r) {
            if (r != null) {

                inorden(r.getHijoI());
                r.visitar();
                inorden(r.getHijoD());

            }
        }

       

}
