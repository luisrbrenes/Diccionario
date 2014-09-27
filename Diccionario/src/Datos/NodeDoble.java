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
private NodeDoble previus;
private Object pdata;

    public NodeDoble(Object pdata,NodeDoble sig, NodeDoble ant) {
        super(pdata);
        this.next= sig;
        this.previus=ant;
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
    public void setPrevius(NodeDoble anteriorNodo){
        this.previus= anteriorNodo;
        
    }
   public NodeDoble getPrevius(){
       return this.previus;
   }
}   

