package exemplofila;

import java.util.Random;

/**
 *
 * @author paulinho
 */
public class ExemploFila {
    
    public static void main(String[] args) {
    
        Fila fila = new Fila(50);
        
//        //Adicionar valor na fila
//        if(!fila.isFull()){
//            fila.enqueue(12);
//        }
//        
//        //retornar valor da fila
//        if(!fila.isEmpty()){
//            System.out.println("item retirado da fila: "+fila.dequeue());
//        }
        
        //Adicionando números aleatórios na fila
        Random random = new Random();
        
        while(!fila.isFull()){
            int numero = random.nextInt(50);
            fila.enqueue(numero);
        }
        
        while(!fila.isEmpty()){
            System.out.println("Item retirado da fila: "+
                    fila.dequeue()+" ");
        }
        
        
    }
    
}
