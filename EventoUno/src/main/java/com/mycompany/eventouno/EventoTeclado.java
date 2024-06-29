/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventouno;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Draw
 */
public class EventoTeclado extends JFrame{
    
    public EventoTeclado(){
      
        JLabel lblInstruccion = new JLabel("Ingresa tu nombre: ");
        lblInstruccion.setBounds(25, 165, 500, 30);
        JTextField campoSaludo = new JTextField(200);
        campoSaludo.setBounds(25, 200, 200, 30);
        JButton boton = new JButton("¡Saludar!");
        boton.setBounds(25, 235, 150, 30);

        KeyListener keyL = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent event) {
                
            }

            @Override
            public void keyPressed(KeyEvent event) {
                if(event.getKeyCode()== KeyEvent.VK_ENTER){
                    System.out.println("Has presionado enter");
                }
                if(event.getKeyCode()== KeyEvent.VK_F1){
                    System.out.println("f1");
                }
                if(event.getKeyCode() == KeyEvent.VK_A){
                    System.out.println("presionaste la letra a");
                }
            }

            @Override
            public void keyReleased(KeyEvent event) {

            }
        };
        
        campoSaludo.addKeyListener(keyL);
        add(lblInstruccion);
        add(campoSaludo);
        add(boton);
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    
    }
    
     public static void main(String[] args) {
        new EventoTeclado();
    }
}
