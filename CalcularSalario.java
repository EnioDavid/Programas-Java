/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularsalario;

import java.util.Scanner;

/**
 *
 * @author Enio
 */
public class CalcularSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Informe o valor de seu salario bruto: ");
        float salarioBruto = entrada.nextFloat();
        
        
        float inss = salarioBruto * 0.08f;
        float ir = salarioBruto * 0.15f;
        float desconto = salarioBruto * 0.23f;
        float bonus = (salarioBruto - desconto)*0.0575f;
        float salarioLiquido = (salarioBruto - desconto) + bonus;
        
        System.out.printf("Segue os valores referente ao seu salario \n INSS: R$ %.2f \n IR: R$ %.2f \n Bônus: R$ %.2f \n Salario Bruto: %.2f \n Salario Liquido: %.2f \n" ,inss,ir,bonus,salarioBruto,salarioLiquido );
        
    }
    
}
