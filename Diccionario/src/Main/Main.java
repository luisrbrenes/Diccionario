
package Main;


import Datos.Lista;
import Datos.ListaDoble;

import GUI.MenuJuego;
import GUI.VentanaJuego;
import Logic.Juego;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



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
    MenuJuego menu=new MenuJuego();
    
        
    //lee los archivos txt.      
    archivo = new File ("src/dicc.txt");
    fr = new FileReader (archivo);
    br = new BufferedReader(fr);
   
    //inicializacion de listas.    
    Lista<String> Diccionario=new Lista<>();
    ListaDoble s=new ListaDoble(); 
    String linea;
    while((linea=br.readLine())!=null)     
            Diccionario.AddNode(linea);
       
   
   
    
    
    
    }
    
}

    

