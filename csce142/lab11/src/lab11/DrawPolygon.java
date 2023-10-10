package lab11;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
public class DrawPolygon extends Shape {
	private Point[] pts;
	  public DrawPolygon(ArrayList<Shape> shapes) {
		super();
	}
	  public DrawPolygon(int x, int y){
			this(x,y,10);
		}
	public DrawPolygon(int x, int y, int i) {
	}
	public void drawTo(Graphics g) {
		g.setColor(this.color);
	
		    Polygon p = new Polygon();
		    for (int i = 0; i < 5; i++)
		      p.addPoint((int) (100 + 50 * Math.cos(i * 2 * Math.PI / 5)),
		          (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 5)));

		    g.drawPolygon(p);
		  /*  Polygon s = new Polygon();
		    for (int i = 0; i < 360; i++) {
		      double t = i / 360.0;
		      s.addPoint((int) (150 + 50 * t * Math.cos(8 * t * Math.PI)),
		          (int) (150 + 50 * t * Math.sin(8 * t * Math.PI)));
		    }
		    g.drawPolygon(s);*/
		  }
}
