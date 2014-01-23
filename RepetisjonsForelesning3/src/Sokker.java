
public class Sokker {

	private String farge;
	private int antall;
	
	public Sokker(String farge, int antall) {
		super();
		this.farge = farge;
		this.antall = antall;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public int getAntall() {
		
		
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}
	
	

	@Override
	public String toString() {
		return "Skuffa inneholder " + getAntall()+ " sokker i fargen: " + getFarge() +"";
	}
	
	
	
}
