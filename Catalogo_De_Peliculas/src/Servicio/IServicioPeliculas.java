package Servicio;

import dominio.Pelicula;



public interface IServicioPeliculas {

	/*firma de este metodo*/
	public void listarPeliculas();
	
	public void agregarPelicula(Pelicula peliculas);

	public void buscarPelicula(Pelicula pelicula);
	
	
}
