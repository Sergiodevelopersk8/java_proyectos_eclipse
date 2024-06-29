package paqueteLabel;
import javax.swing.*;
import javax.swing.table.*;


public class Tablas extends JFrame{

	public Tablas(){
		
		super("tablas");
		
		DefaultTableModel modelo = new DefaultTableModel();
		JTable tabla = new JTable(modelo);
		JScrollPane scroll = new JScrollPane(tabla);
		modelo.addColumn("Nombre");
		modelo.addColumn("Direccion");
		modelo.addColumn("Edad");
		modelo.addColumn("Telefono");
		
		
		
	
		
		
		 String[][] personas = {
		            {"Sergio Merino", "Puebla", "26", "25252"},
		            {"Abigail Donelli", "Los Angeles", "22", "123"},
		            {"Kiernan Shipka", "Los Angeles", "25", "345"},
		            {"Landry Bender", "Los Angeles", "24", "678"},
		            {"Kiernan Shipka", "Los Angeles", "25", "345"},
		            {"Landry Bender", "Los Angeles", "24", "678"},
		            {"Kiernan Shipka", "Los Angeles", "25", "345"},
		            {"Landry Bender", "Los Angeles", "24", "678"},
		            {"Kiernan Shipka", "Los Angeles", "25", "345"},
		            {"Landry Bender", "Los Angeles", "24", "678"},
		            {"Kiernan Shipka", "Los Angeles", "25", "345"},
		            {"Abigail Donelli", "Los Angeles", "22", "123"},
		            {"Landry Bender", "Los Angeles", "24", "678"},
		            {"Landry Bender", "Los Angeles", "24", "678"},
		            {"Abigail Donelli", "Los Angeles", "22", "123"},
		            {"Landry Bender", "Los Angeles", "24", "678"},
		            {"Abigail Donelli", "Los Angeles", "22", "123"},
		            {"Landry Bender", "Los Angeles", "24", "678"},
		            {"Landry Bender", "Los Angeles", "24", "678"},
		            {"Landry Bender", "Los Angeles", "24", "678"},
		            {"Landry Bender", "Los Angeles", "24", "678"},
		            {"Landry Bender", "Los Angeles", "24", "678"}
		        };

		        tabla.setBounds(10, 20, 500, 500);
		        add(scroll);

		        scroll.setBounds(10, 20, 500, 500);

		        // Iterar sobre el array bidimensional y agregar cada persona al modelo de la tabla
		        for (int i = 0; i < personas.length; i++) {
		            modelo.addRow(personas[i]);
		        }
		tabla.setBounds(10,20,500,500);
		add(scroll);
	
		scroll.setBounds(10,20,500,200);
		
	

		
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		
		
		
	}
	
	
	public static void main(String [] args){
		
		Tablas obj = new Tablas();
		
	}
	
	
	
}
