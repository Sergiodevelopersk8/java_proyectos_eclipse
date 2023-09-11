package Objetos;
import java.util.Scanner;
public class ObjetoClase {
String nombre;
String color;

public static void main (String [] args) {
	ObjetoClase objetos = new ObjetoClase();
	
	ObjetoClase objeto2 = new ObjetoClase();

	
	objetos.nombre = "obj1";
	objeto2.nombre = "obj2";
	
	objetos.color = "Azul";
	objeto2.color = "Morado";
	
	
	System.out.println("el nombre del objeto 1 " + objetos.nombre);
	System.out.println("el color del objeto 1 " + objetos.color);
	
	System.out.println("el nombre del objeto 2 " + objeto2.nombre);
	System.out.println("el color del objeto 2 " + objeto2.color);	
	
}

}
