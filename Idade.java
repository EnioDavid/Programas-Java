/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idade;

import java.util.Scanner;

/**
 *
 * @author Enio
 */
public class Idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int anoAtual = 2019;
       int qtdDia = 30;
       int qtdMes = 365;
       
        System.out.println("Informe o ano, dia e mês de seu nascimento: ");
        int ano = entrada.nextInt();
        int mes = entrada.nextInt();
        int dia = entrada.nextInt();
        
        System.out.println("Informe o ano, dia e mês atual: ");
        
        int valDia = qtdDia - dia;
        int valorAno = ((anoAtual - ano) * qtdMes) + valDia;
    
        System.out.printf("Sua idade em dias é %d \n", valorAno);    
        
        
    }
    
}
