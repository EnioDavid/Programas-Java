/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carronovo;

import java.util.Scanner;

/**
 *
 * @author Enio
 */
public class CarroNovo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor de fabrica do automovel: ");
        float valor = entrada.nextFloat();
        
        float valorTotal = (float) (valor*0.73);
        
        System.out.printf("O valor total do automovel é: %.2f ", (valorTotal+valor));
    }
    
}
