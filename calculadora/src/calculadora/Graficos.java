package calculadora;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Graficos {

	
	public static void main (String [] args) {

		String opciones = JOptionPane.showInputDialog("Seleciona la operacion que deseas hacer " + "1)Sumar, 2)Restar, 3)Multiplicar, 4)Dividir");
		String n1 = JOptionPane.showInputDialog("Introduzca el primer numero");
		String n2 = JOptionPane.showInputDialog("Introduzca el segundo numero");
		
		
		
		
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		
		Operaciones op = new Operaciones(); 
		
		switch(opciones) {
		case "1":
			
			double suma = op.sumar(num1, num2);
			JOptionPane.showMessageDialog(null,"Suma " + suma);
			
			break;
		case "2":
			
			double resta = op.restar(num1, num2);
			JOptionPane.showMessageDialog(null,"Resta " + resta);

			break;

		case "3":
			
			double multiplicacion = op.multiplicar(num1, num2);
			JOptionPane.showMessageDialog(null,"Multiplicacion " + multiplicacion);

			break;

		case "Dividir":
			
			double divicion = op.dividir(num1, num2);
			JOptionPane.showMessageDialog(null,"Divicion " + divicion);
			
			break;
		}
		
	
		
	}
	
	
}
