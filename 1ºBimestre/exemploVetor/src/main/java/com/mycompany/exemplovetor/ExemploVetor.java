package com.mycompany.exemplovetor;

import javax.swing.JOptionPane;

/**
 *
 * @author paulinho
 */
public class ExemploVetor {

    public static void main(String[] args) {
        
        String[]vetorNomes = new String[8];
        
        vetorNomes[0] = "Paulo"; 
        vetorNomes[1] = "Juca";
        vetorNomes[2] = "Maria";
        vetorNomes[3] = "Jose";
        vetorNomes[4] = "Pedro";
        vetorNomes[5] = "Joao";
        vetorNomes[6] = "Thiago";
        vetorNomes[7] = "Carol";
        
        for(int i = 0; i < 8; i++){
            
            String nome = JOptionPane.
                    showInputDialog("INFORME UM NOME:");
            
            vetorNomes[i] = nome;
            
        }
        String mensagem = "Os nomes informados são:\n";
        for(int i = 0; i < 8; i++){
            
            mensagem = mensagem + vetorNomes[i]+"\n";
                    
        }
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
}
