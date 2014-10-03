

package Logic;

import Datos.Lista;
import Datos.ListaSlot;
import Datos.Node;
import Datos.Slot;


public class Validaciones {

    public static Slot buscaSlot(int i,int j,Lista L){
       int x=0;
       Node tmp=L.GetHead();
       //System.out.println(tmp);
       while(x<j){
           tmp=tmp.GetNext();
           //System.out.println(tmp);
           x++;
       }
       ListaSlot tmp1=(ListaSlot)tmp.GetData();
       int y=1;
       Slot tmp2=tmp1.GetHead();
       while(y<i+1){
          
          tmp2=(Slot) tmp2.GetNext();
          y++;
            }
       return (Slot) tmp2;
    }
    
}
