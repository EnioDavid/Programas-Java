/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplo;

import java.util.Scanner;

/**
 *
 * @author Enio
 */
public class Multiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int primeiroNumero;
        int segundoNumero;
        
        System.out.println("Informe o valor do primeiro e segundo nuumero");
        primeiroNumero = entrada.nextInt();
        segundoNumero = entrada.nextInt();
        
        int resto = primeiroNumero % segundoNumero;
        
        if (resto == 0 ){
            System.out.println("Os valores são multiplos");
            
        }
        else
            System.out.println("Os valores não são multiplos");
        
    }
    
}
