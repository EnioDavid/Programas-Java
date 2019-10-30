/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;

import java.util.Scanner;

/**
 *
 * @author Enio
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int valor;
       int fatorial = 1;
       int validador = 0;
       
       System.out.println("Insira um valor para calculo de Fatorial: ");
       int numero = entrada.nextInt();
       
       do{
            if(numero > 0){
                validador = 1;
            }
            else{
                System.out.printf("Valor inserido precisa ser maior que 0. \n Insira novamente");
                numero = entrada.nextInt();
           
                validador = 0;
            }
        }while(validador == 0);
          
        for( valor = 1 ; valor <= numero; valor ++){
            
                fatorial = fatorial*valor; 
            }
        
       System.out.println("O fatorial de " + numero + " é "  + fatorial);
       
    }
}
