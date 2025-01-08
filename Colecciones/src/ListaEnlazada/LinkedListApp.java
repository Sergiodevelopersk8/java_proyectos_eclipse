package ListaEnlazada;

public class LinkedListApp {

public static void main(String [] args){

    SimpleLinkedList list = new SimpleLinkedList();
    
    list.push(1.23);
    list.push(19.23);
    list.push(12.23);
    
    list.printContent();
    
    Nodo nodo = list.insert(19.23,78.4);
    if(nodo == null){
    System.out.println("no se pudo insertar el nuevo nodo");
    }else{
    
        System.out.println("el nodo se inserto correctamente");
    
    }
    
        System.out.println("el nuevo contenido de la lista es : ");
        
    list.printContent();
    
    nodo = list.contains(1.23);

    if(nodo == null){
    
        System.out.println("el nodo se ha encontrado ");
            
    }//fin if
    
    else{
        
        System.out.println("el valor 1.23 se ha encontrado en la lista");
    }
    
        System.out.println("eliminar nodo");
    
        while(!list.isEmpty()){
        
            nodo = list.pop();
        System.out.println("nodo eliminar");
            nodo.showContent();
        
        
        }
    
    list.printContent();
    
list.push("cat");
list.push("dog");

    list.printContent();
    
    list.delete("dog");
    
        System.out.println("lista despues eliminado dog");
    
    list.printContent();
}


    
}
