package paqueteLabel;
import java.awt.Color;
import javax.swing.*;

public class AreadeTexto extends JFrame{

	public AreadeTexto(){
		
		JTextArea area = new JTextArea(300,300);
		
		area.setBounds(10,30,300,300);
		area.setBackground(Color.black);
		area.setForeground(Color.MAGENTA);
		add(area);
		setSize(380,380);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	public static void main(String [] args) {
	
		AreadeTexto area = new AreadeTexto();
	
	}
	
	
	
}
