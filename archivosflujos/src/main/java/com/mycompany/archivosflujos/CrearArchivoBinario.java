package com.mycompany.archivosflujos;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrearArchivoBinario {
    
private ObjectOutputStream salida;

public void abrirArchivo(){

    try {
        salida = new ObjectOutputStream(new FileOutputStream("personas.ser"));
    } 
    
    catch (FileNotFoundException ex) {
       ex.printStackTrace();
    }
    catch (IOException ex) {
       ex.printStackTrace();
    }

}

public void agregarRegistros(){
Persona objPersona;

String nombre;
String direccion;
String nacionalidad;
int edad;
double salario;

Scanner entrada = new Scanner (System.in);


System.out.println("Introduzca los datos de la persona, \n para terminar escriba el indicador"
+ "de fin de archivos. \n Para unix/Linux o Mac os X escriba <ctr> d y oprima intro."
+ "Para windows escriba \n  final <ctr> z y oprima intro.\n\n");

System.out.println("Escriba el nombre, direccion, la nacionalidad, \n " + "la edad y el salario de la persona");
if(entrada.next() == "final"){
System.out.println("ya finalizo");

}
while(entrada.hasNext()){
try{
    nombre = entrada.next();
    direccion = entrada.next();
    nacionalidad = entrada.next();
    edad = entrada.nextInt();
    salario = entrada.nextDouble();
    
    objPersona = new Persona(nombre, direccion, nacionalidad, edad, salario);
    salida.writeObject(objPersona);
    
    
}

catch(IOException ex){

    ex.printStackTrace();


}
System.out.println("Escriba el nombre, direccion, la nacionalidad, \n " + "la edad y el salario de la persona");

}


}


public void cerrarArchivo(){

try{

    if(salida != null){
    salida.close();
    }


}

catch(IOException ex){
 ex.printStackTrace();
}


}


public static void main (String [] args){

    CrearArchivoBinario aplicacion = new CrearArchivoBinario();
    
    aplicacion.abrirArchivo();
    aplicacion.agregarRegistros();
    aplicacion.cerrarArchivo();
    
    

} 




}
