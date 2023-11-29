package plantasvszombies;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;



public class AdminV {

	private ArrayList <ObjetoGrafico> listaFiguras;
	
	public AdminV() {

	listaFiguras = new ArrayList<ObjetoGrafico>();
	listaFiguras.add(new BalaPlata("Plata1"));	
	listaFiguras.add(new BalaPlata("Plata2"));
	listaFiguras.add(new BalaPlata("Plata3"));
	listaFiguras.add(new BalaVerde("Verde1"));
	listaFiguras.add(new Zoombie("Jake"));
	listaFiguras.add(new Zoombie("Hernan"));
	listaFiguras.add(new Zoombie("Peter"));
	listaFiguras.add(new BalaVerde("Verde2"));
	
	TimerTask timertask = new TimerTask() {
		@Override
		public void run()
		{
		moverFiguras();	
		}
		};
		
		Timer t = new Timer();
		t.schedule(timertask, 0, 5000);
	
	}
	
	
	public void moverFiguras() {
		
		for(ObjetoGrafico og: listaFiguras) {
			og.mover();
		}
		System.out.println("-----------------------------------------------");
	}
	
	public static void main(String [] args) {
		
		AdminV admin = new AdminV();
		
	}
	
}
