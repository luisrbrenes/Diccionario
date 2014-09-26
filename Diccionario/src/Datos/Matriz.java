/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import static Main.Main.archivo1;
import static Main.Main.br1;
import static Main.Main.fr1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Briam
 */
public class Matriz extends Lista<Lista>{
   public Matriz() throws FileNotFoundException{
    archivo1 = new File ("C:\\Users\\Briam\\Documents\\NetBeansProjects\\Diccionario\\Matriz.txt");
    fr1 = new FileReader (archivo1);
    br1 = new BufferedReader(fr1);
    Node pointer;
    String PalabraTurno;
    int ejex;
    int ejey;
    }
   public void Iniciar() throws IOException{
    String linea1;
    
    while((linea1=br1.readLine())!=null)
         {  
             Lista<String> newLista=new Lista();
             this.AddNode(newLista);
             int i=0;
             
             while (i<15)
             {
                 String[] parts1=linea1.split(" ");
                 newLista.AddNode(parts1[i]);
                 
                 i++;
             }
            
            
             }
   }

}
