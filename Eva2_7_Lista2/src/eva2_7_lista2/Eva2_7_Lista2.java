/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_lista2;

/**
 *
 * @author Asus
 */
public class Eva2_7_Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo nodo1,nodo2,nodo3;
        nodo1=new Nodo(32); 
        nodo2=new Nodo(17);
        nodo3=new Nodo(5);
        nodo1.setSig(nodo2);
        nodo2.setSig(nodo3);
        Nodo temp=nodo1;
        while(temp!=null){
         
            System.out.print(temp.getEnterin()+" - ");
               temp=temp.getSig();
               
        }
    }
    
}
class Nodo{
    private int enterin;
    private Nodo sig;
public Nodo(){
    this.sig=null;
}
public Nodo(int enterin){
    this.enterin=enterin;
    this.sig=null;
}
    public int getEnterin() {
        return enterin;
    }

    public void setEnterin(int enterin) {
        this.enterin = enterin;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
}