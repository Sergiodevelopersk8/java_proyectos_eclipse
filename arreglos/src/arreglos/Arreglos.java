package arreglos;

public class Arreglos {

	public static void main(String [] args) {
	
		String [] arreglo1 = new String [5];
		int [] arreglo2 = {52,51,46,1,2};
		
		arreglo1[0] = "uno";
		arreglo1[1] = "dos";
		arreglo1[2] = "tres";
		arreglo1[3] = "cuatro";
		arreglo1[4] = "cinco";
	
	/*System.out.println(arreglo1[0]);
	System.out.println(arreglo1[1]);
	System.out.println(arreglo1[2]);
	System.out.println(arreglo1[3]);
	System.out.println(arreglo1[4]);
	
	System.out.println(arreglo2[0]);
	System.out.println(arreglo2[1]);
	System.out.println(arreglo2[2]);*/
	
	System.out.println("tamaño del arreglo 2 ->  " + arreglo2.length);
	
	for(int i = 0; i < arreglo1.length; i++) {
		System.out.println(" elementos del arreglo 1 = " + arreglo1[i]);
	}
	
	for(int i = 0; i < arreglo2.length; i++) { 
		System.out.println(" elementos del arreglo 2 = " + arreglo2[i]);
	}
	
	}
	
	
}
