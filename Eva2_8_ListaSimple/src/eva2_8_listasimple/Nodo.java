/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_listasimple;

/**
 *
 * @author Asus
 */
public class Nodo {

    private int enterin;
    private Nodo sig;
    

    public Nodo() {
        this.sig = null;
    }

    public Nodo(int enterin) {
        this.enterin = enterin;
        this.sig = null;
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
