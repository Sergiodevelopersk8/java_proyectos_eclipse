package colecciones;

import java.util.*;

public class ViewCollections {

public static void main(String [] args){

String [] nombres = {"Sergio", "Abby","Kiernan"};

List <String> nombreList = Arrays.asList(nombres);

for(String nombre : nombreList){

    System.out.println(nombre);

}

    System.out.println("\nNombres depués de la modificación");
    nombres[2] = "Landry";
    
    for(String nombre : nombreList){

    System.out.println(nombre);

}
    
    List<String> nombreList2 = new ArrayList<>(Arrays.asList(nombres));


    System.out.println("\nNombres de la lista de nombres 2");

    for(String nombre : nombreList2){

    System.out.println(nombre);

}

    System.out.println("\nNombres de la sublista: ");

    List<String> sublista = nombreList2.subList(0,1);
    for(String string : sublista){

    System.out.println(string);

 }
    
sublista.add("Sergio Merino");

System.out.println("\nNombres de la sublista: ");

    for(String string : sublista){

    System.out.println(string);

 }

    
    nombreList2.set(0,"Sergio Cortez");
    System.out.println("\nNombres de la sublista: ");

    for(String string : sublista){

    System.out.println(string);

 }
    
    System.out.println("\nLista original después de todo esto: ");

    for(String nombre : nombreList2){

    System.out.println(nombre);

 }
    
    
    

}


    
}
