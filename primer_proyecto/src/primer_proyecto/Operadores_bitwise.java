package primer_proyecto;
import java.util.Scanner;
public class Operadores_bitwise {
	
	   
	public static void main(String [] args) {
		
		/**** BOOLEANOS *****/ 
		   int x = 0;
		   int y = 2;
		   /*aqui es false*/
		   //boolean b = (x != 0) && ((y / x) != 0);
		   
		   //aqui marca el error 
		  // boolean b = (x != 0) & ((y / x) != 0);
		   //System.out.println("El resultado es" + b);
		//operadores bitwise trabajan a nivel bitwise
		   
		   int comparacion = 5 | 3;
		   System.out.println("El resultado es " + comparacion);
	
	
	
	}
	
	   

	

}
