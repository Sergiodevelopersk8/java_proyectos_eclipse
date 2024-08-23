
package com.mycompany.archivosflujos;
import  java.io.Serializable;
/**
 *
 * @author Draw
 */
public class Persona implements Serializable{
    
    private String nombre;
    private String direccion;
    private String nacionalidad;
    int edad;
    double salario;
    
    
    public Persona(String nombre, String direccion, String nacionalidad, int edad, double sal){
    
        this.nombre = nombre;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.salario = sal;
    
    
    }
    
    public String getNacionalidad(){
    return nacionalidad;
    
    }
   
    public void setNacionalidad(String nacionalidad){
    this.nacionalidad = nacionalidad;
    }
    
     public String getNombre(){
    return nombre;
    
    }
    
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
    
     public String getDireccion(){
    return direccion;
    
    }
    
    public void setDireccion(String direccion){
    this.direccion = direccion;
    }
    
    
         public int getEdad(){
    return edad;
    
    }
    
    public void setEdad(int edad){
    this.edad = edad;
    }

    
         public double getSalario(){
    return salario;
    
    }
    
    public void setSalario(double salario){
    this.salario = salario;
    }

    
    
    
    
    
    
}
