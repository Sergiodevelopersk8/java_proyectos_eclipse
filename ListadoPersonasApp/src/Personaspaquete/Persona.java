package Personaspaquete;

public class Persona {

	private int id;
	private String nombre;
	private String telefono;
	private String email;
	private static int numeroPersonas = 0;
	
	//Constructor vacio
	public Persona() {
		//inicializamos el id usando this
		//incrementamos el listado
		this.id= ++Persona.numeroPersonas;;	
	}//fin del constructo vacio
	
	//Constructor con argumentos
	public Persona(String nombre,String telefono, String email){
		//llamamos el constructor vacio con this();
		this();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		
		
		
	}// final constructor con argumentos	
	

	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getTelefono() {
	return telefono;
	}
	
	
	public void setTelefono(String tel){
		this.telefono = tel;
	}
	
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	@Override
	public String toString(){
		return "Persona{ " + "id=" + id +
				", nombre='" + nombre +'\'' +
				", tel='"+ telefono + '\'' + 
				", email='" + email + '\'' + '}' ;
	}
	
	public static void main(String[] args){
		Persona persona1 = new Persona("prueba1_con_ver_personas","222222","correo@gmail.com");
		System.out.println(persona1.toString());
	}
	
}//fin de la clase
