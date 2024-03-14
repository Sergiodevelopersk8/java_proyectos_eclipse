package UsoThis;
import UsoThis.Clase2;
public class This {

	int variable = 5;
	Clase2 obj2 = new Clase2();
	/*se puede utilizar this para invocar un metodo de la propia misma clase*/
	/*el this puede invocar el constructor de una clase */
	
	
	public This() {
		/*aqui se esta invocando el constructor con parmetros
		 
		 cuando se invoca un constructor dentro de otro constructor debe ser lo primerom 
		 que se invoque 
		 
		 */
		this("Sergio");
		System.out.println("Constructor sin parametros");
	}
	
	public This(String nombre) {
		System.out.println("El nombre es " + nombre);
	}
	
	public void metodo(int variable) {
		
		/*el thois hace referencia a la instacia propiamente en este caso es this.variable*/
		System.out.println("El valor de elavariable es: " + this.variable );
		
	}
	
	public void metodo2() {
		obj2.metodo(10);
		/*llamar el meto de mi clase con el el this*/
		this.metodo(20);
	}
	
	
	/*utilizar this como argumento dentro d eun metodo*/
	public void metodo3(This obj) {
		
	}
	
	
	public void metodo4() {
		this.metodo3(this);
	}
	
	
	public static void main (String [] args) {
		
		This obj = new This();
		obj.metodo2();
		
		
		
	}
	
	
	
}
