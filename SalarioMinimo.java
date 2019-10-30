/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salariominimo;

import java.util.Scanner;

/**
 *
 * @author Enio
 */
public class SalarioMinimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       float salario;
       float salarioMinimo;
       float quantidade;
       
        System.out.println("Informe o valor do ssalario minimo atual e o seu salario: ");
        salario = entrada.nextFloat();
        salarioMinimo = entrada.nextFloat();
        
        quantidade = salario/salarioMinimo;
        
        System.out.printf("O salario que você recebe é equivalente a %.1f \n", quantidade);
    }
    
}
