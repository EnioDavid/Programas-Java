/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valoresaleatorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author Enio
 */
public class ValoresAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 0;
       
        //Os termos List e ArrayList precisam está com as letras maiusculas conforme abaixo:
        List number = new ArrayList();
       
        // Este FOR serve para gerar 10 numeros em uma variavel do tipo Arrray. 
        for( n = 0; n <=10; n++){
            number.add(n);
        }
        
        //Este comando serve para embaralhar os numeros e o Collections precisa está com a primeira letra maiuscula
        Collections.shuffle(number);
        
        
        for(n=0; n<=10; n++){
            System.out.println("Numeros: " + number.get(n) + "");
        }
        
        
        
        
        
    }
    
}
