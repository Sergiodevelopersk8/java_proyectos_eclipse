package org.example;

public class Pila <T> {

    //ATRIBUTO CABEZA QUE APUNTA AL TOPE LA PILA
    private Nodo <T> cabeza;

    //almacena el total de  el elemento de pila
    private int tamanio;

    //constructopr por defecto
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }

    //devuelve el tamaño de elemento de pila
    public int getIamanio(){
        return tamanio;
    }

    //verificar si la pila esta vacia
    public boolean esVacia(){
        return (cabeza == null);
    }

    //Apila un elemento nuevo
    public void apilar(T valor){
        //crear un nuevo nodo
        Nodo <T>  nuevo = new Nodo<T>();

        //fijar el valor dentro dle nodo
        nuevo.setValor(valor);

        if(esVacia()){
            //cabeza apunta al nuevo nodo
            cabeza = nuevo;
        }
        else{
            //se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);

            //la nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        //incrementa el tamaño de la pila
        tamanio++;

    }

    //eliminar un elemento de la pila
    public void retirar(){
        if(!esVacia()){
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }
//devuelve el elemento almacenado en el tope de la pila
    public T cima(){
        if(!esVacia()){
            return cabeza.getValor();
        }
        else{
            return null;
        }
    }




}
