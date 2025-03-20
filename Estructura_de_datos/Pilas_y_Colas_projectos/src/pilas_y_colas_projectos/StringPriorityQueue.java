package pilas_y_colas_projectos;
import java.util.*;



public class StringPriorityQueue {

public static void main (String args []){

Queue<String> queue = new PriorityQueue<>();



//add items a la cola de prioridad

queue.add("C#");
queue.add("C");
queue.add("C++");
queue.add("java");
queue.add("js");


//mostrar el elemento de mayor prioridad

System.out.println("el valor del head de este priorityqueue es : " + queue.peek());

//remover el elemento de mayor prioridad o el head
//remover el elemento de mayor prioridad o el head
queue.poll();
System.out.println("despues de remover el elemento de moyor prioridad la cola queda de la siguiente manera : ");
Iterator<String> itr2 = queue.iterator();

//recorrido
while(itr2.hasNext()){

    System.out.println(itr2.next());

}

//obteniendo los elementos de la cola en un array utilizando to array()

Object [] arr = queue.toArray();


}
  


    
}
