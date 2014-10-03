
package Logic;

import Datos.Lista;
import Datos.ListaDoble;
import Datos.ListaSlot;
import Datos.Node;
import Datos.NodeDoble;
import Datos.Slot;
import GUI.VentanaJuego;
import static Main.Main.archivo1;
import static Main.Main.br1;
import static Main.Main.fr1;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/*import Datos.Lista;
import Datos.ListaDoble;
import Datos.Node;
import Datos.NodeDoble;
import java.util.Random;*/

/**
 *
 * @author Briam
 */
public class Juego implements Constantes {
        /*int numero_de_jugadores;
        int bandera_juego;//indica a cual jugador le toca su turno.
        Lista<Jugador> jugadores=new Lista();
        ListaDoble fichas=new ListaDoble();*/
int numero_de_jugadores;
int bandera_juego;
Lista<Jugador> jugadores=new Lista();
ListaDoble fichas=new ListaDoble();
public Jugador jugadorTurno=null;
public Lista palabrasTurno=null;
private Lista<Lista> tablero;
private Slot puntero;  

public Juego(){
   this.bandera_juego=this.numero_de_jugadores;  
}
public Juego(int a){
    this.numero_de_jugadores=a;
    
}

public Lista<Jugador> getJugadores() {
        return jugadores;
}

public void setJugadores(Lista<Jugador> jugadores) {
    this.jugadores = jugadores;
}
      
public int getNumero_de_jugadores() {
   return numero_de_jugadores;
}

public void setNumero_de_jugadores(int numero_de_jugadores) {
   this.numero_de_jugadores = numero_de_jugadores;
}
      

public int randomNumero(int min, int max){
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
}
    
public void creaJugadores(){
    int i = 1;
    while(i<=this.numero_de_jugadores){
        
        Jugador jugador=new Jugador(i);
        jugadores.AddNode(jugador);
        i++;
    }
    
}
public void creaFichas(){//crea las fichas ordenadamente.
        for (int i=1;i<=2;i++){
            this.fichas.insertarFicha("comodin");
         
        }
        
        for(int x=1; x<=99;x++){
            if (x<=12)
                fichas.insertarFicha("E");
            else if (x<=21)
                fichas.insertarFicha("A");
            else if (x<=30)
                fichas.insertarFicha("I");
            else if (x<=38)
                fichas.insertarFicha("O");
            else if (x<=44)
                fichas.insertarFicha("N");
            else if (x<=50)
                fichas.insertarFicha("R");
            else if (x<=56)
                fichas.insertarFicha("T");
            else if (x<=60)
                fichas.insertarFicha("L");
            else if (x<=64)
                fichas.insertarFicha("S");
            else if (x<=68)
                fichas.insertarFicha("U");
            else if (x<=72)
                fichas.insertarFicha("D");
            else if (x<=75)
                fichas.insertarFicha("G");
            else if (x<=77)
                fichas.insertarFicha("B");
            else if (x<=79)
                fichas.insertarFicha("C");
            else if (x<=81)
                fichas.insertarFicha("M");
            else if (x<=83)
                fichas.insertarFicha("P");
            else if (x<=85)
                fichas.insertarFicha("F");
            else if (x<=87)
                fichas.insertarFicha("H");
            else if (x<=89)
                fichas.insertarFicha("V");
            else if (x<=91)
                fichas.insertarFicha("W"); 
            else if (x<=93)
                fichas.insertarFicha("Y");
            else if (x<=94)
                fichas.insertarFicha("K");
            else if (x<=95)
                fichas.insertarFicha("J");
            else if (x<=96)
                fichas.insertarFicha("X");
            else if (x<=97)
                fichas.insertarFicha("Q");
            else
                fichas.insertarFicha("Z");
          

                        }


}

public void repartirFichas(){
    int i = 0;
    Node jugadortmp = this.jugadores.GetHead();
    while(i<this.jugadores.lenght()){
        int j=0;
        while(j<7){
            Jugador tmp=(Jugador)jugadortmp.GetData();
            NodeDoble carta=this.fichas.getPrimernodo();
            tmp.tomarCarta(carta);
            this.fichas.eliminarFicha(carta);
            j++;
        }
        i++;
        jugadortmp= jugadortmp.GetNext();
    }
            
}


public void imprimeMazo(){   
    int i=1;
    NodeDoble tmp=this.fichas.getPrimernodo();
    while(tmp.getNext()!=null){
        //System.out.println(i);
        System.out.println(tmp.GetData());
        tmp=tmp.getNext();
        i++;
    }
}

public void lenght(){
    System.out.println(this.fichas.cantidadElementos());
}

public Slot getPuntero(){
    return this.puntero;
}  

public int getPuntajeLetra(NodeDoble ficha){//devuelve el valor de cada letra o ficha.
    int num=0;
    if(ficha.GetData().equals("E")||ficha.GetData().equals("A")||ficha.GetData().equals("I")||
            ficha.GetData().equals("O")||ficha.GetData().equals("N")||ficha.GetData().equals("R")||ficha.GetData().equals("T")
            ||ficha.GetData().equals("L")||ficha.GetData().equals("S")||ficha.GetData().equals("U"))
        num=1;
    if(ficha.GetData().equals("D")||ficha.GetData().equals("G"))
       num=2;
    if (ficha.GetData().equals("B")||ficha.GetData().equals("C")||ficha.GetData().equals("M")||ficha.GetData().equals("P"))
        num=3;
    if(ficha.GetData().equals("F")||ficha.GetData().equals("H")||ficha.GetData().equals("V")||ficha.GetData().equals("W")||
            ficha.GetData().equals("Y"))
        num=4;
    if (ficha.GetData().equals("K"))
        num=5;
    if(ficha.GetData().equals("J")||ficha.GetData().equals("X"))
        num=8;
    if(ficha.GetData().equals("Q")||ficha.GetData().equals("Z"))
        num=10;
return num;  
}

public void IniciarTablero(VentanaJuego ventana) throws IOException{
    this.tablero=new Lista<>();
    String linea1;
    int j=0;
    archivo1 = new File ("src/Matriz.txt");
    fr1 = new FileReader (archivo1);
    br1 = new BufferedReader(fr1);
    JLabel lbl=null;
    while((linea1=br1.readLine())!=null)
         {  
             String[] parts1=linea1.split(" ");
             ListaSlot newLista=new ListaSlot();
             tablero.AddNode(newLista);
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
                 newLista.AddSlot(parts1[i],i+1,(j),lbl);
                 }
                 if("1".equals(parts1[i])){
                 lbl=new JLabel();
                 lbl.setBackground(Color.blue);
                 lbl.setForeground(Color.black);
                 lbl.setBounds(i*32,(j-1)*32, 29, 29);
                 lbl.setOpaque(true);
                 newLista.AddSlot(parts1[i],i+1,(j),lbl);
                 }
                 if("2".equals(parts1[i])){
                 lbl=new JLabel();
                 lbl.setBackground(Color.green);
                 lbl.setForeground(Color.black);
                 lbl.setBounds(i*32,(j-1)*32, 29, 29);
                 lbl.setOpaque(true);
                 newLista.AddSlot(parts1[i],i+1,(j),lbl);
                 }
                 if("3".equals(parts1[i])){
                 lbl=new JLabel();
                 lbl.setBackground(Color.yellow);
                 lbl.setForeground(Color.black);
                 lbl.setBounds(i*32,(j-1)*32, 29, 29);
                 lbl.setOpaque(true);
                 newLista.AddSlot(parts1[i],i+1,(j),lbl);
                 }
                 if("4".equals(parts1[i])){
                 lbl=new JLabel();
                 lbl.setBackground(Color.red);
                 lbl.setForeground(Color.black);
                 lbl.setBounds(i*32,(j-1)*32, 29, 29);
                 lbl.setOpaque(true);
                 newLista.AddSlot(parts1[i],i+1,(j),lbl);
                 }
                 
                 ventana.addLabel(lbl);
                 i++;
             }}
    Slot x=Validaciones.buscaSlot(2, 5, tablero);
    
    this.puntero=(Slot) x;
    this.puntero.GetLabel().setBorder(BorderFactory.createLineBorder(Color.black));
    
    //x.GetLabel().setBorder(BorderFactory.createLineBorder(Color.yellow));
    //this.muevePuntero("arriba");
    this.puntero.GetLabel().setBorder(BorderFactory.createLineBorder(Color.black));
    
 }

