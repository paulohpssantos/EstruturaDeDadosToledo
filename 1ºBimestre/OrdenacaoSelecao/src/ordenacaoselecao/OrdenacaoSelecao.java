package ordenacaoselecao;

/**
 *
 * @author paulinho
 */
public class OrdenacaoSelecao {
    
    public static void main(String[] args) {
        
        int[] vetor = {45,20,33,40,50,2,15,88,8};
        
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
        String msg = "";
        for(int i = 0; i < vetor.length; i++){
            msg += vetor[i];
            if(i < vetor.length - 1)
                msg+= ",";
        }
        System.out.println(msg);
        
        
    }
    
}
