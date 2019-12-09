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
public class Lista {

    private Nodo NodoIn;
    private Nodo NodoFin;

    public Lista() {
        this.NodoIn = null;
        this.NodoFin = null;

    }

    public boolean IsEmpty() {
        if (NodoIn == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(Nodo nuevo) {
        if (IsEmpty()==true) {
            NodoIn = nuevo;
            NodoFin = nuevo;
        } else {
            
            Nodo temp = NodoIn;
            while (temp.getSig() != null) {
                temp = temp.getSig();
            }
            temp.setSig(nuevo);

        }
    }

    public void print() {
        Nodo temp = NodoIn;
        while (temp != null) {

            System.out.print(temp.getEnterin() + " - ");
            temp = temp.getSig();

        }
    }

    public int size() {

        int Tama = 0;
        Nodo temp = NodoIn;
        while (temp != null) {
            Tama++;
            temp = temp.getSig();

        }
        return Tama;
    }

    public void AddBegin(Nodo nuevo) {
        if (IsEmpty()) {
            NodoIn = nuevo;
            NodoFin = nuevo;
        } else {
            nuevo.setSig(NodoIn);
            NodoIn = nuevo;
        }
    }

    public void InsertAt(int pos, Nodo nuevo) {
        int Tama = size();
        Nodo temp = NodoIn;
        int Cont = 0;
        if (pos < 0) {
            System.out.println("Posición inválida");
        } else {
            if (pos == 0) {
                AddBegin(nuevo);
            } else {
                while (Cont != pos - 1) {

                    temp = temp.getSig();
                    Cont++;
                }
                nuevo.getSig();
                temp.setSig(nuevo);
            }

        }

    }

    public void Clear() {
        NodoIn = null;
        NodoFin = null;
    }

    public void DeleteAt(int pos) throws Exception {
        //borrar la 1ra, borrar la ultima, solo 1 nodo
        int tama = size();
        Nodo temp = NodoIn;
        int Cont = 0;
        if (IsEmpty()) {
            throw new Exception("La lista está vacía");
        } else if (tama == 1) {
            Clear();
        } else {
            if (pos < 0 || (pos >= tama)) {
                throw new Exception("La posición es inválida");
            } else if (pos == 0) {
                NodoIn = NodoIn.getSig();
            } else {
                while (Cont != pos - 1) {

                    temp = temp.getSig();
                    Cont++;
                }
                temp.setSig(temp.getSig().getSig());
                if (pos == tama - 1) {
                    NodoFin = temp;
                }

            }

        }

    }

    public int findAt(int pos) throws Exception {
        int tama = size();
        Nodo temp = NodoIn;
        int Cont = 0;
        if (IsEmpty()) {
            throw new Exception("La lista está vacía");
        } else if (tama == 1) {
            return NodoIn.getEnterin();
        } else {
            if (pos < 0 || (pos >= tama)) {
                throw new Exception("La posición es inválida");
            } else if (pos == 0) {
                return NodoIn.getEnterin();
            } 
            else if (pos==tama) {
                return NodoFin.getEnterin();
            } else {
                while (Cont != pos) {

                    temp = temp.getSig();
                    Cont++;
                }
               return temp.getEnterin();
                

            }

        }

    }

}
