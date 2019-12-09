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
public class ListaDoble {

    private NodoDoble NodoIn;
    private NodoDoble NodoFin;

    public ListaDoble() {
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

    public void add(NodoDoble nuevo) {
        if (IsEmpty()) {
            NodoIn = nuevo;
            NodoFin = nuevo;
        } else {
            NodoFin.setSig(nuevo); //hacia delante
            nuevo.setAnt(NodoFin); //nuevo hacia el de atras
            NodoFin = nuevo; //el final sera el nuevo , delante
        }
    }

    public void printBack() {
        NodoDoble temp = NodoFin;
        while (temp != null) {

            System.out.print(temp.getEnterin() + " - ");
            temp = temp.getAnt();

        }
        System.out.println("");
    }

    public void print() {
        NodoDoble temp = NodoIn;
        while (temp != null) {

            System.out.print(temp.getEnterin() + " - ");
            temp = temp.getSig();

        }
        System.out.println("");
    }

    public int size() {

        int Tama = 0;
        NodoDoble temp = NodoIn;
        while (temp != null) {
            Tama++;
            temp = temp.getSig();

        }
        return Tama;
        //mejorar con funciones
    }

    public void AddBegin(NodoDoble nuevo) {
        if (IsEmpty()) {
            NodoIn = nuevo;
            NodoFin = nuevo;
        } else {
            nuevo.setSig(NodoIn);
            NodoIn = nuevo;
        }
    }

    public void InsertAt(int pos, NodoDoble nuevo) {
        int Tama = size();
        NodoDoble temp = NodoIn;
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
        NodoDoble temp = NodoIn;
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
        NodoDoble temp = NodoIn;
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
            } else if (pos == tama) {
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
