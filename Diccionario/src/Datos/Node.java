/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

/**
 *
 * @author Briam
 * @param <A>
 */
public class Node <A> {
    private Node next;
    private A data;


public Node(A pdata){
this.data= pdata;
this.next=null;
}
public void SetData(A a){
    this.data= a;
}
public A GetData(){
    //System.out.println(this.data);
    return this.data;
}
public void SetNext(Node n){
    this.next=n;
}
public Node GetNext(){
    return this.next;
}
}