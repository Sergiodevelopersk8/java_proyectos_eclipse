package figuras;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Figuras  extends JPanel {

	//variable para elegir que figura dibujar
private int opcion;


//el constructor va a establecer la opcion del usuario
public Figuras(int opcionUsuario) {	

	opcion = opcionUsuario;
}

public void paintComponent(Graphics g) {	

super.paintComponent(g);	

for(int i = 0; i < 10 ; i++ ) {
	switch(opcion) {
	case 1://dibujar rectangulos
		int xRect = 10 + i * 10;
		int yRect = 10 + i * 10;
		int anchoRect = 50 + i * 10;
		int altoRect = 50 + i * 10;
		g.drawRect(xRect, yRect, anchoRect, altoRect);
		break;

	case 2://dibujar ovalos
		int xOval =10 + i * 10;
		int yOval =10 + i * 10;
		int anchoOval =50 + i * 10;
		int altoOval = 50 + i * 10;
		g.drawOval(xOval, yOval, anchoOval, altoOval);
		break;

		
	}
}
}




}
