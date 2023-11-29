package plantasvszombies;

public class BalaVerde extends ObjetoGrafico{

	
	String nombre;
	
	//constructor con parametros
	public BalaVerde(String nom) {
		
		nombre = nom;
		
	}
	
	
	@Override
	public void mover() {
		System.out.println("Movimientos de la bala verde yo me llamo" + nombre);
	}
	
	
	
}
