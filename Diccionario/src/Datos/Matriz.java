/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import GUI.VentanaJuego;
import static Main.Main.archivo1;
import static Main.Main.br1;
import static Main.Main.fr1;
import java.awt.Color;
import java.awt.Label;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author Briam
 */
public class Matriz extends Lista<Lista>{
    Slot head;
    Slot tail;
    private JLabel lbl;
    private Slot puntero;
    
   public Matriz() throws FileNotFoundException{
    archivo1 = new File ("C:\\Users\\Briam\\Documents\\NetBeansProjects\\Diccionario\\Matriz.txt");
    fr1 = new FileReader (archivo1);
    br1 = new BufferedReader(fr1);
    String PalabraTurno;
    }
   public void Iniciar(VentanaJuego ventana) throws IOException{
    String linea1;
    int j=0;
    
    while((linea1=br1.readLine())!=null)
         {  
             String[] parts1=linea1.split(" ");
             ListaSlot newLista=new ListaSlot();
             this.AddNode(newLista);
             int i=0;
             j++;
             while (i<15)
             {   
                 if("0".equals(parts1[i])){
                 lbl=new JLabel();
                 lbl.setBackground(Color.white);
                 lbl.setForeground(Color.black);
                 lbl.setBounds(i*32,(j-1)*32, 29, 29);
                 lbl.setOpaque(true);
                 newLista.AddSlot(parts1[i],i,(j-1),lbl);
                 }
                 if("1".equals(parts1[i])){
                 lbl=new JLabel();
                 lbl.setBackground(Color.blue);
                 lbl.setForeground(Color.black);
                 lbl.setBounds(i*32,(j-1)*32, 29, 29);
                 lbl.setOpaque(true);
                 newLista.AddSlot(parts1[i],i,(j-1),lbl);
                 }
                 if("2".equals(parts1[i])){
                 lbl=new JLabel();
                 lbl.setBackground(Color.green);
                 lbl.setForeground(Color.black);
                 lbl.setBounds(i*32,(j-1)*32, 29, 29);
                 lbl.setOpaque(true);
                 newLista.AddSlot(parts1[i],i,(j-1),lbl);
                 }
                 if("3".equals(parts1[i])){
                 lbl=new JLabel();
                 lbl.setBackground(Color.yellow);
                 lbl.setForeground(Color.black);
                 lbl.setBounds(i*32,(j-1)*32, 29, 29);
                 lbl.setOpaque(true);
                 newLista.AddSlot(parts1[i],i,(j-1),lbl);
                 }
                 if("4".equals(parts1[i])){
                 lbl=new JLabel();
                 lbl.setBackground(Color.red);
                 lbl.setForeground(Color.black);
                 lbl.setBounds(i*32,(j-1)*32, 29, 29);
                 lbl.setOpaque(true);
                 newLista.AddSlot(parts1[i],i,(j-1),lbl);
                 }
                 
                 ventana.addLabel(lbl);
                 i++;
             }
             Lista x=(Lista)this.GetHead().GetData();
             x.GetHead();
             this.puntero=(Slot)x.GetHead();
             this.puntero.GetLabel().setBorder(BorderFactory.createLineBorder(Color.black));
             
             }
   }
   
   //public void CambiarSlot(int x, int y)
   //{   
   //}

}
   