public void LabelManoJugador(VentanaJuego ventana){ //crea los labels de la mano del jugador.  
    
    JLabel labeljugador=new JLabel();//"Jugador "+this.bandera_juego);
    labeljugador.setBackground(Color.gray);
    labeljugador.setForeground(Color.black);
    labeljugador.setBounds(10,485, 80, 25);
    labeljugador.setOpaque(true);
    ventana.addLabel(labeljugador);
    int x=10; 
    int y=520;
    int i=1; 
    while(i<8){
        JLabel label=new JLabel();//(jug.getMano().getElemento(i).getDatos().toString());
        //label.setText(this.getJugador(this.bandera_juego).getMano().getElemento(i).getDatos().toString());
        label.setBackground(Color.red);
        label.setForeground(Color.black);
        label.setBounds(x,y, 30, 30);
        label.setOpaque(true);  
        x+=60;
        i+=1;
        ventana.addLabel(label);
       
    }
   
}    
    
public void ActualizarManoActualJugador(VentanaJuego ventana,Lista labels){//me escribe como texto las letras de las fichas del jugador en el lable.
    int bandera_turno=this.bandera_juego;
    Jugador jugador_actual=this.getJugador(bandera_turno);
    JLabel lbl=null;
    for(int i=1;i<=7;i++){
        switch(i){
            case 1: 
               lbl=(JLabel)labels.GetHead().GetData();
                lbl.setText(jugador_actual.getMano().getElemento(i).getDatos().toString());
            case 2: 
               lbl=(JLabel)labels.GetHead().GetNext().GetData();
               lbl.setText(jugador_actual.getMano().getElemento(i).getDatos().toString());
            case 3: 
               lbl=(JLabel)labels.GetHead().GetNext().GetNext().GetData();
               lbl.setText(jugador_actual.getMano().getElemento(i).getDatos().toString());  
            case 4: 
               lbl=(JLabel)labels.GetHead().GetNext().GetNext().GetNext().GetData();
               lbl.setText(jugador_actual.getMano().getElemento(i).getDatos().toString());
            case 5: 
               lbl=(JLabel)labels.GetHead().GetNext().GetNext().GetNext().GetNext().GetData();
               lbl.setText(jugador_actual.getMano().getElemento(i).getDatos().toString());  
            case 6: 
               lbl=(JLabel)labels.GetHead().GetNext().GetNext().GetNext().GetNext().GetNext().GetData();
               lbl.setText(jugador_actual.getMano().getElemento(i).getDatos().toString());  
            case 7: 
               lbl=(JLabel)labels.GetHead().GetNext().GetNext().GetNext().GetNext().GetNext().GetNext().GetData();
               lbl.setText(jugador_actual.getMano().getElemento(i).getDatos().toString());  
        }
    }       

}
    
