package pilas_y_colas_projectos;

import java.util.*;

public class QueueExample {
    
    public static void main(String [] args){
    
    Queue<Integer> queue = new LinkedList<>();
    
    
    //añade los elementos {0,1,2,3,4} a la queue
    
    for(int i = 0; i < 5; i++){
    
        queue.add(i );
    
    
    }
    
    System.out.print("elementos de la cola: " + queue);
    System.out.println("" );
    
    //eliminar el head
    int head = queue.remove();
     System.out.print("el head de esta cola: " + head);
    System.out.println("" );
    
     System.out.print("elementos de la cola despues del metodo remove/polll:  " + queue);
    System.out.println("" );
    
    
    //tamaño de la cola
    int size = queue.size();
     System.out.print("El tamaño de la cola es: " + size);
    System.out.println("la cabeza de la cola es " + queue.peek() );
    
    
    
    
    }
    
    
    
}
