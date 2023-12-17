package Nominapaquete;

public abstract class Empleado {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	
	//constructor con tres argumentos
	public Empleado(String nombre, String apellido, String nss) {
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
	}//fin del constructor
	
	//Establece el primer nombre
	public void setPrimerNombre(String nombre) {
		
		primerNombre = nombre;
	}
	
	
	//devuelve el primer nombre
	public String getPrimerNombre() {
		
		return primerNombre;
		
	}
	
	
	public void setApellidoPaterno(String apellido) {
		apellidoPaterno = apellido;
	}
	
	
	public String getPrimerApellido() {
		return apellidoPaterno;
	}
	
	
	public void setNumeroSeguroSocial(String nss){
		numeroSeguroSocial = nss;
	}
	
	
	public String getNumeroSeguroSocial(){
		return numeroSeguroSocial;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s %s\numero de seguro social: %s", 
				getPrimerNombre(), getPrimerApellido(),
				getNumeroSeguroSocial());
	}
	

	//método abstracto que debe ser sobrescribir por subclases
	public abstract double ingreso();
	
	
}// fin de la clase abstracta
