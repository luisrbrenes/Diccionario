/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import Datos.Lista;
import Datos.Node;
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
 public static FileReader fr = null;
 public static BufferedReader br = null;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Lista<String> Diccionario=new Lista<>();
        

try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\dicc.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null)
         {
            Diccionario.AddNode(linea);
           
             }
            
      }
      catch(Exception e){
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
         }
      }
Diccionario.GetHead();
Diccionario.GetTail();
Diccionario.GetNodeData(Diccionario.GetHead().GetNext());
if(Diccionario.SearchData("aah"))
    System.out.println("hi");
   }
    
    }
    

