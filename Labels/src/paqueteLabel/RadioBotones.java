package paqueteLabel;


import javax.swing.*;


public class RadioBotones extends JFrame{

public RadioBotones() {

	JRadioButton radio = new JRadioButton("Opcion1" , true);
	JRadioButton radio2 = new JRadioButton("Opcion2" , false);

	radio.setBounds(50,100,170,30);
	radio2.setBounds(50,150	,170, 30);
	
	ButtonGroup bg = new ButtonGroup();
	
	bg.add(radio);
	bg.add(radio2);
	
	
	add(radio);
	add(radio2);
	
	
	setSize(300,300);
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
			
}	
	
	

public static void main(String [] args) {
	
	
	RadioBotones obj = new RadioBotones();
	
}


	
	
}
