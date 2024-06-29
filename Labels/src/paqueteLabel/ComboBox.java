package paqueteLabel;
import javax.swing.*;
public class ComboBox extends JFrame{
	
	
	public ComboBox() {
		
		String [] paises = {"Mexico","Argentina","Alemania","Siza","Rusia"};
		
		JComboBox combo = new JComboBox(paises);
		combo.addItem("Venezuela");
		combo.addItem("Brasil");
		combo.setBounds(50,50,90,20);
		add(combo);
		
		setLayout(null);
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String [] args) {
		
		 ComboBox obj = new ComboBox();
		
		
	}
	
	

}