public int InteraccionUsuario(){
    int numerojugadores=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de Jugadores"));   
    try{       
        if(numerojugadores>=1 && numerojugadores<5){
            this.setNumero_de_jugadores(numerojugadores);
            this.creaJugadores();
            System.out.println("jugadores:"+this.getNumero_de_jugadores());
            return numerojugadores;
        }      
        else
            InteraccionUsuario();  
    }catch(Exception e){
                   
    }
    return numerojugadores;
}

public Jugador getJugador(int i){
    Jugador jugador=null;
    if(i==1){
        jugador=(Jugador)this.jugadores.GetHead().GetData();
    }
    if(i==2){
        jugador=(Jugador)this.jugadores.GetHead().GetNext().GetData();
    }
    if(i==3){
        jugador=(Jugador)this.jugadores.GetHead().GetNext().GetNext().GetData();
    }
    if(i==4){
        jugador=(Jugador)this.jugadores.GetHead().GetNext().GetNext().GetNext().GetData();
    }
    return jugador;
}

public void setJugadorTurno(Jugador jugador){
    this.jugadorTurno=jugador;
    System.out.println(this.jugadorTurno.getBandera_jugador());
}

public Jugador getJugadorTurno()
{
    return this.jugadorTurno;
}
public void setPrimerJugador(){
    int j=1;
    int i=this.getNumero_de_jugadores();
    Jugador jugador=this.getJugador(1);
    String s = (String)jugador.getMano().getPrimernodo().GetData();
    char c = s.charAt(0);
    int b=Character.getNumericValue(c);
    int menor=b;
    System.out.println(b);
    Jugador x=jugador;
    while(j<i){
    jugador=this.getJugador(j+1);
    s = (String)jugador.getMano().getPrimernodo().GetData();
    c = s.charAt(0);
    b=Character.getNumericValue(c);
    System.out.println(b);
    if(b<menor){
        menor=b;
        x=jugador;
        System.out.println(b);}
    j++;
    }

    this.setJugadorTurno(x);
}

public void desordenarFichas(){
    ListaDoble arreglo_nuevo=new ListaDoble();
    int i=100;
    while(i!=0){
        int random=randomNumero(0,this.fichas.cantidadElementos());
        arreglo_nuevo.insertarFicha(this.fichas.getElemento(random).GetData());       
        this.fichas.eliminarFicha((NodeDoble)this.fichas.getElemento(random));
        i--;
    }
    this.fichas=arreglo_nuevo;
}

public void muevePuntero(String Mov){
int i=this.puntero.ejex();
int j=this.puntero.ejey();
System.out.println(i);
System.out.println(j);
if("arriba".equals(Mov)){
    if(j>0){
      this.puntero.GetLabel().setBorder(BorderFactory.createLineBorder(Color.black));//.createLineBorder(Colorblack));

      Slot tmp=Validaciones.buscaSlot(i,j-1,tablero);
      this.puntero=tmp;

    }
}
if("abajo".equals(Mov)){
    if(j<14){
        this.puntero.GetLabel().setBorder(BorderFactory.createLineBorder(Color.black));

      Slot tmp=Validaciones.buscaSlot(i,j+1,tablero);
      this.puntero=tmp;

    }
}
if("derecha".equals(Mov)){
    System.out.println("hola");
    if(i<14){
      this.puntero.GetLabel().setBorder(BorderFactory.createLineBorder(Color.black));

      Slot tmp=Validaciones.buscaSlot(i+1,j,tablero);
      
      this.puntero=tmp;

    }
}
if("izquierda".equals(Mov)){
    if(i>0){
        this.puntero.GetLabel().setBorder(BorderFactory.createLineBorder(Color.black));

      Slot tmp=Validaciones.buscaSlot(i-1,j,tablero);
      this.puntero=tmp;

    }
}
}
}


