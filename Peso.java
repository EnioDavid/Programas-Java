/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Enio David Santos Mendes Lima
//Calcular Peso

package peso;

import java.util.Scanner;

/**
 *
 * @author Enio
 */
public class Peso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Criaão Variaveis
        int IdadePessoa1;
        float pesoPessoa1;
        int pessoa = 1;
        
        int Idade10 = 0;
        int Idade20 = 0;
        int Idade30 = 0;
        int idadeMaiorQue30 = 0;
        
        
        float faixaEtaria10 = 0;
        float faixaEtaria20 = 0;
        float faixaEtaria30 = 0;
        float maiorQue30 = 0;
        
        
        float mediaPeso10 = 0;
        float mediaPeso20 = 0;
        float mediaPeso30 = 0;
        float mediaPesoM30 = 0;
        
        do{
            System.out.printf("Insira a Idade e o Peso da pessoa %d \n", pessoa);
            
            IdadePessoa1 = entrada.nextInt();
            pesoPessoa1 =  entrada.nextFloat();
            
            if(IdadePessoa1 <= 10 && IdadePessoa1 > 0){
                    faixaEtaria10 = faixaEtaria10 + pesoPessoa1; 
                    Idade10++;
                }
            
                else if(IdadePessoa1 <= 20){
                    faixaEtaria20 = faixaEtaria20 + pesoPessoa1; 
                    Idade20++;
                }
            
                else if(IdadePessoa1 <= 30){
                    faixaEtaria30 = faixaEtaria30 + pesoPessoa1; 
                    Idade30++;
                }
            
            else {
                maiorQue30 = maiorQue30 + pesoPessoa1; 
                idadeMaiorQue30++;
            }
            
            pessoa++;
        
        }while(pessoa < 5);
        
        mediaPeso10 = faixaEtaria10 / Idade10;
        mediaPeso20 = faixaEtaria20 / Idade20;
        mediaPeso30 = faixaEtaria30 / Idade30;
        mediaPesoM30 = maiorQue30 / idadeMaiorQue30;
        
        System.out.printf("\n %d pessoas com faixa etaria de 1 a 10 anos \n a média de peso é: %.2f \n**********\n",Idade10,mediaPeso10);
        System.out.printf("\n %d pessoas com faixa etaria de 11 a 20 anos \n a média de peso é: %.2f \n**********\n ",Idade20,mediaPeso20);
        System.out.printf("\n %d pessoas com faixa etaria de 21 a 30 anos \n a média de peso é: %.2f \n**********\n ",Idade30,mediaPeso30);
        System.out.printf("\n %d pessoas com faixa etaria maior que 30 \n a média de peso é: %.2f \n***********\n ",idadeMaiorQue30,mediaPesoM30);
        
    }
}
