package pilas_y_colas_projectos;
import java.util.*;

public class PriotityQueueExample {
    
    
    public static void main(String args []){
    
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        queue.add(6);
        queue.add(9);
        queue.add(8);
        queue.add(1);
        queue.add(5);
        queue.add(6);
        queue.add(0);
        queue.add(11);
        queue.add(10);
        queue.add(4);
        
        System.out.println(queue);
        
    
        //desencolar un elemento
        System.out.println("elemento desencolado : " + queue.remove());
        System.out.println(queue);
        
        
    }//fin del main
    
    
    
}// fin de la clase
