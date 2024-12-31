package org.example;

public class Nodo <T>{
    //atributo de tipo T que almacena una referencia al objeto que se guarda en el nodo

    private T valor;

    //referencia al siguiente nodo enlazado
    Nodo <T> siguiente;


    //constructor por defecto
    public Nodo (){
        valor = null;
        siguiente = null;
    }

    //devuelve el valor
    public T getValor(){
        return valor;
    }

    //modifica el valor
    public void   setValor(T valor){
        this.valor = valor;
    }

    //devuelve el atriubuto siguiente
    public Nodo <T> getSiguiente(){
        return siguiente;
    }


    //modifica el atributo siguiente
    public void setSiguiente(Nodo <T> siguiente){
        this.siguiente = siguiente;
    }







}
