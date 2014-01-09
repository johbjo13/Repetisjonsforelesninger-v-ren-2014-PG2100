package kodeSnutter;

import java.awt.Point;


public class Line {
		
	private static Point p1;
	private static Point p2;
	//Hardkodet variabel for å vise Point sin isvertical
	private int x,y;
	
	private double slope;
	
	public static void main(String[] args) {
		
		//Deklarerer to Point objekter
		Point p1 = new Point(3,2);
		Point p2 = new Point(8,9);
		
		
		//Deklarerer et Line objekt
		Line linje = new Line (p1,p2);
		
		//Viser get og tostring metodene til objektene
		System.out.println("p1 sine koordinater " + p1.toString());
		System.out.println("p2 sine koordinater " + p2.getLocation());
		System.out.println("p2 sin X = "+p2.getX());
		System.out.println("p2 sin Y "+p2.getY());
		
		System.out.println("Stigningstallet er " + linje.getSlope());
		
		
		
		//Bruker Point sit setLocation metode
		p2.setLocation(7, 10);
		
		//Oppdaterte points.
		System.out.println("p2 sine nye koordinater " + p2.toString());
		
		System.out.println("Linje sine koordinater" + linje.toString());
		
		System.out.println("Veksttallet er " + linje.getSlope());
		
		
		//Tilleggs funksjon - Hent ut lengden til linja
		
		System.out.println("Lengden på linja er: "+linje.getLineLength());
		
		
		
		
	}
	//sjekker om innsendt point sin X/Y er lik pointet den sammenligner med. Hører hjemme i klassen Point
	public boolean isVertical(Point p){
		
		return x == p.x;
	}
	public boolean isHorizontal(Point p){
		
		return y == p.y;
	}
	
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	public Line(int x1, int x2, int y1, int y2){
		p1.setLocation(x1, x1);
		p2.setLocation(x2, y2);
		
	}
	

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}
	
	public double getSlope(){
		// Beregner lengden til katetene
		double xCoord = p2.getX()-p1.getX();
		double yCoord = p2.getY()-p1.getY();
		// Kaster exception hvis det ikke er helling.
		if (p1.getX() == p2.getX()){
			
			throw new IllegalArgumentException("Slope undefined"); // aka stigningstall
		}
		else{
			// stigningsgrad
		
			slope = yCoord/xCoord;
		}
		return slope;
	}
	
	private double lineLength;
	
	public double getLineLength(){
		//punkt.distanse(punkt2) arves fra Point2D
		lineLength = p1.distance(p2);
		
		return lineLength;
	}

	public String toString() {
		return "Line [" + p1 + ", " + p2 + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		return true;
	}


	
	
	
}


