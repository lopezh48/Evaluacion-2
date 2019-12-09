/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_listasimple;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class Eva2_8_ListaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista listina = new Lista();
        listina.add(new Nodo(15));
        listina.add(new Nodo(1));
        listina.add(new Nodo(5));
        listina.add(new Nodo(215));
        listina.add(new Nodo(145));
        listina.add(new Nodo(151));
        listina.add(new Nodo(157));
        listina.add(new Nodo(65));
        listina.add(new Nodo(1115));
        listina.AddBegin(new Nodo(99999));
        boolean vacia = listina.IsEmpty();

        if (listina.IsEmpty() == true) {
            System.out.println("lista vacia");
        } else {
            System.out.println("lista no vacia");
        }
        listina.print();
        System.out.println("cantidad " + listina.size());
        listina.InsertAt(0, new Nodo(1111));
        listina.print();
        System.out.println("Cantidad " + listina.size());
        try {
            listina.DeleteAt(2);
            listina.print();
            System.out.println("Cantidad " + listina.size());
        } catch (Exception ex) {
            Logger.getLogger(Eva2_8_ListaSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println("El elemento buscado " + listina.findAt(1));
            listina.print();
            System.out.println("Cantidad " + listina.size());
        } catch (Exception ex) {
            Logger.getLogger(Eva2_8_ListaSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
