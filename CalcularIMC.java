/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularimc;

import java.util.Scanner;

/**
 *
 * @author Enio
 */
public class CalcularIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o seu peso e altura");
        
        float peso = entrada.nextFloat();
        float altura = entrada.nextFloat();
        
        float imc = (peso)/(altura*altura);
        
        System.out.printf("%-1.4f",imc );
        
       /* if (imc < 20){
            System.out.println("Você está abaixo do peso");  
        }
        else if(imc >= 25){
            System.out.println("Você está acima do peso");
        }
        
        else{
            System.out.println("Você está no peso ideal");
        }*/
    }
    
}
