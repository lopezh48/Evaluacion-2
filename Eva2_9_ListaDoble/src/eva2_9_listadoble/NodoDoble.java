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
public class NodoDoble {

    private int enterin;
    private NodoDoble sig;
    private NodoDoble ant;

    public NodoDoble() {
        this.sig = null;
        this.ant=null;
    }

    public NodoDoble(int enterin) {
        this.enterin = enterin;
        this.sig = null;
        this.ant=null;
    }

    public int getEnterin() {
        return enterin;
    }

    public void setEnterin(int enterin) {
        this.enterin = enterin;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }
    public NodoDoble getAnt(){
        return ant;
    }
    public void setAnt(NodoDoble ant){
        this.ant=ant;
    }

}
