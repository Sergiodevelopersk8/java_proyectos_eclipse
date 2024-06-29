/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfasneatbeans;

/**
 *
 * @author Draw
 */
public class Persona {
    
    public Persona(String nom, String apell, String direc, String mail, String tel){
        
        this.nombre = nom;
        this.apellidos = apell;
        this.direccion = direc;
        this.email = mail;
        this.telefono = tel;
        
    }
    
    
    
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    @Override
    public String toString(){
    return this.nombre + " " + this.apellidos;
    
    }
    
    
    
}
