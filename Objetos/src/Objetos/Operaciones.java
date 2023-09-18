package Objetos;
import java.util.Scanner;

public class Operaciones {
	
int sumar;
int restar;
int multiplicar;
int dividir;




/*
 * eSTE METODO VAS A REALIZAR LA LECTURA DE LOS NUMEROS  
 */

public  void leerNumeros(int n1, int n2) {


	//ojeto para el escanear 
	/*System.out.println("Escribe el primer numero ");
	numero1 = sc.nextInt();
	System.out.println("Escribe el segundo numero ");
	numero2 = sc.nextInt();*/
	
	
	  sumar(n1,n2);
	restar(n1,n2);
	multiplicar(n1,n2);
	dividir(n1,n2);
	Imprimir();
	
}


public void sumar(int numero1, int numero2) {
	sumar = numero1 + numero2;

	
	
}

public void restar(int numero1, int numero2) {
	restar = numero1 - numero2;

	
	
	
}

public void multiplicar(int numero1, int numero2) {
	
	multiplicar = numero1 * numero2;
		
	
	
}

public void dividir(int numero1, int numero2) {
	
	dividir = numero1 / numero2;
	
	
	
}

public void Imprimir() {
	System.out.println("Resultado de la suma " + sumar);
	System.out.println("Resultado de la restar " + restar);
	System.out.println("Resultado de la multiplicacion " + multiplicar);
	System.out.println("Resultado de la divicion " + dividir);
}


public static void main (String [] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el primer numero ");
	int n1 = sc.nextInt();
	System.out.println("Introduce el segundo numero  ");
	int n2 = sc.nextInt();
	Operaciones op = new Operaciones();	
	
	op.leerNumeros(n1,n2);
	
			
	
	
}

}
