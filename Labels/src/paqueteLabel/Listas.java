package paqueteLabel;

import javax.swing.*;


public class Listas extends JFrame{

	public Listas() {
		DefaultListModel<Persona> modelo = new DefaultListModel<Persona>();
		
		JList lista = new JList(modelo);
		
		lista.setBounds(10, 10, 200, 300);
		
		
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		modelo.addElement(new Persona("Sergio Merino","calle y numero","2024"));
		
		JScrollPane scroll = new JScrollPane(lista);
		scroll.setBounds(10,10,200,250);
		add(scroll);
		setSize(300,500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}


public static void main(String [] args){
	
new Listas();
	
}
	
	
	
}

