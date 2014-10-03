

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

public String GetLetra(){
    return this.letra;
}
public void SetLetra(String letra){
    this.letra=letra;
}

public JLabel GetLabel(){
    return this.label;
}

public int ejex(){
    return this.ejex;
}

public int ejey(){
    return this.ejey;
}
}
