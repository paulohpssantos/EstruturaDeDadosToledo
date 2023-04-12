package ordenacaoselecao;

/**
 *
 * @author paulinho
 */
public class OrdenacaoSelecao {
    
    public static void main(String[] args) {
        
        int[] vetor = {30,20,10,40};
        
        for (int i = 0; i < vetor.length - 1; i++) {
            int posMenor = i;
            
            for(int j = i+1; j < vetor.length; j++){
                if(vetor[j] < vetor[posMenor]){
                    posMenor = j;
                }
            }
            
            if(posMenor != i){
                int aux = vetor[i];
                vetor[i] = vetor[posMenor];
                vetor[posMenor] = aux;
            }
            
        }
        for(int i = 0; i < vetor.length; i++){
            System.out.println("vetor["+i+"] = "+vetor[i]);
        }    
        
        
    }
    
}
