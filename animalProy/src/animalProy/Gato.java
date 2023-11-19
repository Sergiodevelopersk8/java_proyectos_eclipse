package animalProy;

public class Gato extends Mamifero {

	public static void main(String [] args) {
		Gato g = new Gato(); 
		//System.out.println("El gato es : " + g);
		
		//upcasting hacia arriba
		
	     Mamifero m = g;
		
		//System.out.println("El mamifero es  : " + m);
	
		/*uncasting directo*/
		
		//Mamifero m = new Gato();

		Gato g1 = new Gato();
		
		Gato a =  g1;
		
		if(a instanceof Gato) {
			
			System.out.println("Puedes hacer la conversion con toda la confianza ");
			//casteado
			Gato g2 = (Gato)a;
			
		}
		
		
		
		
	}
	
	
}
