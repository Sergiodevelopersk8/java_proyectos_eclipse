package plantasvszombies;

public class Zoombie extends ObjetoGrafico{

	String nombre;
	
	public Zoombie(String nom) {
		nombre = nom;
	}
	
	
	@Override
	public void mover() {
		System.out.println("Movimientos de zombie yo me llamo" + nombre);
	}
	
	
	
}
