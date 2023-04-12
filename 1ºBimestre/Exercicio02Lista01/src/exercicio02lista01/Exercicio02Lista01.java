package exercicio02lista01;

import javax.swing.JOptionPane;

/**
 *
 * @author paulinho
 * 
 * Crie uma classe que tenha um vetor de 
 * inteiros de 20 posições, e solicite ao 
 * usuário informar um valor,  depois mostre 
 * o valor informado e sua posição;
 */
public class Exercicio02Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[]vetorNumeros = new int[20];
        
        for(int i = 0; i < vetorNumeros.length; i++){
            String numero = 
                    JOptionPane.showInputDialog("Informe um número");
            
            vetorNumeros[i] = Integer.parseInt(numero);
            
//            JOptionPane.showMessageDialog(null, 
//                    vetorNumeros[i]+ "adicionado na posicao :"+i);
        }
        
        String mensagem = "Valores informados:\n";
        for(int i = 0; i < vetorNumeros.length; i++){
            mensagem += vetorNumeros[i]+
                    " adicionado na posicao: ["+i+"]\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
