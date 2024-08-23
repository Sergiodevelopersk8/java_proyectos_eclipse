
package com.mycompany.archivosflujos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Draw
 */
public class LeerArchivoTexto {

public static void main(String [] args){
FileReader fr = null;


    try{
    
    fr = new FileReader("C:\\Users\\DrawH\\Desktop\\entrenandocode2022\\Curso_de_Java\\archivosflujos\\archivos\\datos.txt");
    BufferedReader entrada = new BufferedReader(fr);
    String cadena = entrada.readLine();
    
    while(cadena != null){
        
     System.out.println(cadena);
     cadena = entrada.readLine();
        
        
    }/*fin de while */
    
    
    }/*fin de try */
    
    catch(FileNotFoundException fex){
    System.out.println(fex.getMessage());
    }
    catch(IOException ex){
    
    System.out.println(ex.getMessage());
    
    }/*fin de catch */
    
    finally{
    
        try{
        if(fr != null){
        
        fr.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
            
        }
        
       catch(IOException ex){
    
    System.out.println(ex.getMessage());
    
    }/*fin de catch */
    
    
    }
    
    
    
    

}/*fin de main */
    
    
    

    
}/*fin de la clase */
