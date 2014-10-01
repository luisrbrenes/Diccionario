
package Logic;

import Datos.Lista;
import Datos.ListaDoble;
import Datos.Node;
import Datos.NodeDoble;
import java.util.Random;

/**
 *
 * @author Briam
 */
public class Juego {
        int numero_de_jugadores;
        int bandera_juego;//indica a cual jugador le toca su turno.
        Lista<Jugador> jugadores=new Lista();
        ListaDoble fichas=new ListaDoble();
        
public Juego(int a){
    this.numero_de_jugadores=a;
    
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
        for (int i=0;i<=2;i++){
            this.fichas.insertarFicha("comodin");
         
        }
        
        for(int x=1; x<=98;x++){
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
            else if (x<=82)
                fichas.insertarFicha("M");
            else if (x<=84)
                fichas.insertarFicha("P");
            else if (x<=86)
                fichas.insertarFicha("F");
            else if (x<=88)
                fichas.insertarFicha("H");
            else if (x<=90)
                fichas.insertarFicha("V");
            else if (x<=92)
                fichas.insertarFicha("W"); 
            else if (x<=94)
                fichas.insertarFicha("Y");
            else if (x<=95)
                fichas.insertarFicha("K");
            else if (x<=96)
                fichas.insertarFicha("J");
            else if (x<=97)
                fichas.insertarFicha("X");
            else if (x<=98)
                fichas.insertarFicha("Q");
            else 
                fichas.insertarFicha("Z");

}


}

public void desordenarFichas(){
ListaDoble arreglo_nuevo=new ListaDoble();
        while(101>arreglo_nuevo.cantidadElementos()){
            
                int random=randomNumero(0,this.fichas.cantidadElementos());
                arreglo_nuevo.insertarFicha(this.fichas.getElemento(random));       
                this.fichas.eliminarFicha((NodeDoble)this.fichas.getElemento(random));
                }
        this.fichas=arreglo_nuevo;
        
    
            }
        public void imprimeMazo()
        {   
            int i=0;
            NodeDoble tmp=this.fichas.getPrimernodo();
            while(tmp.getNext()!=null){
                System.out.println(i);
                System.out.println(tmp.GetData());
                tmp=tmp.getNext();
                i++;
        }}
        }


