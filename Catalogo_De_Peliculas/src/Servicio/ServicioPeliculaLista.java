package Servicio;
import java.util.*;
import dominio.Pelicula;
import Servicio.IServicioPeliculas;


public class ServicioPeliculaLista implements IServicioPeliculas{

	private final List<Pelicula>peliculas;
	
	public ServicioPeliculaLista(){
		this.peliculas = new ArrayList<>();
	}
	
	
	@Override
	public void listarPeliculas(){
		System.out.println("Listado de peliculas");
		peliculas.forEach(System.out::println);
		
		
		
	}//final de ListarPeliculas
	
	
	
	@Override
	public void agregarPelicula(Pelicula pelicula){
		
		peliculas.add(pelicula);
		System.out.println("Se agrego la pelicula: " + pelicula);
		
		
		
	}//final de agregarPelicula
	
	
	@Override
	public void buscarPelicula(Pelicula pelicula){
		//regresa el indice de la pelicula encontrada en la lista
		
		var indice = peliculas.indexOf(pelicula);
	if(indice == -1) {
		System.out.println("No se encontro la pelicula: " + pelicula );
	}
	
	else {
		
		System.out.println("Pelicula encontrada en el indice: " + indice);
	}
	
	
	}//final de buscarPelicula
	
	
	
	
	public static void main(String [] args){
		//Creamos objetos de tipo pelicula
		var pelicula1 = new Pelicula("la pension");
		var pelicula2 = new Pelicula("fedelobo");
		//creamos el servicio (patron de diseño service)
		IServicioPeliculas serviciopeliculas = new ServicioPeliculaLista();
		
		//agregamos las peliculasa la lista
		serviciopeliculas.agregarPelicula(pelicula1);
		serviciopeliculas.agregarPelicula(pelicula2);
		//Listamos las peliculas
		serviciopeliculas.listarPeliculas();
		/*
		 Buscamos la pelicula
		 se debe implementar el metodo equals y hashCode*/
		serviciopeliculas.buscarPelicula(pelicula2);
		serviciopeliculas.buscarPelicula(new Pelicula("developer"));
		
	}
	
}//final de la clase
