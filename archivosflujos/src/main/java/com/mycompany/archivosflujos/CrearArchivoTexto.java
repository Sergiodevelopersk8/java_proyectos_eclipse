package com.mycompany.archivosflujos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CrearArchivoTexto {
    

public static void main (String [] args){

    FileWriter fw = null;
    PrintWriter salida = null;

try{
    
    Scanner sc = new Scanner(System.in);
    fw = new FileWriter("C:\\Users\\DrawH\\Desktop\\entrenandocode2022\\Curso_de_Java\\archivosflujos\\archivos\\datos.txt", true);
    salida = new PrintWriter(fw);
    String cadena;
    System.out.println("introduce texto para la cadena fin");
    cadena = sc.nextLine();
    while(!cadena.equalsIgnoreCase("fin")){
    salida.println(cadena);
    cadena = sc.nextLine();
    }/*fin del while */
    salida.flush();
    
}/*fin del try */


catch(IOException e){
Logger.getLogger(CrearArchivoTexto.class.getName()).log(Level.SEVERE, null , e);


}/*fin del catch */
finally{
salida.close();

}






}/*fin de static void */

} /*fin de la clase */
