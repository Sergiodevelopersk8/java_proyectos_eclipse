package paqueteLabel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class Label  extends JFrame{

	
	public Label() {
		JLabel etiqueta = new JLabel(new ImageIcon("2099.jpg"));
		etiqueta.setBounds(200,200,50,20);
		
		add(etiqueta);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Label obj = new Label();
	}
	
}
