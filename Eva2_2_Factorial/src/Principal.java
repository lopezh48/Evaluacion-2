/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Factorial(20));
    }

    public static int Factorial(int iVal) {
        System.out.println("Valor "+iVal);
        if (iVal == 0) {
            return 1;
            
        } else {
            return (iVal * Factorial(iVal - 1));
            
        }

    }

}
