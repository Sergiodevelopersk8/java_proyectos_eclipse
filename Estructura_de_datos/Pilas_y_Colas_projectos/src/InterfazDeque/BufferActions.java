package InterfazDeque;
import java.util.*;
public class BufferActions {

Deque<String> bufferActions = new ArrayDeque<>();
Deque<String> redoActions = new ArrayDeque<>();



//metodo para registrar las acciones 

public void doAction(String action){

System.out.println(action);

insertAction(action);

System.out.println(bufferActions);



}//fin de doAction

public void undo(){

    if(bufferActions.isEmpty()){
    
    return;
    
    }
    
    
    System.out.println("undo");
    String action = bufferActions.pollLast();
    redoActions.push(action);
    System.out.println(bufferActions);
    
}//fin undo


public void redo(){
    
    System.out.println("redo");
    String action  = redoActions.pop();
    insertAction(action);
    System.out.println("Redo actions: " + redoActions);
     System.out.println(bufferActions);
}//fin de redo


private void insertAction(String action){

    //tail
    bufferActions.offerLast(action);

}// fin de insertAction



public static void main(String [] args){

    BufferActions buffer = new BufferActions();
    buffer.doAction("Copiar");
    buffer.doAction("Pegar");
    buffer.doAction("Escribir hola");
    buffer.doAction("Borrar");
    buffer.undo();
    buffer.undo();
    buffer.redo();

}//




    
}
