package oeving2;

class Die {
	private int value;

	public Die(){
		roll(); 
	}
	public void roll(){
		value = 1 + (int)(Math.random()* 6);
	}
	public int getValue(){
		return value;
	}
	public String toString(){
		return "Terningen viser: " + value;
	}
}

