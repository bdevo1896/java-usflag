import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Running this class as a Java Applet will render a
 * picture of the Texas flag.
 * @author User
 *
 */
public class Flag extends JApplet{

	private static final long serialVersionUID = 1L;
	private static final int POSX = 0,POSY = 0,HEIGHT = 600,WIDTH = 900;
	
	@Override
	public void init()
	{
		
	}
	
	@Override 
	public void paint(Graphics g)
	{
		
		//Draws a black background.
		g.setColor(Color.black);
		g.fillRect(POSX, POSY, WIDTH+1, HEIGHT+1);
		//Draws blue part of flag.
		g.setColor(new Color(56,107,184));
		g.fillRect(POSX+1,POSY+1,WIDTH/3,HEIGHT-1);
		
		//Draws white part of flag.
		g.setColor(Color.white);
		g.fillRect((WIDTH/3)+1, 1, 2*(WIDTH/3)-1, (HEIGHT/2)-1);
		
		//Draws red part of flag.
		g.setColor(Color.red);
		g.fillRect((WIDTH/3)+1, HEIGHT/2, 2*(WIDTH/3)-1, (HEIGHT/2));
		
		//Draws star on the flag.
		Star star = new Star((WIDTH/3)/2,(HEIGHT/2)-1,((WIDTH/3))/3);
		g.setColor(Color.white);
		star.draw(g);
	}

}
