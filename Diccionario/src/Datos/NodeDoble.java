/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;


/**
 *
 * @author Briam
 */
public class NodeDoble extends Node {
private NodeDoble next;
private NodeDoble previous;
private Object pdata;

    public NodeDoble(Object pdata,NodeDoble sig, NodeDoble ant) {
        super(pdata);
        this.next= sig;
        this.previous=ant;
    }
     public void setDatos(Object datos) {
        this.pdata = datos;
    }
    public  Object getDatos() {
        return this.pdata;
    }

    public void setNext(NodeDoble siguienteNodo) {
        this.next = siguienteNodo;
    }
    
    public NodeDoble getNext() {
        return this.next;
    }
    public void setPrevious(NodeDoble anteriorNodo){
        this.previous= anteriorNodo;
        
    }
   public NodeDoble getPrevious(){
       return this.previous;
   }
}   

