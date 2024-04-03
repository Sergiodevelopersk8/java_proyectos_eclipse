package PaquetedeSwing;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PrimerEjemploSwing extends JFrame{
	
	
	public PrimerEjemploSwing(){
		JFrame f = new JFrame();//crea una instancia de jframe
		
		JButton b = new JButton("click");//crea una instancia de JButton
		b.setBounds(130,100,100,40);//ejes x e y. ancho y alto
		
		add(b);//añade el boton
		
		setSize(400,500);//el JFrame tiene un tamaño de 400 x 500
		setLayout(null);//No usamos layouts managers
		setVisible(true);//hacemos el frame visible
		
	}
	

	public static void main (String[] args) {
		PrimerEjemploSwing objeto = new PrimerEjemploSwing();
	}
	
	
}
