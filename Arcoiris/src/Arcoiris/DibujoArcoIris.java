package Arcoiris;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
public class DibujoArcoIris extends JPanel{

	

final Color VIOLETA = new Color(128,0,128);
final Color INDIGO = new Color(75,0,130);
		
		
		
Color[] colores = {Color.WHITE,Color.WHITE, Color.BLUE, VIOLETA,INDIGO,Color.GREEN, Color.YELLOW,Color.ORANGE,Color.RED};
		
		
public DibujoArcoIris() {
	setBackground(Color.WHITE);
}		 
		 
		 public void paintComponent(Graphics g) {
			 super.paintComponent(g);
			 
			 int radio = 20;
			 
			 int centroX = getWidth() / 2;
			 int centroY = getHeight() - 10;
			 
			 for(int contador = colores.length; contador > 0; contador -- ) {

				 g.setColor(colores[contador - 1]);
				 
				 int valorX = centroX - contador * radio;
				 int valorY = centroY - contador * radio;
				 int ancho = contador * radio * 2 ;
				 int alto = contador * radio * 2 ;
				 
				 
				 g.fillArc(valorX, valorY, ancho, alto, 0, 180);
				 
			 }
			 
		 }
			 
			 
		 


}
 
	
	

