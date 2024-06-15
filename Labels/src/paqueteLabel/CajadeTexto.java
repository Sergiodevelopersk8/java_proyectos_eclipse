package paqueteLabel;
import paqueteLabel.Mensaje;

import javax.swing.*;



public class CajadeTexto extends JFrame {

	Mensaje msj = new Mensaje();
	
	public CajadeTexto(){
		JTextField campo = new JTextField();
		campo.setBounds(100,100,150,20);
		
		msj.MostratMensaje("EL valor del texto es ", campo.getText());
		add(campo);
		setSize(300,300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String [] args) {
		
		
		CajadeTexto  obj = new CajadeTexto();
		
		
	}
	
}
