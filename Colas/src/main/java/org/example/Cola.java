package org.example;

public class Cola <T>{
    //atributo de la cabeza que apunta al primer elemento d ela cola
    private Nodo <T> cabeza;

    //almacena el total de elemento de la cola
    private Nodo <T> cola;

    //almacena el total del elemento de la cola
    private int tamanio;

    //constructor por defecto
    public Cola(){
        cabeza = null;
        cola = null;
        tamanio = 0;
    }



    //devuelve el tamaño d ela cola
    public int getTamanio(){
        return tamanio;
    }

    //valida si la cola esta vacia
    public boolean esVacia(){
        return( cabeza == null);
    }


    //encolar un nuevo elemento
    public void encolar( T valor){
        //crea un nuevo nodo
        Nodo <T> nuevo = new Nodo <T> ();

        //fijar el valor dentro del nodo
        nuevo.setValor(valor);

        if(esVacia()){
            //cabeza y cola apuntan al nuevo
            cabeza = nuevo;
            cola = nuevo;
        }
        else{
            //se enlaza el campo siguiente de la cola con el nuevo
            cola.setSiguiente(nuevo);

            //la cola pasa a ser nuevo
            cola = nuevo;

        }
        //incrementa el tamanio
        tamanio++;

    }

    //elimienar el primer elemento de la cola
    public void desencolar(){
        //si no es vacia
        if(!esVacia()){
            //verifica si hay un solo elemento en la cola
            if (cabeza == cola) {

                cabeza = null;
                cola = null;
            } else {
                //se elimina el primer elemento de la cola desplazando la cabeza al siguiente nodo

                cabeza = cabeza.getSiguiente();

            }
            //se disminuye el tamaño
            tamanio--;
        }
    }
    //devuelve el primer elemento de la cola
    public T frente(){
        if(!esVacia()){
            return cabeza.getValor();
        }
        else{
            return null;
        }
    }

}
