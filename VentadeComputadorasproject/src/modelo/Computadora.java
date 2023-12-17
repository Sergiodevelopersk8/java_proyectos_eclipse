package modelo;
import modelo.Monitor;
import modelo.Teclado;
import modelo.Raton;
public class Computadora {

	
	private int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputadoras;
	
	private Computadora(){
		idComputadora = ++contadorComputadoras;
	}
	
	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}

	@Override
	public String toString() {
		return "Computadora [idComputadora=" + idComputadora + ",\n nombre=" + nombre + ",\n monitor=" + monitor
				+ ",\n teclado=" + teclado + ",\n raton=" + raton + "]";
	}
	
	
	
}
