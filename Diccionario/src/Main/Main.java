/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;


import Datos.Lista;
import Datos.Matriz;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



/**
 *
 * @author Briam
 */
public class Main {
    public static File archivo = null;
    public static java.io.FileReader fr = null;
    public static BufferedReader br = null; 
    public static File archivo1 = null;
    public static java.io.FileReader fr1 = null;
    public static BufferedReader br1 = null; 
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
    archivo = new File ("C:\\Users\\Briam\\Documents\\NetBeansProjects\\Diccionario\\dicc.txt");
    fr = new FileReader (archivo);
    br = new BufferedReader(fr);
   
        
    Lista<String> Diccionario=new Lista<>();
    String linea;
    while((linea=br.readLine())!=null)
         {
            Diccionario.AddNode(linea);
           
             }
    Matriz tablero=new Matriz();
    tablero.Iniciar();
      }
    
      }

    

