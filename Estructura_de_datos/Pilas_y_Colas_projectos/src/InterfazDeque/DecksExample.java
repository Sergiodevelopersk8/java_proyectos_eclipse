package InterfazDeque;
import java.util.*;
public class DecksExample {

    public static void main(String [] args){
    //mejor rendimiento para colas de doble terminacion 
    Deque<String> names2 = new ArrayDeque<>();
    
    names2.add("1");
    names2.add("2");
    names2.add("3");
    names2.add("4");
    names2.add("5");
    names2.add("6");
    names2.add("7");
    names2.add("8");
    names2.add("9");
        
    System.out.println(names2);
    
    System.out.println("head: " + names2.peek());
    
    System.out.println("tail: " + names2.peekLast());
    
    System.out.println("head-> " + names2 + " <- tail");
    
    System.out.println("Sacar elemento del head de la cola: " + names2.pollFirst());
    
    System.out.println("head-> " + names2 + " <- tail");
    
    }


    
}
