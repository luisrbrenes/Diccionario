
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
        return this.primerNodo == null;
    }
    
    public void insertarFicha(Object datos) {
        if(estaVacia()) {
            NodeDoble nodo = new NodeDoble(datos,null,null);//primerNodo = new Nodo(datos,null,null);
            primerNodo=ultimoNodo=nodo;
            
        }
        else {          
            NodeDoble nodo = new NodeDoble(datos,primerNodo,null);//Nodo nodo = new Nodo(datos,primerNodo,ultimoNodo);
            primerNodo.setPrevious(nodo);
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
    
         
    public NodeDoble getElemento(int posicion){
        int contador=0;
        NodeDoble actual=primerNodo;
         if (posicion==contador)
                return actual;
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
    
        return actual;
        
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
            NodeDoble Anterior=nodo.getPrevious();
            NodeDoble Siguiente=nodo.getNext();
            if(Anterior==null && Siguiente==null){
                this.primerNodo=null;
                this.ultimoNodo=null;
    }
            if(Anterior==null){
                NodeDoble tmp=nodo.getNext();
                this.primerNodo=tmp;
                nodo.setNext(null);
                System.out.println(tmp.getPrevious());
    }
            if(Siguiente==null){
                NodeDoble tmp=nodo.getPrevious();
                
                this.ultimoNodo=tmp;
                tmp.setNext(null);
            }
            if(Siguiente!=null && Anterior!=null){
                Anterior.setNext(Siguiente);
                Siguiente.setPrevious(Anterior);
            }
    }
public NodeDoble getPrimernodo(){
    return this.primerNodo;
}
public NodeDoble getUltimonodo(){
    return this.ultimoNodo;
}
    
}

