package conversiones;

import javax.swing.JOptionPane;

public class ConvercioNumerosCadenas {

public static void main(String []args) {
		
//números a cadenas de caracteres		
		
	
	int i = 5;
	byte o = 10;
	short a = 60;
	double d = 25.4;
	float f = 9.63f;
	
	String sI = "" + i;
	String sB = Byte.toString(o);
	String sO = String.valueOf(d);
	String sS = Double.toString(d) ;
	String sD = Short.toString(a) ;
	String sF = String.valueOf(f) ;
	
	//caracteres a números

	String valor = JOptionPane.showInputDialog("introduzca un número: ");
	int valor1 = Integer.parseInt(valor);
	int suma = valor1 + 5;
	System.out.println("la suma de tu número es : " + suma);
	
		
		
	}	
	
	
	
}
