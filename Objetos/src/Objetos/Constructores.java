package Objetos;

public class Constructores {

	String nombre;
	String apellido;
	/*este es un constructor*/
	public Constructores(){
		System.out.println("soy un constructor ");
	}
	
	
	/*inicializar el constructor o variables*/
	public Constructores(String nom , String ape){
		nombre = nom;
		apellido = ape;
	}
	
	
	public Constructores(int a, int b){
		int suma = a + b;
		System.out.println("la suma es  " + suma);
	}
	
	public Constructores(final Constructores objConstructores){
		
	nombre = objConstructores.nombre;	
	apellido =	objConstructores.apellido;
		
	}
	
	
	
	
	public static void main(String [] args) {
		
		
		Constructores obj = new Constructores();
		Constructores obj1 = new Constructores(5,6);
		Constructores obj2 = new Constructores("Sergio","Merino");
		Constructores obj3 = new Constructores(obj2);
		System.out.println("que trae el obj3 pues es una copia de obj2 del constructor  " + obj3.nombre + " " + obj3.apellido);
	
	}
	
}
