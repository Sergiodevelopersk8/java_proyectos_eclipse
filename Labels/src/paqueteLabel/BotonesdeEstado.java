package paqueteLabel;

import javax.swing.*;

public class BotonesdeEstado  extends JFrame{

	public BotonesdeEstado()
	{
		JToggleButton tb = new JToggleButton("Toggle Button", true);
		tb.setBounds(100,200,250,30);
		
		JToggleButton tb2 = new JToggleButton("Toggle Button2", false);
		tb2.setBounds(100,250,250,30);
		
		
		
		
		
		ButtonGroup bg = new ButtonGroup();
		
		Mensaje("El boton esta activado  ", tb.isSelected());
		Mensaje("El boton 2 esta activado ", tb2.isSelected());
		
		add(tb);
		add(tb2);
		
		bg.add(tb);
		bg.add(tb2);
		setSize(500,500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	
		
		
		
	}
	
	
	public void Mensaje(String mensaje, Object objeto) {
		
		
		System.out.println(mensaje + " " +  objeto);
		
	}
	
	
	public static void main(String [] args) {
	
		BotonesdeEstado obj = new BotonesdeEstado();
	
	}
	
	
	
}
