package dominio;

import java.util.*;

public class Pelicula {
private String nombre;

public Pelicula(){}


public Pelicula(String nombre){
	this.nombre = nombre;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public boolean equals(Object o){
	if(this == o) {
		return true;
	}
	if(o == null || getClass() != o.getClass()){
		return false;
	}
	
	//esto es un cast de pelicula para el objeto que es o
	Pelicula pelicula = (Pelicula) o;
	
	//importamos java.util.* para los objects
	return Objects.equals(nombre, pelicula.nombre);
	
}


@Override

public int hashCode(){
	
	if(nombre != null){
		return nombre.hashCode();
	}
	else {
		return 0;
	}
	
	/*
	 * ternario
	 return nombre != null ? nombre.hashCode() : 0;
	 * */
}


@Override
public String toString() {
	return this.nombre ;
}

public static void main(String [] args) {
	var pelicula0 = new Pelicula("Kiernan shipka");
	var pelicula1 = new Pelicula("Abigail donelly");
	System.out.println(pelicula0);
	System.out.println(pelicula1);
	
}


}