package herencia;

public class Sobreescritura2 extends Sobreescritura {

	public String toString() {
		return "Adios";
	}
	
	
	public static void main(String [] args) {
		
		Sobreescritura2 obj = new Sobreescritura2();
		
		System.out.println(obj.toString());
		
	}
	
	
}
