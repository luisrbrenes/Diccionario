/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.awt.Label;
import javax.swing.JLabel;

/**
 *
 * @author Briam
 */
public class Slot extends Node {
    int ejex;
    int ejey;
    JLabel label;
    int sumador;
    String letra;
    public Slot(String pdata,int x,int y,JLabel lbl) {
        super(pdata);
        this.letra=null;
        this.ejex=x;
        this.ejey=y;
        this.label=lbl;
        
    }
    
}
