package mundopc;
import modelo.Raton;
import modelo.Teclado;
import modelo.Monitor;
import modelo.Computadora;
import Servicio.Orden;

public class VentaComputadorasApp {

	public static void main(String [] args) {
		//crear objetos
		
		Raton ratonLenovo = new Raton("bluetooth","Lenovo");
		Teclado tecladoLenovo = new Teclado("bluetooth","Lenovo");
		Monitor monitorLenovo = new Monitor("Lenovo",27);
		//crear un objeto de tipo Computadora
		Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo,tecladoLenovo,ratonLenovo);	

		Monitor monitorDell = new Monitor("Dell",15);
		Teclado tecladoDell = new Teclado("usb","Dell");
		Raton ratonDell = new Raton("usb","Dell");
		Computadora computadoraDell = new Computadora("Computadora Dell",monitorDell,tecladoDell,ratonDell);
		
		Monitor monitorMac = new Monitor("Mac",27);
		Teclado tecladoMac = new Teclado("Bluetooth","Mac");
		Raton ratonMac = new Raton("Bluetooth","Mac");
		Computadora computadoraMac = new Computadora("Computadora Mac",monitorMac,tecladoMac,ratonMac);
		
		
		//creamos una orden
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraLenovo);
		orden1.agregarComputadora(computadoraDell);
		orden1.agregarComputadora(computadoraMac);
		orden1.mostrarOrden();

		
		
		
		
		
	}
	
	
}
