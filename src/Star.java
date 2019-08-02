import java.awt.Graphics;
import java.awt.Polygon;

/**
 * An instance of this class will render a picture of a 
 * star, if "draw" is called on it.
 * @author User
 *
 */
public class Star {
	
	private int cx,cy,radius;

	public Star(int cx, int cy, int radius) {
		this.cx = cx;
		this.cy = cy;
		this.radius = radius;
		
	}
	
	public void draw(Graphics g)
	{
		g.fillPolygon(createBody());
	}
	
	/**
	 * Creates a polygon that will represent the star's body.
	 * @return
	 */
	private Polygon createBody(){
		Polygon poly = new Polygon();
		double baseAngle = -0.628318531/2;
		double turnFact = 0.628318531;
		int r2,r1;
		r1 = radius;
		r2 = (int)(r1 * .5);
		
		for(int i = 0; i < 10; i+=2){
			int x = 0;
			int y = 0;
			x = (int)(cx + (r1*Math.cos(baseAngle)));
			y = (int)(cy + (r1*Math.sin(baseAngle)));
		    poly.addPoint(x,y);
			baseAngle+=turnFact;
			x = 0;
			y = 0;
			
			x = (int)(cx + (r2*Math.cos(baseAngle)));
			y = (int)(cy + (r2*Math.sin(baseAngle)));
			poly.addPoint(x,y);
			baseAngle+=turnFact;
		}
		
		return poly;
		
	}

	public int getCx() {
		return cx;
	}

	public int getCy() {
		return cy;
	}

	public int getRadius() {
		return radius;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	

}
