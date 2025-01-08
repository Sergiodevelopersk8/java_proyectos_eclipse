package Listas.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {

public static void main(String [] args){
    //creación de arraylist
List<String> ListaColores = new ArrayList<>();
    
    
//creación mediante la clase de Arrays
String [] nombres = {"sergio","abby", "kiernan"};
    
List<String> listaNombres = Arrays.asList(nombres);  

//Adicion de elemento individuales
ListaColores.add("Azul");
ListaColores.add("Morado");
ListaColores.add("Naranja");
    

//construir apartir de otra lista

List<String> elementos = new ArrayList(ListaColores);

    
//Adicion de elementos de otra coleccion
   elementos.addAll(listaNombres); 
    
    
//iteracion de elementos de otra coleccion
    System.out.println("lista nombres");
    listaNombres.forEach(System.out::println);
    System.out.println("lista colores");
    ListaColores.forEach(System.out::println);
    System.out.println("lista elementos");
    elementos.forEach(System.out::println);
    
    //System.out::println -> es una expresion lambda
    


//iteracion a través del arraylist

 ListIterator <String> iterador = ListaColores.listIterator();
    
    System.out.println("\n\n recorriendo el iterador : ");
while(iterador.hasNext()){
    System.out.println("Color : " + iterador.next());
}

    System.out.println("\n\n inverso el iterador : ");
while(iterador.hasPrevious()){
    System.out.println("Color : " + iterador.previous());
}


//borar
while(iterador.hasNext()){
    
    if(iterador.next().equals("Morado")){
    
    iterador.remove();
    }
    
    
}

System.out.println("\n\nrecorriendo el iterador sin un elemento : ");
for(ListIterator <String> iter = ListaColores.listIterator(); iter.hasNext();){
    System.out.println("Color : " + iter.next());
}
//convertir en array
    
//insertar elemento en una posicion aleatoria






}
    
    
}
