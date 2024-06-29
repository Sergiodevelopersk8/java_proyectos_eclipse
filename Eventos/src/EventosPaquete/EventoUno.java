/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventosPaquete;
import javax.swing.*;
import javax.swing.JLabel;
/**
 *
 * @author Draw
 */
public class EventoUno {
    
public EventoUno(){

    	JLabel lblSaludo = new JLabel("Hola");
		lblSaludo.setBounds(25,10,50,30);
		
		JLabel lblInstruccion = new JLabel("Ingresa tu nombre");
		lblInstruccion.setBounds(25,165,200,30);
		JTextField campoSaludo = new JTextField(200);
		campoSaludo.setBounds(25,235,150,30);
		JButton boton = new JButton("Saludar");
		boton.setBounds(25,235,150,30);
		
		add(lblSaludo);
		add(lblInstruccion);
		add(campoSaludo);
		add(boton);
		setSize(400,400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



}


}
