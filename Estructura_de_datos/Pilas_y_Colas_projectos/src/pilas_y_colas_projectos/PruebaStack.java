package pilas_y_colas_projectos;

import java.util.*;


public class PruebaStack {

    public static void main(String args []){
    
        Stack <Number> pila = new Stack<>();
        
        
        //usa el metodo push
        pila.push(12L);
        System.out.println("se metio  12L");
        imprimirPila(pila);
        
        pila.push(34567);
        System.out.println("se metio  34567");
        imprimirPila(pila);
        
        pila.push(1.0F);
        System.out.println("se metio  1.0F");
        imprimirPila(pila);
        
        pila.push(1234.5678);
        System.out.println("se metio  1234.5678");
        imprimirPila(pila);
        
        
        
        //ELIMINA LOS ELEMENTOS DE LA PILA
        try{
        Number objetoEliminado = null;
        
        //saca elementos de la pila
        while(true){
        objetoEliminado = pila.pop();
        System.out.printf("se saco %s%n", objetoEliminado);
        imprimirPila(pila);
        }//fin del while
        
        
        }//fin del try
        
        catch(EmptyStackException e){
        e.printStackTrace();
        }
      
    }


  private static void imprimirPila(Stack<Number> pila){
        
        if(pila.isEmpty()){
        System.out.printf("la pila esta vacia %n%n");
        
        }//fin de la if
        else{
        System.out.printf("el elemento superior es :  %s%n", pila.peek());
        System.out.printf("la pila contiene: %s (cima)%n", pila);
        
        }
        
        
        }//fin de la funcion
        

    
}
