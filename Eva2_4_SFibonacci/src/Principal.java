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
        System.out.println(Fibo(15));
    }
    public static  int Fibo(int nPos){
        
        if(nPos==0){
            return 0; 
        }else if (nPos==1){
        return 1;
        }
        else{
              return (Fibo(nPos-1)+Fibo(nPos-2));
                }
    }
    
}
