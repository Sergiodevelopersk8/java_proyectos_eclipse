package figuras;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaFiguras {

public static void main (String [] args) {
	
	//opcion de usuario
	
	String entrada = JOptionPane.showInputDialog("Escribe 1 para dibujar rectangulos \n Escriba 2 para dibujar ovalos");
	
	int opcion = Integer.parseInt(entrada);
	

	Figuras fig = new Figuras(opcion);
	
	JFrame ventana = new JFrame();
	
	ventana.add(fig);
	
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ventana.setSize(300,300);
	ventana.setVisible(true);
	
	
}
	
	
	
}
