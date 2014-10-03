

package Datos;

import javax.swing.JLabel;

/**
 *
 * @author Briam
 */
public class ListaSlot extends Lista {
    Slot head;
    Slot tail;
    public ListaSlot() {
        this.head=null;
        this.tail=null;
        this.lenght=0;
    }
    public void AddSlot(String pdata, int x, int y, JLabel lbl){
        if (this.lenght==0){
            Slot newSlot=new Slot(pdata,x,y,lbl);
            this.head=newSlot;
            this.tail=newSlot;
            this.lenght=lenght+1;
        }
            if (this.lenght==1){
            Slot newSlot=new Slot(pdata,x,y,lbl);
            this.head.SetNext(newSlot);
            this.tail=newSlot;
            this.lenght=lenght+1;
        }
        else{
            Slot newSlot=new Slot(pdata,x,y,lbl);
            this.tail.SetNext(newSlot);
            this.tail=newSlot;
     }
            this.lenght=lenght+1;
    }
    @Override
    public Slot GetHead(){
       return this.head;
        
    }
    @Override
  public Slot GetTail(){
         return this.tail;
}
  public void GetNodeData(Slot x){
         x.GetData();
  }
      
}

