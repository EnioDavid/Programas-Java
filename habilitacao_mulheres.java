/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_04;

import java.util.Scanner;

/**
 *
 * @author Enio
 */
public class Questao_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char sexo;
        int idade;
        int habilitacao;
        int mulheres = 0;
        int qtdIdade = 0;
        int qtdHabilitacao = 0;
        
        
        do{
            System.out.println("Informe seu sexo M ou F");
            sexo = entrada.next().charAt(0);
            System.out.println("Informe sua idade");
            idade = entrada.nextInt();
            System.out.println("Informe o tempo de habilitação em anos");
            habilitacao = entrada.nextInt();
        
            if(sexo == 'F' && habilitacao > 3 && idade >=24 || idade <= 30){
                mulheres = mulheres +1;
                qtdHabilitacao = qtdHabilitacao + 1;
                qtdIdade = qtdIdade +1;

            }
        }while(idade > 0);
        
        System.out.printf("%d \n %d \n %d \n",mulheres,qtdHabilitacao,qtdIdade);
        
        
    }
    
}
