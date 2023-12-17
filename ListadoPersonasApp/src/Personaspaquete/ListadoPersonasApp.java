package Personaspaquete;
import java.util.*;
public class ListadoPersonasApp {

	public static void main(String [] args) {

		Scanner consola = new Scanner(System.in);
		
		//definimos la lista fuera del ciclo while
		List<Persona> personas = new ArrayList<>();
		//Empezamos con el menu
		var salir = false;
		while(!salir){
			mostrarMenu();
			try {
				salir = ejecutarOperacion(consola, personas);	
			}
			catch(Exception e) {
				System.out.println("Ocurrio un error: " + e.getMessage());
			}
			
			
			System.out.println();
		}//fin del while
		
	
	}//fin del main

private static void mostrarMenu(){
	//mostrar el menu
	System.out.printf("****Listado de personas App****\n 1.Agregar\n 2.Listar\n 3.Salir ");
	System.out.print("selecciona una opción ");
} // final de la funcion mostrarmenu

private static Boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
	var opcion = Integer.parseInt(consola.nextLine());
	var salir  = false;
	
	//verificamos la opcion proporcionada
	switch(opcion) {
	case 1 ->{
			System.out.print("Proporciona el nombre: ");
			var nombre = consola.nextLine();
			System.out.print("Proporciona el telefono: ");
			var tel = consola.nextLine();
			System.out.print("Proporciona el email: ");
			var email = consola.nextLine();
			//Crear el objeto persona
			var persona = new Persona(nombre, tel, email);
			//lo agregamos a la lista
			personas.add(persona);
			System.out.println("La lista tiene: " + personas.size() + " elementos");
		} //fin del caso 1
	
	case 2 ->{
		System.out.println("Listado de personas: ");
		//mejora usando lamba y metodos de referencia
		//personas.forEach((persona)-> System.out.println(persona));
		//metodo de referencia uando ::
		personas.forEach(System.out::println);
		
				
	}
	
	case 3 ->{
		System.out.println("Hasta pronto... ");
		salir = true;
	}
	default ->{
		System.out.println("Opcion invalida ");
	}
	}//fin del switch
	return salir;
	} 





}//fin de la clase


