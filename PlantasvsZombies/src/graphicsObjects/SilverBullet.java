package graphicsObjects;
import  graphicsObjects.Graphic;
import java.awt.*;
import javax.swing.ImageIcon;

public class SilverBullet extends Graphic {

	public SilverBullet(int x, int y) {
		super(x,y);
		icon = new ImageIcon(getClass().getResource("/images/silver-bullet.png"));
        imgGraphic = icon.getImage();
	}
	
	
	@Override
	public void mover() {
		xCoord += 5;
		
	}
	
	
	@Override
    public void draw(Graphics g){
     
        g.drawImage(imgGraphic, xCoord, yCoord, 30, 30, null);

    }
	
}
