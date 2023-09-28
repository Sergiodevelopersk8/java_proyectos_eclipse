package sobrecarga;
import java.util.Scanner;

/*
 
  Clase que muestra  como funciona los metodos sobre cargados
  
  
  
 * */

public class Sobrecargados {

	
	public void sumar() {
		System.out.println("este metodo no recibe parametros ");
	}
	
public void sumar(int x , int y) {
		System.out.println("este metodo recibe dos numeros");	
		
}
	
public void sumar(int x ) {
	System.out.println("este metodo recibe un entero");	
	
}	
	

public void sumar(double x ) {
	System.out.println("este metodo recibe un decimal");	
	
}



public static void main(String [] args) {
Sobrecargados sobrec = new Sobrecargados();


sobrec.sumar(2.2);
		
}




}
