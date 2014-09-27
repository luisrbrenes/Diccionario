
package Datos;


public class ListaDoble {
    private NodeDoble primerNodo;
    private NodeDoble ultimoNodo;
    
    public boolean buscar(Object datos) {
        NodeDoble actual = primerNodo;
        boolean encontrado=false;
        while (actual != null) {
            if (actual.getDatos().equals(datos)){
                encontrado= true;
            }
            actual = actual.getNext();
        }
        return encontrado;
    }  
    
    public ListaDoble() {
        primerNodo = null;
        ultimoNodo = null;
        
    }
    
    public boolean estaVacia() {
        return primerNodo == null;
    }
    
    public void insertarFicha(Object datos) {
        if(estaVacia()) {
            NodeDoble nodo = new NodeDoble(datos,null,null);//primerNodo = new Nodo(datos,null,null);
            primerNodo=ultimoNodo=nodo;
            
        }
        else {          
            NodeDoble nodo = new NodeDoble(datos,primerNodo,null);//Nodo nodo = new Nodo(datos,primerNodo,ultimoNodo);
            primerNodo.setPrevius(nodo);
            primerNodo=nodo;
            
    
        }
        
    }
    
    public void imprimir() {
        NodeDoble actual = primerNodo;
        while (actual != null) {
            System.out.println(actual.getDatos());
            actual = actual.getNext();
        }

    } 
    
         
    public Object getElemento(int posicion){
        int contador=0;
        NodeDoble actual=primerNodo;
        if (posicion>=0 && posicion < cantidadElementos()){
            if (primerNodo==null && ultimoNodo==null){
                System.out.println("Lista vacia");
                return null;}
            if (posicion==0)
                return primerNodo.getDatos();
            else{
                while(actual.getNext()!=null){
                    if(contador==posicion)
                       break;
                    
                    else{
                        actual=actual.getNext();
                        contador+=1;
                    }                 
                }           
            }
        }
        else{
             System.out.println("Posicion Invalida");
             
             }
        return actual.getDatos();
        
    }
    
    public int cantidadElementos(){  
        int contador=0;
        if (estaVacia()) {
            contador=0;
            System.out.println("La lista esta vacia");
        }
        else {
            NodeDoble actual = primerNodo;
            while (actual != null) {
                actual = actual.getNext();
                contador+=1;
            }
        }
        return contador;
    }
    
    public void eliminarFicha(NodeDoble nodo)  {
            NodeDoble Anterior=nodo.getPrevius();
            NodeDoble Siguiente=nodo.getNext();
            if(Anterior==null && Siguiente==null){
                this.primerNodo=null;
                this.ultimoNodo=null;
    }
            if(Anterior==null){
                NodeDoble tmp=nodo.getNext();
                this.primerNodo=tmp;
                tmp.setPrevius(null);
    }
            if(Siguiente==null){
                NodeDoble tmp=nodo.getPrevius();
                
                this.ultimoNodo=tmp;
                tmp.setNext(null);
            }
            else{
                Anterior.setNext(Siguiente);
                Siguiente.setPrevius(Anterior);
            }
    }
     
    
}

