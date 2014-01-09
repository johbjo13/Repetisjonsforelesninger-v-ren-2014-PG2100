package aktivtKodetIforelesning;

import java.awt.Point;

public class Line {

	// attributter
	
	private Point p1;
	private Point p2;
	
	
	// konstruktør to points
	
	public Line (Point p1, Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	public Line (){
		
		p1 = 4;
		p2 = 4;
		
	}
	
	
	//get p1
	
	public Point getP1(){
		
		return p1;
	}
	
	// get p2
	
	public Point getP2(){
		
		return p2;
	}
	
	// tostring
	
	public String toString() {
		return "Line [" + p1 + ", " + p2 + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
