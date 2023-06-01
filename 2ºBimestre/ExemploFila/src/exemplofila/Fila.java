package exemplofila;

/**
 *
 * @author paulinho
 */
public class Fila {
    
    private int[]vetorDados;
    private int frente;
    private int fim;
    private int qtdItens;
    
    public Fila(int tamanho){
        vetorDados = new int[tamanho];
        frente = 0;
        fim = -1;
        qtdItens = 0;
    }
    
    public void enqueue(int numero){
        if(fim == vetorDados.length -1){
            fim = -1;
        }
        
        vetorDados[++fim] = numero;
        qtdItens++;
    }
    
    public int dequeue(){
        int aux = vetorDados[frente++];
        if(frente == vetorDados.length){
            frente = 0;
        }
        qtdItens--;
        return aux;
    }
    
    //Retorna verdadeiro se a fila estiver vazia
    public boolean isEmpty(){
        return qtdItens == 0;
    }
    
    public boolean isFull(){
        return qtdItens == vetorDados.length;
    }
    
}
