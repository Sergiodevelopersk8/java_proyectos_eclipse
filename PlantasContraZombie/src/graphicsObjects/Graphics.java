package graphicsObjects;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Graphics {
	protected Image imgGraphic;
	protected ImageIcon icon;
	protected int xCoord;
	protected int yCoord;
	
	
	//constructor
	public Graphics (int x, int y) {
		xCoord = x;
		yCoord = y;
	}
	
	
	public void mover() {
	xCoord = 10;	
	}
	
	public void draw(Graphics g) {
		
	//Graphics2D g2 = (Graphics2D)g;
	
	if(imgGraphic != null) {
		
		//g2.drawImage(imgGraphic, xCoord, yCoord, 80, 100, null);
		
	}
	
	}
}
