package Objetos;
import java.util.Scanner;
public class Metodos_retorno {






/*
 * eSTE METODO VAS A REALIZAR LA LECTURA DE LOS NUMEROS  
 */

public  void leerNumeros(int n1, int n2) {


	//ojeto para el escanear 
	/*System.out.println("Escribe el primer numero ");
	numero1 = sc.nextInt();
	System.out.println("Escribe el segundo numero ");
	numero2 = sc.nextInt();*/
	
	
	int suma =   sumar(n1,n2);
	int resta = restar(n1,n2);
	int multiplica = multiplicar(n1,n2);
	int divide = dividir(n1,n2);
	Imprimir(suma,resta,multiplica,divide);
	
}


public int sumar(int numero1, int numero2) {
	int sumar = numero1 + numero2;
return sumar;
	
	
}

public int restar(int numero1, int numero2) {
	int restar = numero1 - numero2;

	return restar;
	
	
}

public int multiplicar(int numero1, int numero2) {
	
	int multiplicar = numero1 * numero2;
		
	return multiplicar;
	
}

public int dividir(int numero1, int numero2) {
	
	int dividir = numero1 / numero2;
	
	return dividir;
	
}

public void Imprimir(int suma, int resta, int division, int multiplicacion) {
	System.out.println("Resulatdo de la suma " + suma);
	System.out.println("Resulatdo de la resta " + resta);
	System.out.println("Resulatdo de la division " + division);
	System.out.println("Resulatdo de la multiplicacion " + multiplicacion);
	
}


public static void main (String [] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Con retorno ");
	System.out.println("Introduce el primer numero ");
	int n1 = sc.nextInt();
	System.out.println("Introduce el segundo numero  ");
	int n2 = sc.nextInt();
	Operaciones op = new Operaciones();	
	
	op.leerNumeros(n1,n2);
	
			
	
	
}
	
	
}
