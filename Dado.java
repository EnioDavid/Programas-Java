/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

import java.util.Random;

/**
 *
 * @author Enio
 */
public class Dado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random dado = new Random();
         
         int lado1 = 0;
         int lado2 = 0;
         int lado3 = 0;
         int lado4 = 0;
         int lado5 = 0;
         int lado6 = 0;
         
        for(int i=1; i <=10000; i++ ){
            
            int tentativas = dado.nextInt(6) + 1;           
            
            switch(tentativas){
                case 1:
                    lado1++;
                    break;
                case 2:
                    lado2++;
                    break;
                case 3:
                    lado3++;
                    break;
                case 4:
                    lado4++;
                    break;
                case 5:
                    lado5++;
                    break;
                case 6:
                    lado6++;
                    break;
                
            }
           
        }
             
        System.out.println("Numero 1: " + (float)lado1/100 + "%" );
        System.out.println("Numero 1: " + (float)lado2/100 + "%" );
        System.out.println("Numero 1: " + (float)lado3/100 + "%" );
        System.out.println("Numero 1: " + (float)lado4/100 + "%" );
        System.out.println("Numero 1: " + (float)lado5/100 + "%" );
        System.out.println("Numero 1: " + (float)lado6/100 + "%" );
        
        
        
        
        
        
    }
    
}
