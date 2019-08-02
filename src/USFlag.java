import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

/**
 * Running this class as a JApplett will paint a picture of
 * the U.S. Flag.
 * @author Bryce DeVaughn
 *
 */
public class USFlag extends JApplet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static int POSX = 50,POSY = 50,HEIGHT = 200, WIDTH = (int) (HEIGHT * 1.9);
	
	public void init(){
		
	}
	
	/**
	 * This function will draw out 13 stripes for the flag.
	 * @param g
	 */
	public void drawStripes(Graphics g){
		
		for(int i = 0; i < 13; i++){
			if(i % 2 == 0){
				//Draws a red stripe.
				g.setColor(new Color(215,40,57));
				g.fillRect(POSX,POSY+((HEIGHT/13)*i),WIDTH,HEIGHT/13);
			} else{
				//Draws a white stripe.
				g.setColor(Color.white);
				g.fillRect(POSX,POSY+((HEIGHT/13)*i),WIDTH,HEIGHT/13);
			}
		}
	}
	
	/**
	 * This function will draw the union. This includes the
	 * blue region of it and will then draw out the 50 
	 * stars included on it.
	 * @param g
	 */
	public void drawUnion(Graphics g){
		int unionWidth = (int) (HEIGHT*.76);
		int unionHeight = (HEIGHT/13)*7;
		g.setColor(new Color(56,107,184));
		g.fillRect(POSX, POSY, unionWidth,unionHeight);
		
		//This 'int' will be used to space the stars apart from each other on X-Axis.
		int starSpaceX = (int) (unionWidth/6);
		//This 'int' will be used to space the stars apart from each other on Y-Axis.
		int starSpaceY = (int) (unionHeight/9);
		//This 'int' will be the starting point of the even row of stars.
		int startPointEven = POSX+((int) (unionWidth/12));
		//This 'int' will be the starting point of the odd row of stars.
		int startPointOdd = POSX+starSpaceX;
		//This 'int' will be where the row of stars start on the Y-Axis.
		int startPointY = POSY + (starSpaceY/2) + 2;
		//This will be the radius of each star.
		int starRad = (int) ((4*(HEIGHT/13)/5)/2);
		
		g.setColor(Color.white);
		
		//This loop of nested loops will create and draw out the rows of 50 stars.
		for(int i = 0; i < 9; i++){
			if(i % 2 == 0){
				//Draws a row of 6 stars.
				for(int k = 0; k < 6; k++){
					Star s = new Star(startPointEven+(starSpaceX*k),startPointY+(starSpaceY*i),starRad);
					s.draw(g);
				}
			} else{
				//Draws a row of 5 stars.
				for(int k = 0; k < 5; k++){
					Star s = new Star(startPointOdd+(starSpaceX*k),startPointY+(starSpaceY*i),starRad);
					s.draw(g);
				}
			}
		}
	}
	
	public void paint(Graphics g){
		drawStripes(g);
		drawUnion(g);
	}
	
	
}
