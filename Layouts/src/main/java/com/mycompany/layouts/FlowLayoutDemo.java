/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.layouts;
    import java.awt.FlowLayout;
    import javax.swing.*;



public class FlowLayoutDemo extends JFrame {
    
    private JButton botonEnviar;
    private JTextField cajaTexto;
    private JLabel etiqueta;
    
    public FlowLayoutDemo(){
        botonEnviar = new JButton("Enviar");
        cajaTexto = new JTextField(12);
        etiqueta = new JLabel("Escribe tu nombre");
        FlowLayout ventana = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(ventana);
        ventana.setHgap(20);
        ventana.setVgap(20);
        this.add(etiqueta);
        this.add(cajaTexto);
        this.add(botonEnviar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        pack();
    }
    
    public static void main(String [] args){
    
        new FlowLayoutDemo();
    
    }
    
}
