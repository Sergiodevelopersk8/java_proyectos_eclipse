package Dialogos;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class DialogosC {

	public static void main(String [] args) {
		//JOptionPane.showMessageDialog(null,"operacion realizada correctament");
	//JOptionPane.showMessageDialog(null,"operacion realizada correctament","Titulo de la ventana",JOptionPane.WARNING_MESSAGE);
	String nombre = 	JOptionPane.showInputDialog("ESCRIBE TU NOMBRE");
	JOptionPane.showMessageDialog(null,"Hola " + nombre);
	
	
	}
	
	
}
