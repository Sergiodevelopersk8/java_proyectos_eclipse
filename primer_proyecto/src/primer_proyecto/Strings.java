package primer_proyecto;
import java.util.Scanner;
public class Strings {

	public static void main(String [] args) {
		
		String cadena1 = "hola ";
		String cadena2 = "mundo";
		
		//concatenar
		
		String mensaje = cadena1 + cadena2;
		
		System.out.println(mensaje);		
		
		
		/* 
		 concatenar con numero
		 en este se sumara primero lo que este adentro de los ( ) y despues unira el resulatdo 
		 de la operacion con el string 
		 
		 */
		int enteroaUnir = 20;
		String textoconNumero = cadena1 + (enteroaUnir + 40);
		System.out.println(textoconNumero);
		/* concat */
		
		String pruebaconCat = "to ".concat("get ").concat("her");
		System.out.println(pruebaconCat);
		
		//contar caracteres 
		//tambien se cuenta los espacios en blanco 
		int cantidadDeCaracteres = "Sergio Merino Cortez".length();
		System.out.println("La cantidad de caracteres de mi nombre es " + cantidadDeCaracteres);
		
		
		//extraer una porcion de una cadena 
		String esposa = "mi esposa es Abby Donelli";
		/*
		 el substring solicita dos parametros en numeros que son donde empieza y hasta donde acaba en este 
		 ejemplo esposa.substring(13,25) el trece empiesa en A y sigue hasta el 25 que seria la i y forma la 
		 frace Abby Donelli 
		  */
		String extraccion = esposa.substring(13,25);
		System.out.println("la extracion es " + extraccion);
		
		//determinar si una cadena es igual a otras equals
		
		String saludo1 = "Hola Mundo!";
		String saludo2 = "Hola Sergio";
		String saludo3 = "Hola Mundo!";
		String saludo4 = "HOLA MUNDO!";
		boolean esIgual = saludo1.equals(saludo1);
		System.out.println("son iguales las cadenas " + esIgual);
		
		
		//Ignorando mayúsculas o minusculas con equalsIgnoreCase
		boolean esIgualIgnorandoMayusculas = saludo1.equalsIgnoreCase(saludo4);
			
		System.out.println("son iguales las cadenas ignorando mayusculas  " + esIgualIgnorandoMayusculas);
		
		/*devolver el indice de alguna letra detro de un  String usando indexOf*/
		
		int indice = "Mexico".indexOf("e");
		System.out.println("el indice de la palabra es " + indice);
		
		String opinion = "Uno de los paises mas bonitos es japon. japon tiene muchas cosas para ver";
		
		//primer ocurrencia
		int indiceJapon = opinion.indexOf("japon");
		
		System.out.println("el indice de la palabra es " + indiceJapon);
		
		
		/*Extraer un char apartir un indice del string usando charAt (int index)*/
		
		char letraExtraida = "Mexico".charAt(1);
		System.out.println("el indice de la palabra es " + letraExtraida);
		
		// determinar si una porcion de una cadena esta dentro de otra 
		String mensaje2 = "Hola mundo";
boolean contienepalabra = mensaje2.contains("mundo");		

System.out.println("si esta adentro de la cadena  " + contienepalabra);
		
		
//determinar si una cadena empieza con algun valor especificado

String esposafavorita = "Kiernan shipka es mi esposa favorita";
boolean ellaestufavorita = esposafavorita.startsWith("Kiernan");
System.out.println("Kiernan es tu esposa favorita ?  " + contienepalabra);

//determinar si una cadena termina con algun valor especificado

String esposaamada = " Tu esposa amada es Landry";
boolean ellaestuamada = esposaamada.endsWith("Landry");
System.out.println("Landry Bender es tu esposa amada  ?  " + ellaestuamada);


//La cadena esta vacia 
		
System.out.println("La cadena esta vacia " + ("".isEmpty()));
		
//Remplazar el contenido de un aracter por otro usando replace 		
		
String cadenaAREemplazar = "El deporte que es olimpico es hacer tik toks";
String cadenaremplazada = cadenaAREemplazar.replace("tik toks","skateboard");
System.out.println(cadenaremplazada);


		
//Remover los espacios en blanco usando trip()
String cadenaconespacios = "    Mi nombre es Sergio Merino    ";
String sinespacios = cadenaconespacios.strip();
System.out.println(sinespacios);


//Convertir todos los caracteres en minusculas 
System.out.println("HOLA MUNDO".toLowerCase());


//Convertir todos los caracteres en mayusculas
System.out.println("hola mundo".toUpperCase());
		
//valueoof convierte un numero en caracteres string
int numeros = 103;
String convertirastring = String.valueOf(numeros);
System.out.println("el numero convertido es "+ convertirastring);

		
		
		
		
		
		
	}
	
	
}
