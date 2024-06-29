/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eventouno;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;
public class EventoUno extends JFrame {

    public EventoUno(){
  
    JLabel lblSaludo = new JLabel();
    lblSaludo.setBounds(25,10,200,30);
    JLabel lblInstruccion = new JLabel("Ingresa tu nombre");
    lblInstruccion.setBounds(25,165,200,30);
    JTextField campoSaludo = new JTextField(200);
    campoSaludo.setBounds(25,200,200,30);
    JButton boton = new JButton("¡Saludar");
    boton.setBounds(25,235,150,30);
    
    
    
    
      ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           lblSaludo.setText("HOLA: " + campoSaludo.getText());
        }
    };
    
    
    
    boton.addActionListener(listener);
    add(lblSaludo);
    add(lblInstruccion);
    add(campoSaludo);
    add(boton);
    setSize(400,400);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    
    
    
    }
    
    
    
    public static void main(String[] args) {
        new EventoUno();
    }
}
