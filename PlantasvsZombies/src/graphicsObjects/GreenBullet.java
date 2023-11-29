package graphicsObjects;
import  graphicsObjects.Graphic;
import java.awt.*;
import javax.swing.ImageIcon;

public class GreenBullet extends Graphic {

	public GreenBullet(int x, int y) {
		super(x,y);
		 icon = new ImageIcon(getClass().getResource("/images/green-bullet.png"));
        imgGraphic = icon.getImage();
	}
	
	
	@Override
	public void mover() {
		xCoord += 8;
		
	}
	
	
	@Override
    public void draw(Graphics g){
     
        g.drawImage(imgGraphic, xCoord, yCoord, 30, 30, null);
    }
	
}
