package ListaEnlazada;

//clase de nodo
public class Nodo {

private Object data;
private Nodo next;

//constructor
public Nodo(Object dato){

this .data = dato;
}

//retorna el valor
public Object value(){
return this.data;
}

//apunta al siguiente nodo
public Nodo next(){

    return this.next;

}

//pasa al siguiente nodo
public void setNext(Nodo next){

this.next = next;

}

//imprime el valor de la lista enlazada
public void showContent(){

    System.out.println("Value:  " + data);

}




    
}//fin de la clase 
