package exemplopesquisalinear;

import javax.swing.JOptionPane;

/**
 *
 * @author paulinho
 */
public class ExemploPesquisaLinear {

    public static void main(String[] args) {
        
        int[]vetor = {10,20,30,40,50};
        int numeroPesquisar = 40;
        
        JOptionPane.showMessageDialog(null, 
                "O elemento 40 está na posição: "+
                        pesquisaLinear(numeroPesquisar, vetor));
        
        int[]vetor2 = {10,20,30,40,50,40};
        JOptionPane.showMessageDialog(null, 
                "O elemento 40 está na posição: "+
                        pesquisaLinearRepetidos(numeroPesquisar, vetor2));
        
        
        JOptionPane.showMessageDialog(null, 
                "O elemento 40 está na posição: "+
                        pesquisaBinaria(numeroPesquisar, vetor));
        
    }
    
    public static int pesquisaLinear(int numPesq, int[]vet){
        
        for (int i = 0; i < vet.length; i++) {
            if(numPesq == vet[i]){
                return i;
            }
        }
        return -1;
    }
    
    public static String pesquisaLinearRepetidos(int numPesq, 
            int[]vet){
        String posicoes = "";
        for (int i = 0; i < vet.length; i++) {
            if(numPesq == vet[i]){
                posicoes += i;
                if(i < vet.length-1)
                    posicoes += ", ";
            }
        }
        return posicoes;
    }
    
    
    public static int pesquisaBinaria(int numPesq, int[]vet){
        int esquerda, meio, direita;
        esquerda = 0;
        direita = vet.length - 1;
        
        while(esquerda <= direita){
            meio = (esquerda + direita)/2;
            if(numPesq == vet[meio]){
                return meio;
            }
            if(numPesq > vet[meio]){
                esquerda = meio +1;
            }else{
                direita = meio -1;
            }
        }
        
        return -1;
    }
    
}
