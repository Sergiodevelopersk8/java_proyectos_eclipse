package calculadora;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Graficos {

	
	public static void main (String [] args) {
		try {
			boolean ciclo = true;
			while(ciclo) {
				String opciones = JOptionPane.showInputDialog("Seleciona la operacion que deseas hacer\n " + "1)Sumar, 2)Restar,\n 3)Multiplicar, 4)Dividir\n 5)salir");
				String n1 ="";
				String n2 ="";
				double num1 = 0.0;
				double num2 = 0.0;
				int	elegido=Integer.parseInt(opciones);
			
				if(elegido == 5) {
					JOptionPane.showMessageDialog(null,"Hasta pronto " );
					ciclo = false;
				
				}
				else {
					n1 = JOptionPane.showInputDialog("Introduzca el primer numero");
					n2 = JOptionPane.showInputDialog("Introduzca el segundo numero");	
					num1 = Double.parseDouble(n1);
					num2 = Double.parseDouble(n2);
				}
				
				
				
				
				
				
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
					

				case "4":
					
					double divicion = op.dividir(num1, num2);
					JOptionPane.showMessageDialog(null,"Divicion " + divicion);
					break;
					
				} //fin de switch
				
				
				
				
			} //final de while
			
		}//final de try
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"El error " + e.getMessage() );
		}//final de catch

	
		
	} //final de main
	
	
} //final de la clase
