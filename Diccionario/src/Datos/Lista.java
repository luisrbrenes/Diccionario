
package Datos;



public class Lista<A> {
    Node head;
    Node tail;
    public int lenght;
    

    public Lista() {
        this.head=null;
        this.tail=null;
        this.lenght=0;
    }
    public void AddNode(A pdata){
        if (this.lenght==0){
            Node<A> newNode=new Node<>(pdata);
            this.head=newNode;
            this.tail=newNode;
        }
        if (this.lenght==1){
            Node<A> newNode=new Node<>(pdata);
            this.head.SetNext(newNode);
            this.tail=newNode;
        }
        else{
            Node<A> newNode=new Node<>(pdata);
            this.tail.SetNext(newNode);
            this.tail=newNode;
       }
    this.lenght=lenght+1;
    }
public Node GetHead(){
       return this.head;
        
    }
  public Node GetTail(){
         return this.tail;
} 
  public void GetNodeData(Node x){
         x.GetData();
  }
  public boolean SearchData(A dcomparable){
      int i=0;
      System.out.println(this.lenght);
      Node temp=this.head;
      while (i<this.lenght){
          System.out.println(temp.GetData());
              if (temp.GetData().equals(dcomparable)){
                  System.out.println("true");
                  return true;
              }
              
                  i=i+1;
                  temp=temp.GetNext();
              
          }
     return false;
      }
      
  public int lenght(){
          return this.lenght;
  }
}
