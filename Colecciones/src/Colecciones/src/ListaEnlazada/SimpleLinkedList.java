package ListaEnlazada;

public class SimpleLinkedList {

    private Nodo first; // referencia al primer nodo de la lista enlazada

    //constructor
    public SimpleLinkedList() {
        this.first = null;
    }

    //inserta en la lista
    public void push(Object obj) {

        //este nuevo nodo será la cabeza de la lista enlazada simple
        Nodo newNode = new Nodo(obj);

        //ahora el nuevo nodo creado es el primero (apunta primero a first y luego newNode es el nuevo first)
        newNode.setNext(this.first);
        this.first = newNode;

    }

    //elimina un elemento en el nodo
    public Nodo pop() {
        Nodo temp = this.first;//guardar referencia al primer nodo en la variable temp
        
        this.first = this.first.next();//el primero apunta al siguiente

        return temp;

    }

    //elimina un elemento del nodo
    public Nodo delete(Object val) {

        Nodo currentNode = this.first;//nodo actual
        Nodo previousNode = this.first;//nodo anterior

       /* 
     Continuar iterando mientras el valor del nodo actual sea diferente al valor
    que se está buscando. Esto nos permite recorrer la lista hasta encontrar
    el nodo deseado o llegar al final de la lista.
     */
        while (!currentNode.value().equals(val)) {
            
            //si currentNode apunta al siguente y es nulo
            if (currentNode.next() == null) {
                //retorna nulo
                return null;

            } else {

                //entonces el nodo anterior sera igual al nodo actual que apunta al siguiente
                previousNode = currentNode.next();

            }//fin del else
        }//fin del while

         // Si el nodo a eliminar es el primero, actualiza el puntero `first`
        if (currentNode == this.first) {

            //el primero apunta al siguente
            this.first = this.first.next();

        }//fin del if
        else {

            // Elimina el nodo actual de la lista enlazando el nodo anterior con el siguiente
            previousNode.setNext(currentNode.next());

        }
        return currentNode;
    }

    //valida si esta vacio
    public boolean isEmpty() {
        //retorna el primero si es igual a nulo
        return (this.first == null);

    }

    //cuenta los nodos de la lista
    public Nodo contains(Object val) {

        //el nodo actual es igual al primero
        Nodo currentNode = this.first;

         /* 
     Continuar iterando mientras el valor del nodo actual sea diferente al valor
    que se está buscando. Esto nos permite recorrer la lista hasta encontrar
    el nodo deseado o llegar al final de la lista.
     */
        while (!currentNode.value().equals(val)) {

            //si el nodo actual es igual a null
            if (currentNode == null) {
                //retorna null
                return null;
            }//fin del if
            else {
                //el nodo actual apunta al siguiente nodo
                currentNode = currentNode.next();
            }

        }
        //retorna el nodo actual
        return currentNode;
    }

    
    //inserta un valor despues del valor indicado
    public Nodo insert(Object value, Object newValue) {

        
        Nodo newNode = new Nodo(newValue);//el nuevo nodo toma el parametro de newValue en el constructor de nodo

        Nodo currentNodo = this.first;//el nodo actual es el primero
 /* 
     Continuar iterando mientras el valor del nodo actual sea diferente al valor
    que se está buscando. Esto nos permite recorrer la lista hasta encontrar
    el nodo deseado o llegar al final de la lista.
     */
        while (!currentNodo.value().equals(value)) {
//si el nodo actual es igual a null
            if (currentNodo.next() == null) {
                //retorna null
                return null;
            } else {
//el nodo actual apunta al siguiente nodo
                currentNodo = currentNodo.next();
            }

        }

        
        newNode.setNext(currentNodo.next());//el nuevo nodo pasa al siguente tomando el nodo actual que apunta al siguiente
        currentNodo.setNext(newNode); //el nodo actual pasa al siguiente que es el nuevo nodo

        //se retorna el nuevo nodo
        return newNode;

    }

    //imprime el contenido de la lista
    public void printContent() {

        Nodo currentNode = first;

        System.out.println("mostrar elementos de la lista enlazada");
        while (currentNode != null) {

            currentNode.showContent();
            currentNode = currentNode.next();

        }

    }

}//fin de la clase 
