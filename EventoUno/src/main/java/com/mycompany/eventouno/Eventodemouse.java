/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eventouno;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Draw
 */
public class Eventodemouse extends JFrame{

    public Eventodemouse(){
    
    JLabel lblMovedX = new JLabel("Moved x: " );
    lblMovedX.setBounds(25, 10, 100, 30);
    JLabel lblMovedY = new JLabel("y: ");
    lblMovedY.setBounds(230, 10, 100, 30);
    JLabel lblDraggedX = new JLabel("Dragged x: ");
    lblDraggedX.setBounds(25, 40, 100, 30);
    JLabel lblDraggedY = new JLabel("y: ");
    lblDraggedY.setBounds(230, 40, 100, 30);
        
        
    JLabel lblSaludo = new JLabel();
    lblSaludo.setBounds(25,10,200,30);
    JLabel lblInstruccion = new JLabel("Ingresa tu nombre");
    lblInstruccion.setBounds(25,165,200,30);
    JTextField campoSaludo = new JTextField(200);
    campoSaludo.setBounds(25,200,200,30);
    JButton boton = new JButton("¡Saludar");
    boton.setBounds(25,235,150,30);
    
    
    
    
      MouseListener listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if(e.isAltDown()){
                Mensaje("alt");               
               }
               
               else if(e.isControlDown()){
               Mensaje("control");
               
               }
               else if(e.isShiftDown()){
               Mensaje("shift");
               
               }
               else if(e.isMetaDown()){
               Mensaje("click derecho");
               
               }
               else{
               Mensaje("click izquierdo");
               
               }
               
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // lblSaludo.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                 //lblSaludo.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
              // lblSaludo.setText("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblSaludo.setText("Mouse Exited");
            }

    };
    
      
      MouseWheelListener wheel = new MouseWheelListener(){
      
          @Override
          public void mouseWheelMoved(MouseWheelEvent event){
           if(event.getPreciseWheelRotation() == -1){
                    
                    Mensaje("rueda hacia arriba");
                }
                if(event.getPreciseWheelRotation() == 1){
                    Mensaje("rueda hacia abajo");
                }
          
          
          }
      
      };
      
      MouseMotionListener motionListener = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent event) {
                lblDraggedX.setText("Dragged x: "+event.getX());
                lblDraggedY.setText("y: " + event.getY());
            }

            @Override
            public void mouseMoved(MouseEvent event) {
                lblMovedX.setText("Moved x: "+event.getX());
                lblMovedY.setText("y: " + event.getY());
            }
        };
    
      
      
      
    boton.addMouseListener(listener);
    campoSaludo.addMouseListener(listener);
    campoSaludo.addMouseWheelListener(wheel);
   
      this.addMouseMotionListener(motionListener);
        
        add(lblMovedX);
        add(lblMovedY);
        add(lblDraggedX);
        add(lblDraggedY);
    
    
    
    add(lblSaludo);
    add(lblInstruccion);
    add(campoSaludo);
    add(boton);
    setSize(400,400);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    
    
    
    }
    
    public void Mensaje(String mensaje){
    
 System.out.println(mensaje);
    }
    
    

  public static void main(String[] args) {
        new Eventodemouse();
    }
    
}
