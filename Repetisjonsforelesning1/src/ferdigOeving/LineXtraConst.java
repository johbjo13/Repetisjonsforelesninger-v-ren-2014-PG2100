package ferdigOeving;

import java.awt.Point;

public class LineXtraConst {

	private Point p1;
	private Point p2;
	
	
	public LineXtraConst(Point p1, Point p2) {
		
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public LineXtraConst(int x1, int y1, int x2, int y2){
		
		p1 = new Point(x1,y1);
		p2 = new Point(x2,y2);
	}
	
	public Point getP1() {
		return p1;
	}
	
	public Point getP2() {
		return p2;
	}

	
	public String toString() {
		return "Line [" + p1 + ", " + p2 + "]";
	}
	
	
}
