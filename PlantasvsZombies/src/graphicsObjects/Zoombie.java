package graphicsObjects;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
public class Zoombie extends Graphic {

    public Zoombie(int x , int y){
        //herencia de la clase graphic
    	super(x,y);
    	icon = new ImageIcon(getClass().getResource("/images/Plants-vs-Zombies-2-14.jpg"));
        imgGraphic = icon.getImage();
    }

    @Override
    public void mover(){
        xCoord -= 3;
    }
    @Override
    public void draw(Graphics g){
     
        g.drawImage(imgGraphic, xCoord, yCoord, 80, 110, null);

    }




}
