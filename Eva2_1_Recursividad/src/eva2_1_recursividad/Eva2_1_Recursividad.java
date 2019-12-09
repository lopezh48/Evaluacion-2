/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_recursividad;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Eva2_1_Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("introduce un numerin");
        Scanner tecladin=new Scanner(System.in);
        int iVal=tecladin.nextInt();
        for (int i = iVal; i >= 1; i--) {
            System.out.print(i+"-");
        }
        System.out.println("");
        System.out.println("------------");
        imprenta(iVal);
        System.out.println("--------");
        
    }
    public static void imprenta(int iVal){
        System.out.print(iVal+"-");
        if(iVal>1)
        imprenta(iVal-1);
    }
    public static void imprenta2(int iVal, int inc){
        
    }
   
    //ahora de 1 hasta el valor del user
    
}
