package Encuesta;



/*
 se pidió a 20 estudiantes que califiquen la calidad de la comida en la cafeteria
 estudiantil en una escuela de 1 a 5 en donde 1 significa pesimo y 5 segnifica excelente 
 coloque las 20 respuestas en un arreglo entero y detrmine la frecuencia de cada calificacion   
 
*/

import javax.swing.JOptionPane;
public class EncuestaEstudiantes {

public static void main (String [] args) {

	// arreglo de la respuesta de estudiantes lo mas comun introduzcan en 
	//tiempo de ejecución
	
	//int [] respuestas = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
	int [] respuestas = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2};
	
	//arreglo de contadores de frecuencias 
	
	int [] frecuencia = new int[6];
	
	//para cada respuesta seleccione un elemento de respuesta y usa el valor 
	//como indice de frecuencia para determinar el elemento a insertar
	
	
for(int respuesta = 0; respuesta < respuestas.length; respuesta++) {
	
	try {
frecuencia[respuestas[respuesta] ] += 1;
	}
	catch(ArrayIndexOutOfBoundsException e) {
		JOptionPane.showMessageDialog(null, "Valor incorrecto: " + respuestas[respuesta]);
	}
	
}
	System.out.printf("%s %10s\n", "Calificacion", "Frecuencia");
	
	for(int calificacion = 1; calificacion < frecuencia.length; calificacion++)
	{
		System.out.printf("%6d %10d\n", calificacion, frecuencia[calificacion]);
	}	
		
	}
	
	
}
