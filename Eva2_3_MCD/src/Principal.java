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
        System.out.println(MCD(420, 69));
    }
    public static int MCD(int dividendo, int divisor){
        System.out.println(dividendo +"/"+ divisor);
        if(divisor==0){
            return dividendo;
        }else{
            int iResi=dividendo%divisor;
            return MCD(divisor, iResi);
        }
    }
  
    
}
