package arreglos;
import java.util.ArrayList;




public class Colecciones {


	public static void main (String [] args) {
		
		ArrayList<String> array = new ArrayList<String>(); 
		
		/*añadir elementos mediante el metodo add*/
		array.add("rojo");
		array.add("verde");
		array.add("azul");
		
		/*limpiar elementos con el metodo clear*/
		
		//array.clear();
		
		
		for(String elemento : array) {
			System.out.println("valor: " + elemento);
		}
		
		
		/*el contains devuelve un booleano esto es para buscar*/
		
		if(array.contains("verde")) {
			System.out.println("si tengo el elemento verde ");
		}
		
	}


}
