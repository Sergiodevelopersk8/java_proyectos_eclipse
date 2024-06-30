/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.layouts;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 *
 * @author Draw
 */
public class BorderLayoutDemo extends JFrame{
    //variables y comtenedores
    private JLabel etiquetaSu;
    private JPanel panelIzquierdo, panelDerecho, panelInferior;
    private JButton botonIz1, botonIz2, botonIz3;
    private JButton botonDe1, botonDe2, botonDe3;
    private JButton    botonIn1, botonIn2;
    private JScrollPane scroll;
    
    public void contruyePanelIzquierdo(){
        panelIzquierdo = new JPanel();
        botonIz1=new JButton("Izq1");
        botonIz2=new JButton("Izq2");
        botonIz3=new JButton("Izq3");
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo,BoxLayout.Y_AXIS));
        panelIzquierdo.setBackground(Color.red);
        panelIzquierdo.add(botonIz1);
        panelIzquierdo.add(botonIz2);
        panelIzquierdo.add(botonIz3);
    }

    public void contruyePanelDerecho(){
        panelDerecho = new JPanel();
        botonDe1=new JButton("Der1");
        botonDe2=new JButton("Der2");
        botonDe3=new JButton("Der3");
        panelDerecho.setLayout(new BoxLayout(panelDerecho,BoxLayout.Y_AXIS));
        panelDerecho.setBackground(Color.blue);
        panelDerecho.add(botonDe1);
        panelDerecho.add(botonDe2);
        panelDerecho.add(botonDe3);
    }

    public void contruyePanelInferior(){
        panelInferior = new JPanel();
        botonIn1=new JButton("Aceptar");
        botonIn2=new JButton("Cancelar");
        panelInferior.setLayout(new FlowLayout());
        panelInferior.setBackground(Color.green);
        panelInferior.add(botonIn1);
        panelInferior.add(botonIn2);
    }
    
    public BorderLayoutDemo(){
    
        contruyePanelDerecho();
        contruyePanelInferior();
        contruyePanelIzquierdo();
        
        scroll = new JScrollPane(new JTextArea("JTextArea", 10, 15));
        etiquetaSu = new JLabel("Demostración BorderLayout");
        this.setLayout(new BorderLayout());
        
        this.add(etiquetaSu,BorderLayout.NORTH);
        this.add(scroll, BorderLayout.CENTER);
        this.add(panelIzquierdo,BorderLayout.WEST);
        this.add(panelDerecho,BorderLayout.EAST);
        this.add(panelInferior,BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        pack();
    }
    
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
