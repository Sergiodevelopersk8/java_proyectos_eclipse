package paqueteLabel;

import javax.swing.*;
import javax.swing.DefaultComboBoxModel;

public class Ventana extends JFrame {

	public Ventana() {
		
		DefaultComboBoxModel modelo = new DefaultComboBoxModel();
		JComboBox combo = new JComboBox(modelo);
		
		combo.setBounds(100,100,300,40);
		
	Persona persona1 = new Persona();
	Persona persona2 = new Persona();
	Persona persona3 = new Persona();

	
	persona1.setDireccion("Puebla");
	persona1.setEdad(26);
	persona1.setNacionalidad("Mexicano");
	persona1.setNombre("Sergio");
	
	persona2.setDireccion("Los Angeles");
	persona2.setEdad(22);
	persona2.setNacionalidad("Estadunidense");
	persona2.setNombre("Abigail Donelly");
	
	persona3.setDireccion("Los Angeles");
	persona3.setEdad(24);
	persona3.setNacionalidad("Estadunidense");
	persona3.setNombre("Landry Bender");
	
	modelo.addElement(persona1);
	modelo.addElement(persona2);
	modelo.addElement(persona3);
	
	
	
	
		add(combo);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
	}
	
	
	
	public static void main(String [] args) {
		
		new Ventana();
		
		
	}
	
	
	
}
