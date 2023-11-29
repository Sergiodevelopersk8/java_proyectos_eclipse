package plantasvszombies;

public class BalaPlata extends ObjetoGrafico{
String nombre;

public BalaPlata(String nom) {
	
	nombre = nom;

}

@Override
public void mover() {
	System.out.println("Movimientos de la bala plata yo me llamo" + nombre);
}





}
