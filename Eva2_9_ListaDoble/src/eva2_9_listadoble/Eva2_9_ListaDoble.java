/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_listadoble;

/**
 *
 * @author Asus
 */
public class Eva2_9_ListaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble alistada=new ListaDoble();
        alistada.add(new NodoDoble(100));
        alistada.add(new NodoDoble(200));
        alistada.add(new NodoDoble(300));
        alistada.add(new NodoDoble(400));
        alistada.add(new NodoDoble(500));
        alistada.print();
        System.out.println("Cantidad:"+alistada.size());
        alistada.AddBegin(new NodoDoble(1));
        alistada.print();
        System.out.println("Cantidad:"+alistada.size());
    }
    
}
