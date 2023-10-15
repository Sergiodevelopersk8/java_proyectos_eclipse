package arreglos;

public class Foreach {

public static void main (String [] args) {
	
	int [] arreglo = {87,64,94,100,83,78,85,91,76,87};
	int total = 0;
	
	
	
	 for(int i = 0; i < arreglo.length; i++) {
	 
		total  += arreglo[i];
		
		System.out.println(total);
	}

	System.out.println(total);
	
	for(int numero : arreglo) {
		total += numero;
	}
	
	System.out.println(total);
	
}
	
	
	
}
