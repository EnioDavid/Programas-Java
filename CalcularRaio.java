/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularraio;

import java.util.Scanner;

/**
 *
 * @author Enio
 */
public class CalcularRaio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double volume;
        int raio;
        
        System.out.println("informe o valor de raio: ");
        raio = entrada.nextInt();
        
        volume = (4/3.0*3.14159)*(raio)*(raio)*(raio);
        
        System.out.printf( "Valor do volume é: %.3f \n", volume );
    }
    
}
