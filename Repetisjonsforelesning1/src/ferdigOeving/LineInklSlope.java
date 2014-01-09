package ferdigOeving;

import java.awt.Point;

public class LineInklSlope {

	private Point p1;
	private Point p2;
	private double slope;
	
	public LineInklSlope(Point p1, Point p2) {
		
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Point getP1() {
		return p1;
	}
	
	public Point getP2() {
		return p2;
	}

	public double getSlope(){
		// Beregner lengden til katetene
		double xCoord = p2.getX()-p1.getX(); // 8-4
		double yCoord = p2.getY()-p1.getY();
		
		// Kaster exception hvis det ikke er helling.
		if (p1.getX() == p2.getX()){
			
			throw new IllegalArgumentException("Slope undefined");
		}
		else{
			// Stigningstallet er 
		
			slope = yCoord/xCoord;
		}
		return slope;
	}
	
	public String toString() {
		return "Line [" + p1 + ", " + p2 + "]";
	}
	
	
}
