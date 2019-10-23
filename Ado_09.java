// Jogo simples de adivinhar o numero gerado aleatoriamente.

package ado_09;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enio.dsmlima
 */
public class Ado_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerar = new Random();
        
        int numero,usuario,result,contador=0,ok = 0;
        
        numero = gerar.nextInt(100);
        
       
        
        do{
                       
            if(contador == 0){
                System.out.println("Adivinhe o numero gerado: ");
                usuario = entrada.nextInt();
            }
            else{
                System.out.println("digite um outro numero: ");
                usuario = entrada.nextInt();
            }
             
            if(usuario < numero){
                result = numero-usuario;
            }
            else{
                result = usuario-numero;
            }

            if(result == 1){
                System.out.println("TÁ QUENTE");
            }
            else if(usuario == numero){
                System.out.println("Parabéns você acertou");
                ok = 1;
            }
            
            contador++;
            
            if(contador == 5){
                System.out.println("\n Quantidade de tentativas excedidas.\n");
            }
            
        }while(ok != 1 && contador <=4);
        
    }
    
}
