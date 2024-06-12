package Paquetebotones;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class Botones extends JFrame{

	public Botones() {
	JButton b = new JButton(new ImageIcon("2099.jpg"));
	
	System.out.print("El icono es  " + b);
	
	
	b.setBounds(100,100,250,200);
	
	add(b);
	setSize(500,500);
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
	
	}
	
	
	
	
	public static void main(String [] args) {
		
		Botones obj = new Botones();
		
		
	}
	
	
	
	
}
