/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularmaça;

import java.util.Scanner;

/**
 *
 * @author Enio
 */
public class CalcularMaça {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float valorTotal;
        
        System.out.println("Quantas maças você gostaria?");
        int macas = entrada.nextInt();
        
        if (macas < 12){
            valorTotal = macas * 1.30f;
            System.out.printf("Valor total %.2f",valorTotal);
        }
        else
            valorTotal = macas * 1f;
            System.out.printf("Valor total %.2f",valorTotal);
    }
    
}
