
package Logic;

import Datos.ListaDoble;
import Datos.NodeDoble;


public class Jugador{//se crea la clase Jugador.
    
    private int puntaje;//se inicializa el atributo puntaje.
    private int bandera_jugador=0;//se inicializa el atributo numeroJugador.
    private ListaDoble Mano=new ListaDoble();
    
    public Jugador(){    
    } 
  
    public Jugador(int a){ //el constructor de la clase.
        this.bandera_jugador=a;
        this.puntaje=0;
    }
      
    public int getBandera_jugador() {
        return bandera_jugador;
    }

    public ListaDoble getMano() {
        return Mano;
    }

   public void tomarCarta(NodeDoble ficha) {     
        this.Mano.insertarFicha(ficha.GetData());           
   }
       
    public int getPuntaje() { //obtiene el puntaje.
        return puntaje;
    }

    public void setPuntaje(int puntaje) {//setea el puntaje.
        this.puntaje = puntaje;
    }
    
    public void printMano(){

        this.Mano.imprimir();
        
    }
    
}
    
