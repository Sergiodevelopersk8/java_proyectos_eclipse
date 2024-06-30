/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.layouts;
import javax.swing.BoxLayout;
import javax.swing.*;
import java.awt.FlowLayout;


public class BoxLayoutDemo extends JFrame {

     private JPanel panelSuperior, panelMedio, panelInferior;
    private JLabel etiqueta1, etiqueta2, etiqueta3;
    private JTextField cajaTexto;
    private JPasswordField cajaPass;
    private JButton botonAceptar, botonCancelar;

    public void construyePanelSuperior(){
        panelSuperior =new JPanel();
        etiqueta2= new JLabel("Usuario");
        cajaTexto = new JTextField(10);
        panelSuperior.setLayout(new FlowLayout());
        panelSuperior.add(etiqueta2);
        panelSuperior.add(cajaTexto);
    }
    
    public void construyePanelMedio(){
        panelMedio=new JPanel();
        etiqueta3= new JLabel("Password");
        cajaPass = new JPasswordField(10);
        panelMedio.setLayout(new FlowLayout());
        panelMedio.add(etiqueta3);
        panelMedio.add(cajaPass);
    }
    
    public void construyePanelInferior(){
        panelInferior=new JPanel();
        botonAceptar=new JButton("Aceptar");
        botonCancelar=new JButton("Cancelar");
        panelInferior.setLayout(new FlowLayout());
        panelInferior.add(botonAceptar);
        panelInferior.add(botonCancelar);
    }
    
    
    public BoxLayoutDemo(){

   JLabel etiqueta = new JLabel("Login de usuario");
        construyePanelSuperior();
        construyePanelMedio();
        construyePanelInferior();
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.add(etiqueta);
        this.add(panelSuperior);
        this.add(panelMedio);
        this.add(panelInferior);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
 
    }
    
    
    
    public static void main (String [] args){
    
    new BoxLayoutDemo();
    }
    
    
    
    
    
    
    
}
