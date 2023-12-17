package calculadora_consola_paquete;
import java.util.*;

public class OperacionesConsola {

	
	
public static void 	main(String [] args){
	
	Scanner consola = new Scanner(System.in);
	System.out.printf("****Aplicacion de Calculadora****\n"
			+ "1.Suma\n"
			+ "2.Resta\n"
			+ "3.Multiplicacion\n"
			+ "4.Division\n"
			+ "5.Salir\n"	);
	System.out.printf("operacion a realizar\n");
	var opciones = Integer.parseInt(consola.nextLine());
	System.out.printf("Ingresa el primer numero\n");
var numero1 = Double.parseDouble(consola.nextLine());
System.out.printf("Ingresa el primer numero\n");
var numero2 = Double.parseDouble(consola.nextLine());

double resultado = 0.0;	
	
	
	
	switch (opciones){
	case 1 ->{
		 resultado = numero1 + numero2;

			System.out.println("Reseultado " + resultado );
	}	
	
	case 2 ->{
		resultado = numero1 - numero2;
		System.out.println("Reseultado " + resultado );
	}
	case 3 ->{
		resultado = numero1 * numero2;
		System.out.println("Reseultado " + resultado );
	}
	
	case 4 ->{
		resultado = numero1 / numero2;
		System.out.println("Reseultado " + resultado );
	}
	case 5 ->{
		
		System.out.println("Finalizando"  );
	}
	
	
	
	}
	
	
}
	
	
}
