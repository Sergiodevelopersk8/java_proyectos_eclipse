package org.example;

public class Main {
    public static void main(String[] args) {

        Cola <Integer> cola = new Cola<Integer>();

        cola.encolar(12);
        cola.encolar(13);
        cola.encolar(14);
        cola.encolar(15);

        System.out.println("el primer elemento de la cola es : " + cola.frente());


        cola.desencolar();
        System.out.println("el primer elemento de la cola es : " + cola.frente().toString());

        cola.desencolar();
        System.out.println("el primer elemento de la cola es : " + cola.frente());

        cola.desencolar();
        System.out.println("el primer elemento de la cola es : " + cola.frente());

        cola.desencolar();
        System.out.println("el primer elemento de la cola es : " + cola.frente());
    }
}