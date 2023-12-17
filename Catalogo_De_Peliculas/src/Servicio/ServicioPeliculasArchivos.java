package Servicio;
import java.io.*;

import dominio.Pelicula;

public class ServicioPeliculasArchivos implements  IServicioPeliculas{

	private final String NOMBRE_ARCHIVO = "Peliculas.txt";
	
	public ServicioPeliculasArchivos(){
	var archivo = new File(NOMBRE_ARCHIVO);	
	
	try {
		
		//si existe
		if(archivo.exists()){
			System.out.println("El archivo ya existe " );
		}
		else {
			//si no existe
			var salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("Se creo el archivo" );
		}
		
	}
	catch(Exception e) {
		System.out.println("Ocurrio un error : " + e.getMessage());
	}
	
	}
	
	@Override
	public void listarPeliculas(){
		//volvemo abrir el archivo
		var archivo = new File(NOMBRE_ARCHIVO);
		
		try {
			
			System.out.println("Listado de peliculas archivo");
			//abrimos el archivo para lectura
			var entrada = new BufferedReader(new FileReader(archivo));
			//leemos linea a linea
			String linea;
			linea = entrada.readLine();
			//leemos todas las lineas
			while(linea != null){
				var pelicula = new Pelicula(linea);
				System.out.println(pelicula);
				//antes de terminar el ciclo volvemos a leer el siguiente
				linea = entrada.readLine();
			}
			
			//cerramos el archivo de entrada
			entrada.close();
		}
		catch(Exception e){
			System.out.println("Ocurrio un error :" + e.getMessage());
		}
		
	}//fin de listar
	
	
	
	@Override
	public void agregarPelicula(Pelicula pelicula){
		
	boolean anexar = false;
	var archivo = new File(NOMBRE_ARCHIVO);
	
	try {
		anexar = archivo.exists();
		var salida = new PrintWriter(new FileWriter(archivo, anexar));
		//agregar pelicula
		salida.println(pelicula);
		salida.close();
		System.out.println("se agrego la informacion de " + pelicula);
	}
	
	
	
	catch(Exception e){
		System.out.println("Ocurrio un error al agregar pelicula " + e.getMessage());
	}
		
		
	}//fin de agregar
	
	
	@Override
	public void buscarPelicula(Pelicula pelicula){
		var archivo = new File(NOMBRE_ARCHIVO);
		try {
			//abrimos el archivo
			var entrada = new BufferedReader(new FileReader(archivo));
			String lineatexto ;
			lineatexto = entrada.readLine();
			var indice = 1;
			var encontrada = false;
			var peliculaBuscar = pelicula.getNombre();
			
			while(lineatexto != null){
			//buscamos isn importar mayusculas minusculas
				if(peliculaBuscar != null && peliculaBuscar.equalsIgnoreCase(lineatexto)){
					encontrada = true;
					break;
				}
				
				// leemos la siguiente linea 
				lineatexto = entrada.readLine();
				indice++;
				}//fin while
			
			//imprimos el resultado
			if(encontrada){
				System.out.println("Pelicula " + lineatexto + "encontrada - linea" + indice);
			}
			else {
				System.out.println("no se encontro pelicula: " + pelicula.getNombre());
			}
			entrada.close();
		}
		catch(Exception e){
			System.out.println("Ocurrio un error al buscarar pelicula " + e.getMessage());
		}
	}//fin de buscar
	
	
	
	
}//fin de la clase
