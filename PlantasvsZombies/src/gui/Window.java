package gui;
import gui.VisualManager;
import javax.swing.JFrame;


public class Window {

public Window() {
	
	JFrame ventana = new JFrame();
	ventana.add(new VisualManager());
	ventana.setSize(1000, 700);
	ventana.setVisible(true);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
}	


public static void main(String [] args) {
	Window ventana = new Window();
}
	
	
}
