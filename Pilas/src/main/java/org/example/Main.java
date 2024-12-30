package org.example;

public class Main {
    public static void main(String[] args) {
        //crear una nueva pila de enteros
        Pila<Integer> pila2 = new Pila<Integer>();

        //se apilan algunos datos enteros
        pila2.apilar(2);
        pila2.apilar(5);
        pila2.apilar(7);
        System.out.println("El tope d ela pila es : " + pila2.cima());

        //se desapila
        pila2.retirar();
        System.out.println("El tope de la pila es : " + pila2.cima());

        // se desapila. como la pila esta vacia devuelve null
        pila2.retirar();
        System.out.println("El tope de la pila es : " + pila2.cima());

        pila2.retirar();
        System.out.println("El tope de la pila es : " + pila2.cima());

    }
}